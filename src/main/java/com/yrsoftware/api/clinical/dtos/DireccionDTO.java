package com.yrsoftware.api.clinical.dtos;

import jakarta.validation.constraints.NotBlank;

public record DireccionDTO(

    @NotBlank
    String calle,

    @NotBlank
    Integer numero,

    @NotBlank
    String complemento,

    @NotBlank
    String distrito,

    @NotBlank
    String ciudad

) { }
