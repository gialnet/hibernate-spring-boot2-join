package com.gialnet.questions.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
//@Table(name = "QUESTIONS")
public class Questions implements Serializable {


    //@Column(name = "questions_id")
    private Long id;
    private String nombre;

    private List<Direcciones> direcciones;

    public Questions() {
    }

    @Id
    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "questions")
    @OneToMany(mappedBy = "questions", cascade = CascadeType.ALL, targetEntity = Direcciones.class)
    public List<Direcciones> getDirecciones() {
        return this.direcciones;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirecciones(List<Direcciones> direcciones) {
        this.direcciones = direcciones;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Questions)) return false;
        final Questions other = (Questions) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$nombre = this.getNombre();
        final Object other$nombre = other.getNombre();
        if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
        final Object this$direcciones = this.getDirecciones();
        final Object other$direcciones = other.getDirecciones();
        if (this$direcciones == null ? other$direcciones != null : !this$direcciones.equals(other$direcciones))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $nombre = this.getNombre();
        result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
        final Object $direcciones = this.getDirecciones();
        result = result * PRIME + ($direcciones == null ? 43 : $direcciones.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Questions;
    }

    public String toString() {
        return "Questions(id=" + this.getId() + ", nombre=" + this.getNombre() + ", direcciones=" + this.getDirecciones() + ")";
    }
}
