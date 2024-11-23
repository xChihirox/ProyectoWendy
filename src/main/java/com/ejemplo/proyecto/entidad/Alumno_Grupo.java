package com.ejemplo.proyecto.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "alumno_grupo")
@Entity
public class Alumno_Grupo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id_alumno_grupo;
    private Integer alumnos_id;
    private Integer grupos_id;
    private Integer estatus;

    public Alumno_Grupo() {
        super();
    }
    
    public Alumno_Grupo(Integer id_alumno_grupo, Integer alumnos_id, Integer grupos_id, Integer estatus) {
        this.id_alumno_grupo = id_alumno_grupo;
        this.alumnos_id = alumnos_id;
        this.grupos_id = grupos_id;
        this.estatus = estatus;
    }

    public Integer getId_alumno_grupo() {
        return id_alumno_grupo;
    }

    public void setId_alumno_grupo(Integer id_alumno_grupo) {
        this.id_alumno_grupo = id_alumno_grupo;
    }

    public Integer getAlumnos_id() {
        return alumnos_id;
    }

    public void setAlumnos_id(Integer alumnos_id) {
        this.alumnos_id = alumnos_id;
    }

    public Integer getGrupos_id() {
        return grupos_id;
    }

    public void setGrupos_id(Integer grupos_id) {
        this.grupos_id = grupos_id;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
    
}
