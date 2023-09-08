package com.yrsoftware.api.clinical.services;

import com.yrsoftware.api.clinical.dtos.ListaMedicosDTO;
import com.yrsoftware.api.clinical.dtos.MedicoDTO;
import com.yrsoftware.api.clinical.mappers.MedicoDtoToEntity;
import com.yrsoftware.api.clinical.models.Medico;
import com.yrsoftware.api.clinical.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Page<ListaMedicosDTO> findAll(Pageable pagination) {
        return this.medicoRepository.findAll(pagination)
            .map(ListaMedicosDTO::new);
    }

    public String create(MedicoDTO medicoDTO) {
        Medico newMedico = MedicoDtoToEntity.getValue((medicoDTO));
        this.medicoRepository.save(newMedico);
        return newMedico.toString();
    }
}
