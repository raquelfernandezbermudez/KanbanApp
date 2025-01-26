package com.Raquel.KanbanApp;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;

    private String nombreEstado;

    @OneToMany(mappedBy = "estado")
    private Set<Tarea> tareas;

    // Constructores
    public Estado() {
    }

    public Estado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    // Getters y Setters
    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public Set<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Set<Tarea> tareas) {
        this.tareas = tareas;
    }
}
