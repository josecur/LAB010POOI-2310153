/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooilab10.Personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ListaMedico {
    private static final List<Medico> medicos = new ArrayList<>();
    
    Scanner scanner = new Scanner(System.in);
    
    public void adicionar(Medico medico) {
        medicos.add(medico);
    }
    
    public void eliminar(Medico medico) {
        medicos.remove(medico);
    }
    
    
    
    
}
