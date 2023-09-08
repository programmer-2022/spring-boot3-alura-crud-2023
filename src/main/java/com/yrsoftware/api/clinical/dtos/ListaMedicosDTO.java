package com.yrsoftware.api.clinical.dtos;

import com.yrsoftware.api.clinical.models.Medico;

public record ListaMedicosDTO(

    String nombre,

    String especialidad,

    String documento,

    String email

) {

    public ListaMedicosDTO(Medico medico) {
        this(
            medico.getNombre(),
            medico.getEspecialidad().toString(),
            medico.getDocumento(),
            medico.getEmail()
            );
    }
}
