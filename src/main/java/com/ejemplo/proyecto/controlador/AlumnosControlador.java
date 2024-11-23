package com.ejemplo.proyecto.controlador;

import com.ejemplo.proyecto.DTO.AlumnosDTO;
import com.ejemplo.proyecto.entidad.Alumno_Grupo;
import com.ejemplo.proyecto.entidad.Alumnos;
import com.ejemplo.proyecto.servicio.AlumnosServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Chihiro
 */

@RestController
@RequestMapping("/alumnos") //Busca, regresa un string
public class AlumnosControlador {
    
    @Autowired //Inyeccion de dependencias
    private AlumnosServicio alumnosServicio;
    
    @GetMapping("/listarAlumnos") //Obtener la lista de usuarios
    public ResponseEntity<List<Alumnos>> getAlumnos(){
        try{
            List<Alumnos> alumnos = alumnosServicio.listarAlumnos();
            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
    
    @PostMapping("/guardarAlumnos") //Obtener la lista de usuarios
    public ResponseEntity<Alumnos> crearAlumno(@RequestBody Alumnos alumnos){
        try{
            Alumnos resultado = alumnosServicio.guardarAlumnos(alumnos);
            return new ResponseEntity<>(resultado, HttpStatus.CREATED); //Devuelve el usuario creado
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
    
    @GetMapping("/listarAlumnosGrupo") //Obtener la lista de usuarios
    public ResponseEntity<List<Alumno_Grupo>> getAlumnosGrupo(){
        try{
            List<Alumno_Grupo> alumnos = alumnosServicio.listarAlumnosGrupo();
            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
    
    @GetMapping(value = "/obtenUnAlumno/{alumno_id}")
    public ResponseEntity<Alumnos> getUnAlumno(@PathVariable Integer alumno_id){
        try{
            Alumnos alumnos = alumnosServicio.listarUnAlumno(alumno_id);
            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
    
    @GetMapping(value = "/obtenAlumnosDTO")
    public ResponseEntity<List<AlumnosDTO>> getAlumnosDTO() {
        try{
            List<AlumnosDTO> alumnos = alumnosServicio.listarAlumnosDTO();
            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
    
    @PostMapping("/guardarAlumnosDTO")
    public ResponseEntity<Alumnos> crearAlumnoDTO(@RequestBody AlumnosDTO alumnos){
        try{
            Alumnos resultado = alumnosServicio.guardarAlumnosDTO(alumnos);
            return new ResponseEntity<>(resultado, HttpStatus.CREATED); //Devuelve el usuario creado
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
    
    @GetMapping("/listarAlumnosObject") //Obtener la lista
    public ResponseEntity<List<Object>> getAlumnosObject(){
        try{
            List<Object> alumnos = alumnosServicio.listarAlumnosObject();
            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
}
