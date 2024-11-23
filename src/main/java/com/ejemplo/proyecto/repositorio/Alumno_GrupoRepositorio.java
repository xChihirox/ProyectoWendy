package com.ejemplo.proyecto.repositorio;

import com.ejemplo.proyecto.entidad.Alumno_Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Alumno_GrupoRepositorio extends JpaRepository <Alumno_Grupo, Integer> {
    
}
