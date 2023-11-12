/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooilab10.Personas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Alumno
 */
public class ListaPaciente {
    private static final List<Paciente> pacientes = new ArrayList<>();
    private static final List<Medico> medicos = new ArrayList<>();
    
    Scanner scanner = new Scanner(System.in);
    
    public void adicionar(Paciente paciente) {
        pacientes.add(paciente);
    }
    
    public void eliminar(Paciente paciente) {
        pacientes.add(paciente);
    }
    
    public void registarPaciente(){
        System.out.println("\nRecuerde poner exactamente el nombre y apellido del paciente\n");
        
                    System.out.print("Ingrese el nombre del paciente : ");
                    String nombre = scanner.next();
                        
                    System.out.print("Ingrese el apellido del paciente : ");
                    String apellido = scanner.next();

                    System.out.print("Ingrese el DNI del paciente : ");
                    String dni = scanner.next();
                    
                    System.out.print("Ingrese la direccion del paciente : ");
                    String direccion = scanner.next();
                        
                    System.out.print("Ingrese el peso del paciente : ");
                    double peso  = scanner.nextDouble();
                    
                    System.out.print("Ingrese la temperatura del paciente : ");
                    double temperatura  = scanner.nextDouble();
                    
                    Paciente paciente = new Paciente(dni,nombre,apellido,direccion,peso,temperatura);
                    adicionar(paciente);
                    
                    System.out.println("Se ha registrado correctamente");
    }
    
    public void eliminarPaciente() {
        System.out.println("\nRecuerde poner exactamente el nombre y apellido del estudiante\n");
        
        System.out.print("Ingrese el nombre del estudiante : ");
        String nombre = scanner.next();
            
        System.out.print("Ingrese el apellido del estudiante : ");
        String apellido = scanner.next();
            
            
        for (Paciente paciente : pacientes){
            if (paciente.getNombre().equals(nombre)&& paciente.getApellido().equals(apellido)){
                int index = pacientes.indexOf(paciente);
                pacientes.remove(index);
            
                 
                if(pacientes.contains(paciente)){
                    System.out.println("No se elimino\n");
                }else{
                    System.out.println("Se ha eliminado correctamente\n");
                }
                return;
                }
            }
    }
            
    public void modificarPaciente(){
        System.out.println("\nRecuerde poner exactamente el nombre y apellido del paciente\n");
        
            System.out.print("Ingrese el nombre del paciente : ");
            String nombre = scanner.next();
            
            System.out.print("Ingrese el apellido del paciente : ");
            String apellido = scanner.next();
            
            for (Paciente paciente: pacientes){
                if (paciente.getNombre().equals(nombre)&& paciente.getApellido().equals(apellido)){
                    int cerrar = 0;
                    
                    do{
                        System.out.println("\n1. Modificar Nombre");
                        System.out.println("2. Modificar Apellido");
                        System.out.println("3. Modificar DNI");
                        System.out.println("4. Modificar Direccion");
                        System.out.println("5. Modificar Peso");
                        System.out.println("6. Modificar Temperatura");
                        System.out.println("7. Salir");
                        System.out.print("Ingrese su numero de operación : ");
                        int numOperacion = scanner.nextInt();
                        
                        switch (numOperacion) {
                            case 1:
                                System.out.print("Ingrese el nuevo nombre del paciente : ");
                                String nnombre = scanner.next();
                                
                                paciente.setNombre(nnombre);
                                
                                System.out.println("\nEl cambio ha sido hecho\n");
                                break;
                                
                            case 2:
                                System.out.print("Ingrese el nuevo apellido del paciente : ");
                                String napellido = scanner.next();
                                
                                paciente.setApellido(napellido);
                                
                                System.out.println("\nEl cambio ha sido hecho\n");
                                break;
                                
                            case 3: 
                                System.out.print("Ingrese el nuevo DNI del paciente : ");
                                String ndni = scanner.next();
                                
                                paciente.setDni(ndni);
                                
                                System.out.println("\nEl cambio ha sido hecho\n");
                                break;
                                
                            case 4:
                                System.out.print("Ingrese la nueva direccion del paciente : ");
                                String ndirec = scanner.next();
                                
                                paciente.setDireccion(ndirec);
                                
                                System.out.println("\nEl cambio ha sido hecho\n");
                                break;
                                
                            case 5:
                                System.out.print("Ingrese el nuevo peso del paciente : ");
                                double peso= scanner.nextDouble();
                                
                                paciente.setPeso(peso);
                                
                                System.out.println("\nEl cambio ha sido hecho\n");
                                break;
                                
                            case 6:
                                System.out.print("Ingrese la nueva Temperatura del paciente : ");
                                double temp = scanner.nextDouble();
                                
                                paciente.setTemperatura(temp);
                                
                                System.out.println("\nEl cambio ha sido hecho\n");
                                break;
                                
                            case 7:
                                cerrar = 7;
                                System.out.println("\nSaliendo....");
                                break; 
                        }
                    
                        
                    }while(cerrar != 7);
                    return;
                }
                System.out.println("\nNo se encontro el paciente\n");
            }
               
    }
    
    public void pesosMAXMIN() {
        double maxpeso = 0;
        double minpeso = 100;
        
        for(Paciente paciente: pacientes){
            if (maxpeso < paciente.getPeso()){
                maxpeso = paciente.getPeso();
            }
            if (minpeso > paciente.getPeso()){
                minpeso = paciente.getPeso();
            }
        }
        System.out.println("\nEl maximo peso es : " + maxpeso);
        System.out.println("El minimo peso es : " + minpeso + "\n");
    }
    
    public void pesoRepetido(){
            
    }
    
    public void pesosRangos(){
        int pesos4060 = 0;
        int pesos6080 = 0;
        int pesos80100 = 0;
        int pesos100120 = 0;
        
        for(Paciente paciente : pacientes){
            if(40<=paciente.getPeso() && paciente.getPeso()<60){
                pesos4060++;
            }
            
            if(60<=paciente.getPeso() && paciente.getPeso()<80){
                pesos6080++;
            }
            
            if(80<=paciente.getPeso() && paciente.getPeso()<100){
                pesos80100++;
            }
            
            if(100<=paciente.getPeso() && paciente.getPeso()<120){
                pesos100120++;
            }
        }
        
        System.out.println("\nLa cantidad de personas entre 40 y 60 : " + pesos4060);
        System.out.println("La cantidad de personas entre 60 y 80 : " + pesos6080);
        System.out.println("La cantidad de personas entre 80 y 100: " + pesos80100);
        System.out.println("La cantidad de personas entre 100 y 120 : " + pesos100120 + "\n");
    }
    
    public void apellidosAlfa() {
        Collections.sort(pacientes,Comparator.comparing(Paciente::getApellido));
        for(Paciente paciente : pacientes){
            System.out.println(paciente.toString());
        }
    }
    
    
    
    
    
    
}
