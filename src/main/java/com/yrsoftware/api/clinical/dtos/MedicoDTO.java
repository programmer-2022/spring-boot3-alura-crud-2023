package com.yrsoftware.api.clinical.dtos;

import com.yrsoftware.api.clinical.models.Direccion;
import com.yrsoftware.api.clinical.models.Especialidad;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record MedicoDTO(

    @NotBlank
    String nombre,

    @NotBlank @Email
    String email,

    @NotBlank
    String telefono,

    @NotBlank @Pattern(regexp = "\\d{4,6}")
    String documento,

    @NotNull
    Especialidad especialidad,

    @NotNull
    @Valid
    Direccion direccion

) { }
