//
package capaNegocio;

import capaPersistencia.AlumnoDAO;
import java.util.*;
import javax.persistence.PersistenceException;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Alumno {

	Collection<Prestamo> prestamo;
	private int id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String run;
	private String matricula;
	private String estado;
	private String password;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return this.apellido_paterno;
	}

	/**
	 * 
	 * @param apellido_paterno
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return this.apellido_materno;
	}

	/**
	 * 
	 * @param apellido_materno
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getRun() {
		return this.run;
	}

	/**
	 * 
	 * @param run
	 */
	public void setRun(String run) {
		this.run = run;
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
        
        public String getNombreCompleto(){
            return nombre+" "+apellido_paterno+" "+apellido_materno; 
       }
        public String exist() throws PersistentException{
           PersistentTransaction t = capaPersistencia.GestiondePrestamosPersistentManager.instance().getSession().beginTransaction();
           try{
               
                List<bibliotecaufro.Alumno> alumnos=bibliotecaufro.AlumnoDAO.queryAlumno("matricula='"+matricula+"'",null);
                //SELECT * FROM Customers WHERE Country='Mexico';
                if(alumnos.isEmpty()){
                    return "no hay alumno";
                }else{
                    if(alumnos.get(0).getPassword().equals(password)){
                        nombre=alumnos.get(0).getNombre();
                        apellido_paterno=alumnos.get(0).getApellido_paterno();
                        apellido_materno=alumnos.get(0).getApellido_materno();
                        return "exito login";
                    }else{
                        return "password incorrecto";
                    }
                }
                
     
            }catch(Exception e){
                t.rollback();
                return e.toString();
            }
            
        }
        
        private String getLibros() throws PersistentException{
            String str="";
            prestamo=bibliotecaufro.PrestamoDAO.queryPrestamo("matricula='"+matricula+"'",null);
            
            
            for(int i=0; i<prestamo.size();i++){
            
            }
                
               
            
            return str;
        }
    }package capaNegocio;

import capaPersistencia.AlumnoDAO;
import java.util.*;
import javax.persistence.PersistenceException;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Alumno {

	Collection<Prestamo> prestamo;
	private int id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String run;
	private String matricula;
	private String estado;
	private String password;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return this.apellido_paterno;
	}

	/**
	 * 
	 * @param apellido_paterno
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return this.apellido_materno;
	}

	/**
	 * 
	 * @param apellido_materno
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getRun() {
		return this.run;
	}

	/**
	 * 
	 * @param run
	 */
	public void setRun(String run) {
		this.run = run;
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
        
        public String getNombreCompleto(){
            return nombre+" "+apellido_paterno+" "+apellido_materno; 
       }
        public String exist() throws PersistentException{
           PersistentTransaction t = capaPersistencia.GestiondePrestamosPersistentManager.instance().getSession().beginTransaction();
           try{
               
                List<bibliotecaufro.Alumno> alumnos=bibliotecaufro.AlumnoDAO.queryAlumno("matricula='"+matricula+"'",null);
                //SELECT * FROM Customers WHERE Country='Mexico';
                if(alumnos.isEmpty()){
                    return "no hay alumno";
                }else{
                    if(alumnos.get(0).getPassword().equals(password)){
                        nombre=alumnos.get(0).getNombre();
                        apellido_paterno=alumnos.get(0).getApellido_paterno();
                        apellido_materno=alumnos.get(0).getApellido_materno();
                        return "exito login";
                    }else{
                        return "password incorrecto";
                    }
                }
                
     
            }catch(Exception e){
                t.rollback();
                return e.toString();
            }
            
        }
        
        private String getLibros() throws PersistentException{
            String str="";
            prestamo=bibliotecaufro.PrestamoDAO.queryPrestamo("matricula='"+matricula+"'",null);
            
            
            for(int i=0; i<prestamo.size();i++){
            
            }
                
               
            
            return str;
        }
    }package capaNegocio;

import capaPersistencia.AlumnoDAO;
import java.util.*;
import javax.persistence.PersistenceException;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Alumno {

	Collection<Prestamo> prestamo;
	private int id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String run;
	private String matricula;
	private String estado;
	private String password;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return this.apellido_paterno;
	}

	/**
	 * 
	 * @param apellido_paterno
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return this.apellido_materno;
	}

	/**
	 * 
	 * @param apellido_materno
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getRun() {
		return this.run;
	}

	/**
	 * 
	 * @param run
	 */
	public void setRun(String run) {
		this.run = run;
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
        
        public String getNombreCompleto(){
            return nombre+" "+apellido_paterno+" "+apellido_materno; 
       }
        public String exist() throws PersistentException{
           PersistentTransaction t = capaPersistencia.GestiondePrestamosPersistentManager.instance().getSession().beginTransaction();
           try{
               
                List<bibliotecaufro.Alumno> alumnos=bibliotecaufro.AlumnoDAO.queryAlumno("matricula='"+matricula+"'",null);
                //SELECT * FROM Customers WHERE Country='Mexico';
                if(alumnos.isEmpty()){
                    return "no hay alumno";
                }else{
                    if(alumnos.get(0).getPassword().equals(password)){
                        nombre=alumnos.get(0).getNombre();
                        apellido_paterno=alumnos.get(0).getApellido_paterno();
                        apellido_materno=alumnos.get(0).getApellido_materno();
                        return "exito login";
                    }else{
                        return "password incorrecto";
                    }
                }
                
     
            }catch(Exception e){
                t.rollback();
                return e.toString();
            }
            
        }
        
        private String getLibros() throws PersistentException{
            String str="";
            prestamo=bibliotecaufro.PrestamoDAO.queryPrestamo("matricula='"+matricula+"'",null);
            
            
            for(int i=0; i<prestamo.size();i++){
            
            }
                
               
            
            return str;
        }
    }package capaNegocio;

