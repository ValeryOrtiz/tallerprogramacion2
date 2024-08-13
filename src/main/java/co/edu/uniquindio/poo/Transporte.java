package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Transporte {

    public void inicializarDatos() {

        Propietario propietario1 = new Propietario("Din", "12345", "din@gmail.com", "310654");
        Propietario propietario2 = new Propietario("Wyn", "23456", "wyn@gmail.com", "320780");
        Propietario propietario3 = new Propietario("Miu", "34567", "miu@gmail.com", "318590");
        VehiculoCarga vehiculoC1 = new VehiculoCarga("123", "cx", "mazda", "negro", 70, 4);
        VehiculoCarga vehiculoC2 = new VehiculoCarga("234", "360", "mercedes", "negro", 80, 3);
        VehiculoCarga vehiculoC3 = new VehiculoCarga("345", "ns", "audi", "negro", 40, 2);
        VehiculoPasajeros vehiculoP1 = new VehiculoPasajeros("567", "2004", "audi", "negro", 40);
        VehiculoPasajeros vehiculoP2 = new VehiculoPasajeros("678", "tx", "toyota", "negro", 10);
        VehiculoPasajeros vehiculoP3 = new VehiculoPasajeros("789", "x30", "suzuki", "negro", 20);

        System.out.println("Propietarios:");
        System.out.println(propietario1);
        System.out.println(propietario2);
        System.out.println(propietario3);
        System.out.println("Vehiculos de carga:");
        System.out.println(vehiculoC1);
        System.out.println(vehiculoC2);
        System.out.println(vehiculoC3);
        System.out.println("Vehiculos de Pasajeros:");
        System.out.println(vehiculoP1);
        System.out.println(vehiculoP2);
        System.out.println(vehiculoP3);

    }

    public void propietarioVehiculo() {
        Scanner ingresa = new Scanner(System.in);

        System.out.println("ingrese el nombre del propietario: ");
        String nombre = ingresa.nextLine();
        System.out.println("ingrese el numero de identificacion del propietario: ");
        String numeroIdentificacion = ingresa.nextLine();
        System.out.println("ingrese el email del propietario: ");
        String email = ingresa.nextLine();
        System.out.println("ingrese el numero de celular del propietario: ");
        String numeroCelular = ingresa.nextLine();

        System.out.println("ingrese la placa del vehiculo: ");
        String placa = ingresa.nextLine();
        System.out.println("ingrese el modelo del vehiculo: ");
        String modelo = ingresa.nextLine();
        System.out.println("ingrese la marca del vehiculo: ");
        String marca = ingresa.nextLine();
        System.out.println("ingrese el color del vehiculo: ");
        String color = ingresa.nextLine();
        System.out.println("ingrese la capacidad de carga del vehiculo: ");
        double capacidadCarga = ingresa.nextDouble();
        System.out.println("ingrese el numero de ejes del vehiculo: ");
        int numeroEjes = ingresa.nextInt();

        Propietario propietario = new Propietario(nombre, numeroIdentificacion, email, numeroCelular);
        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);

        propietario.agregarVehiculo(vehiculoCarga);

        System.out.println(propietario);
    }

    public void cantidadPasajeros(){
        
    }


}
