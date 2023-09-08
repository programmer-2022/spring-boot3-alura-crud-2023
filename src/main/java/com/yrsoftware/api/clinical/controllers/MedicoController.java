package com.yrsoftware.api.clinical.controllers;


import com.yrsoftware.api.clinical.dtos.ListaMedicosDTO;
import com.yrsoftware.api.clinical.dtos.MedicoDTO;
import com.yrsoftware.api.clinical.services.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public Page<ListaMedicosDTO> findAll(Pageable pagination) {
        return this.medicoService.findAll(pagination);
    }

    @PostMapping
    public String create(@RequestBody @Valid MedicoDTO medicoDTO) {
        return this.medicoService.create(medicoDTO);
    }

}