import capaPersistencia.AlumnoDAO;
import java.util.*;
import javax.persistence.PersistenceException;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Alumno {

	Collection<Prestamo> prestamo;
	private int id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String run;
	private String matricula;
	private String estado;
	private String password;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return this.apellido_paterno;
	}

	/**
	 * 
	 * @param apellido_paterno
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return this.apellido_materno;
	}

	/**
	 * 
	 * @param apellido_materno
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getRun() {
		return this.run;
	}

	/**
	 * 
	 * @param run
	 */
	public void setRun(String run) {
		this.run = run;
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
        
        public String getNombreCompleto(){
            return nombre+" "+apellido_paterno+" "+apellido_materno; 
       }
        public String exist() throws PersistentException{
           PersistentTransaction t = capaPersistencia.GestiondePrestamosPersistentManager.instance().getSession().beginTransaction();
           try{
               
                List<bibliotecaufro.Alumno> alumnos=bibliotecaufro.AlumnoDAO.queryAlumno("matricula='"+matricula+"'",null);
                //SELECT * FROM Customers WHERE Country='Mexico';
                if(alumnos.isEmpty()){
                    return "no hay alumno";
                }else{
                    if(alumnos.get(0).getPassword().equals(password)){
                        nombre=alumnos.get(0).getNombre();
                        apellido_paterno=alumnos.get(0).getApellido_paterno();
                        apellido_materno=alumnos.get(0).getApellido_materno();
                        return "exito login";
                    }else{
                        return "password incorrecto";
                    }
                }
                
     
            }catch(Exception e){
                t.rollback();
                return e.toString();
            }
            
        }
        
        private String getLibros() throws PersistentException{
            String str="";
            prestamo=bibliotecaufro.PrestamoDAO.queryPrestamo("matricula='"+matricula+"'",null);
            
            
            for(int i=0; i<prestamo.size();i++){
            
            }
                
               
            
            return str;
        }
    }package capaNegocio;

import capaPersistencia.AlumnoDAO;
import java.util.*;
import javax.persistence.PersistenceException;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Alumno {

	Collection<Prestamo> prestamo;
	private int id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String run;
	private String matricula;
	private String estado;
	private String password;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return this.apellido_paterno;
	}

	/**
	 * 
	 * @param apellido_paterno
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return this.apellido_materno;
	}

	/**
	 * 
	 * @param apellido_materno
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getRun() {
		return this.run;
	}

	/**
	 * 
	 * @param run
	 */
	public void setRun(String run) {
		this.run = run;
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
        
        public String getNombreCompleto(){
            return nombre+" "+apellido_paterno+" "+apellido_materno; 
       }
        public String exist() throws PersistentException{
           PersistentTransaction t = capaPersistencia.GestiondePrestamosPersistentManager.instance().getSession().beginTransaction();
           try{
               
                List<bibliotecaufro.Alumno> alumnos=bibliotecaufro.AlumnoDAO.queryAlumno("matricula='"+matricula+"'",null);
                //SELECT * FROM Customers WHERE Country='Mexico';
                if(alumnos.isEmpty()){
                    return "no hay alumno";
                }else{
                    if(alumnos.get(0).getPassword().equals(password)){
                        nombre=alumnos.get(0).getNombre();
                        apellido_paterno=alumnos.get(0).getApellido_paterno();
                        apellido_materno=alumnos.get(0).getApellido_materno();
                        return "exito login";
                    }else{
                        return "password incorrecto";
                    }
                }
                
     
            }catch(Exception e){
                t.rollback();
                return e.toString();
            }
            
        }
        
        private String getLibros() throws PersistentException{
            String str="";
            prestamo=bibliotecaufro.PrestamoDAO.queryPrestamo("matricula='"+matricula+"'",null);
            
            
            for(int i=0; i<prestamo.size();i++){
            
            }
                
               
            
            return str;
        }
    }package capaNegocio;

import capaPersistencia.AlumnoDAO;
import java.util.*;
import javax.persistence.PersistenceException;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Alumno {

	Collection<Prestamo> prestamo;
	private int id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String run;
	private String matricula;
	private String estado;
	private String password;

	public int getId() {
		return this.id;
	}



        public String exist() throws PersistentException{
           PersistentTransaction t = capaPersistencia.GestiondePrestamosPersistentManager.instance().getSession().beginTransaction();
           try{
               
                List<bibliotecaufro.Alumno> alumnos=bibliotecaufro.AlumnoDAO.queryAlumno("matricula='"+matricula+"'",null);
                //SELECT * FROM Customers WHERE Country='Mexico';
                if(alumnos.isEmpty()){
                    return "no hay alumno";
                }else{
                    if(alumnos.get(0).getPassword().equals(password)){
                        nombre=alumnos.get(0).getNombre();
                        apellido_paterno=alumnos.get(0).getApellido_paterno();
                        apellido_materno=alumnos.get(0).getApellido_materno();
                        return "exito login";
                    }else{
                        return "password incorrecto";
                    }
                }
                
     
            }catch(Exception e){
                t.rollback();
                return e.toString();
            }
            
        }
        
        private String getLibros() throws PersistentException{
            String str="";
            prestamo=bibliotecaufro.PrestamoDAO.queryPrestamo("matricula='"+matricula+"'",null);
            
            
            for(int i=0; i<prestamo.size();i++){
            
            }
                
               
            
            return str;
        }
    }
