
package pooilab10;


import java.util.Scanner;
import pooilab10.Personas.ListaMedico;
import pooilab10.Personas.ListaPaciente;


public class POOILab10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ListaPaciente pacientes = new ListaPaciente();
        ListaMedico medicos = new ListaMedico();
        
        int cerrar = 0;
        
        int opcion;
        do{
            System.out.println("1. Registrar datos de paciente");
            System.out.println("2, Eliminar los datos de un paciente");
            System.out.println("3. Modificar los datos de un paciente");
            System.out.println("4. Mostrar que peso se repite mas");
            System.out.println("5. Mostrar cantidad de clientes que tienen el peso que mas se repite");
            System.out.println("6. Mostrar el mayor y menor peso");
            System.out.println("7. Rango de pesos");
            System.out.println("8. Lista ordenada por apellidos");
            System.out.println("9. Paciente: Indicar quien lo atendio");
            System.out.println("10. Buscar doctores por especialidad");
            System.out.println("11. salir");
            
            System.out.print("\nIngrese su numero de opcion : ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    pacientes.registarPaciente();
                    break;
                    
                case 2:     
                    pacientes.eliminarPaciente();
                    break;
                    
                case 3:
                    pacientes.modificarPaciente();
                    break;
                    
                case 4:
                    
                case 5:
                    
                case 6:
                    pacientes.pesosMAXMIN();
                    break;
                    
                case 7:
                    pacientes.pesosRangos();
                    break;
                case 8:
                    
                case 9:
                    
                case 10:
                        
                case 11:
                    cerrar = 11;
                    System.out.println("\nSaliendo del programa.... Hasta luego!");
                    break; 
            }
            
            
        }while(cerrar != 11);
    }
    
}
