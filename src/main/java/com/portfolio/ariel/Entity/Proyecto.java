package com.portfolio.ariel.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private int desdeE;
    private int hastaE;
    private String imgE;

    public Proyecto() {
    }

    public Proyecto(String nombreE, String descripcionE,int desdeE,int hastaE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.desdeE = desdeE;
        this.hastaE = hastaE;
        this.imgE = imgE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    
    
    

