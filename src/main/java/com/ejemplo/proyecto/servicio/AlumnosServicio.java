package com.ejemplo.proyecto.servicio;

import com.ejemplo.proyecto.DTO.AlumnosDTO;
import com.ejemplo.proyecto.entidad.Alumno_Grupo;
import com.ejemplo.proyecto.entidad.Alumnos;
import java.util.List;

/**
 *
 * @author Chihiro
 */
public interface AlumnosServicio {
    
    public List<Alumnos> listarAlumnos();
    
    public Alumnos guardarAlumnos(Alumnos alumnos);
    
    public List<Alumno_Grupo> listarAlumnosGrupo();
    
    public Alumnos listarUnAlumno(Integer id_alumno);
    
    /* Ejemplo DTO */
    public List<AlumnosDTO> listarAlumnosDTO();
    
    public Alumnos guardarAlumnosDTO(AlumnosDTO alumnos);
    
    public List<Object> listarAlumnosObject();
}
