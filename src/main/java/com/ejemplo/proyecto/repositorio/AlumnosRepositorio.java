package com.ejemplo.proyecto.repositorio;

import com.ejemplo.proyecto.DTO.AlumnosDTO;
import com.ejemplo.proyecto.entidad.Alumnos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chihiro
 */
@Repository
public interface AlumnosRepositorio extends JpaRepository <Alumnos, Integer> {
    @Query(value = "SELECT * FROM alumnos", nativeQuery = true)
    List<Alumnos> obtenAlumnos();
    
    @Query(value = "SELECT * FROM alumnos WHERE id_alumno = :alumno_id", nativeQuery = true)
    Alumnos obtenUnAlumno(@Param("alumno_id") Integer alumno_id);
    
    @Query(value = "SELECT new com.ejemplo.proyecto.DTO.AlumnosDTO(id_alumno, nombre, edad) FROM Alumnos")
    List<AlumnosDTO> obtenAlumnosDTO();

    @Query(value = "SELECT id_alumno, nombre, edad FROM alumnos", nativeQuery = true)
    List<Object> obtenAlumnosObject();
}
