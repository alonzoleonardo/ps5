package com.miempresa.petagram.pojo;

import java.io.Serializable;
import java.util.Date;

public class Mascota implements Serializable {
    private int id;
    private int foto;
    private String nombreMascota;
    private int numeroLikes;
    private Date fechaUltimoLike;

    public Mascota(){

    }

    public Mascota(int foto, String nombreMascota, int numeroLikes, Date fechaUltimoLike) {
        this.foto = foto;
        this.nombreMascota = nombreMascota;
        this.numeroLikes = numeroLikes;
        this.fechaUltimoLike = fechaUltimoLike;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(int numeroLikes) {
        this.numeroLikes = numeroLikes;
    }

    public Date getFechaUltimoLike() {
        return fechaUltimoLike;
    }

    public void setFechaUltimoLike(Date fechaUltimoLike) {
        this.fechaUltimoLike = fechaUltimoLike;
    }
}
