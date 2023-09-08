package com.yrsoftware.api.clinical.mappers;

import com.yrsoftware.api.clinical.dtos.MedicoDTO;
import com.yrsoftware.api.clinical.models.Medico;

public class MedicoDtoToEntity {

    public static Medico getValue(MedicoDTO medicoDTO) {
        return new Medico(
            1L,
            medicoDTO.nombre(),
            medicoDTO.email(),
            medicoDTO.telefono(),
            medicoDTO.documento(),
            medicoDTO.especialidad(),
            medicoDTO.direccion()
        );

    }
}
