package com.logicbig.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONFIGURATION")
public class Configuration {
    @Id
    @Column(name = "PROPIEDAD")
    private String propiedad;
    @Column(name = "VALOR")
    private String valor;

    public Configuration() {
    }

    public Configuration(String propiedad, String valor) {
        this.propiedad = propiedad;
        this.valor = valor;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Configuration [propiedad = " + propiedad + ", valor = " + valor + "]";
    }
}