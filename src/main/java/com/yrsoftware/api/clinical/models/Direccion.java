package com.yrsoftware.api.clinical.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    private String calle;
    private Integer numero;
    private String complemento;
    private String distrito;
    private String ciudad;
}
