package co.edu.uniquindio.poo;

import java.util.Scanner;


public class MainTransporte {
    public static void main(String[] args) {
        EmpresaTransporte transporte = new EmpresaTransporte();
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            mostrarOpciones();
            opcion = input.nextInt();

            switch(opcion) {
                case 1:
                    transporte.inicializarDatos();
                    break;
                case 2:
                    transporte.propietarioVehiculo();
                    break;
                case 3:
                    transporte.cantidadPasajeros();
                    break;
                case 4:
                    transporte.usuariosSobrepeso();
                    break;
                case 5:
                    transporte.propietariosMayores();
                    break;   
                case 6:
                    System.out.println("Chaito");
                    break;      
                default:
                    System.out.println("Opción inválida. Intente otra vez.");
            }
        } 
        
        while (opcion != 6);
        
    }

    public static void mostrarOpciones(){
        System.out.println("Menú Principal:");
        System.out.println("1. Inicializar datos de prueba");
        System.out.println("2. Crear un Propietario y Vehículo de Carga");
        System.out.println("3. Calcular total de pasajeros transportados");
        System.out.println("4. Lista de usuarios con sobrepeso");
        System.out.println("5. Lista de propietarios mayores de 40");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
}
