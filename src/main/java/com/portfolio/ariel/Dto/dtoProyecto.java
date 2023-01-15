package com.portfolio.ariel.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    @NotBlank
    private int desdeE;
    
    @NotBlank
    private int hastaE;
    
    private String imgE;

    
    public dtoProyecto() {
    }

    public dtoProyecto(String nombreE, String descripcionE,int desdeE,int hastaE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.desdeE = desdeE;
        this.hastaE = hastaE;
        this.imgE = imgE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public int getDesdeE() {
        return desdeE;
    }

    public void setDesdeE(int desdeE) {
        this.desdeE = desdeE;
    }

    public int getHastaE() {
        return hastaE;
    }

    public void setHastaE(int hastaE) {
        this.hastaE = hastaE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }
    
    
}