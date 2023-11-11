/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooilab10.Personas;

/**
 *
 * @author Alumno
 */
public class Medico {
    private int nroDeColegiatura;
    private String nombre;
    private String apellido;
    private String especialidad;

    public Medico(int nroDeColegiatura, String nombre, String apellido, String especialidad) {
        this.nroDeColegiatura = nroDeColegiatura;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    public int getNroDeColegiatura() {
        return nroDeColegiatura;
    }

    public void setNroDeColegiatura(int nroDeColegiatura) {
        this.nroDeColegiatura = nroDeColegiatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
