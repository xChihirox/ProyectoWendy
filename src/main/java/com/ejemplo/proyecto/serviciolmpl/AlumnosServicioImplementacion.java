package com.ejemplo.proyecto.serviciolmpl;

import com.ejemplo.proyecto.DTO.AlumnosDTO;
import com.ejemplo.proyecto.entidad.Alumno_Grupo;
import com.ejemplo.proyecto.entidad.Alumnos;
import com.ejemplo.proyecto.repositorio.Alumno_GrupoRepositorio;
import com.ejemplo.proyecto.repositorio.AlumnosRepositorio;
import com.ejemplo.proyecto.servicio.AlumnosServicio;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AlumnosServicioImplementacion implements AlumnosServicio {

    @Autowired //Inyeccion de dependencias
    private AlumnosRepositorio alumnosRepositorio;
    
    @Autowired //Inyeccion de dependencias
    private Alumno_GrupoRepositorio alumno_GrupoRepositorio;
    
    @Override //Sobreescribiendo de la clase padre
    public List<Alumnos> listarAlumnos() {
        return alumnosRepositorio.obtenAlumnos(); //Regresa la lista de alumnos
    }
    
    @Override
    public Alumnos guardarAlumnos(Alumnos alumnos){
        Alumnos alumno = new Alumnos();
        
        alumno.setNombre(alumnos.getNombre());
        alumno.setApellido_paterno(alumnos.getApellido_paterno());
        alumno.setApellido_materno(alumnos.getApellido_materno());
        alumno.setEdad(alumnos.getEdad());
        alumno.setGenero(alumnos.getGenero());
        
        return alumnosRepositorio.save(alumno);
    }

    @Override
    public List<Alumno_Grupo> listarAlumnosGrupo() {
            return alumno_GrupoRepositorio.findAll();
    }

    @Override
    public Alumnos listarUnAlumno(Integer id_alumno) {
        return alumnosRepositorio.obtenUnAlumno(id_alumno);
    }
    
    /* Ejemplo con DTO */
    @Override
    public List<AlumnosDTO> listarAlumnosDTO() {
        return alumnosRepositorio.obtenAlumnosDTO();
    }

    @Override
    public Alumnos guardarAlumnosDTO(AlumnosDTO alumnos) {
        Alumnos a = new Alumnos();
        a.setNombre(alumnos.getNombre());
        a.setEdad(alumnos.getEdad());

        return alumnosRepositorio.save(a);
    }

    @Override
    public List<Object> listarAlumnosObject() {
        return alumnosRepositorio.obtenAlumnosObject();
    }

}
