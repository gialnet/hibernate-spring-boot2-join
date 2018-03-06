package com.gialnet.questions.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Direcciones implements Serializable {


    private Long id;

    private Long questions_id;
    private String nombre;
    private String poblacion;

    private Questions questions;

    public Direcciones() {
    }

    @Id
    public Long getId() {
        return this.id;
    }

    public Long getQuestions_id() {
        return this.questions_id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPoblacion() {
        return this.poblacion;
    }

    @ManyToOne(fetch = FetchType.LAZY,optional=false, targetEntity = Questions.class)
    @JoinColumn(name = "questions_id", insertable = false, updatable = false)
    public Questions getQuestions() {
        return this.questions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestions_id(Long questions_id) {
        this.questions_id = questions_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Direcciones)) return false;
        final Direcciones other = (Direcciones) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$questions_id = this.getQuestions_id();
        final Object other$questions_id = other.getQuestions_id();
        if (this$questions_id == null ? other$questions_id != null : !this$questions_id.equals(other$questions_id))
            return false;
        final Object this$nombre = this.getNombre();
        final Object other$nombre = other.getNombre();
        if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
        final Object this$poblacion = this.getPoblacion();
        final Object other$poblacion = other.getPoblacion();
        if (this$poblacion == null ? other$poblacion != null : !this$poblacion.equals(other$poblacion)) return false;
        final Object this$questions = this.getQuestions();
        final Object other$questions = other.getQuestions();
        if (this$questions == null ? other$questions != null : !this$questions.equals(other$questions)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $questions_id = this.getQuestions_id();
        result = result * PRIME + ($questions_id == null ? 43 : $questions_id.hashCode());
        final Object $nombre = this.getNombre();
        result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
        final Object $poblacion = this.getPoblacion();
        result = result * PRIME + ($poblacion == null ? 43 : $poblacion.hashCode());
        final Object $questions = this.getQuestions();
        result = result * PRIME + ($questions == null ? 43 : $questions.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Direcciones;
    }

    public String toString() {
        return "Direcciones(id=" + this.getId() + ", questions_id=" + this.getQuestions_id() + ", nombre=" + this.getNombre() + ", poblacion=" + this.getPoblacion() + ", questions=" + this.getQuestions() + ")";
    }
}
