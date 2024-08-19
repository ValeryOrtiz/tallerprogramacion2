package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmpresaTransporte {
    private List<VehiculoCarga> vehiculosCarga;
    private List<VehiculoPasajeros> vehiculosPasajeros;
    private List<Propietario> propietarios;
    private List<Usuario> usuarios;

    

    public EmpresaTransporte() {
        this.vehiculosCarga = new ArrayList<>();
        this.vehiculosPasajeros = new ArrayList<>();
        this.propietarios = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarVehiculo(VehiculoCarga vehiculo) {
        this.vehiculosCarga.add(vehiculo);
    }

    public void agregarVehiculoPasajeros(VehiculoPasajeros vehiculo) {
        this.vehiculosPasajeros.add(vehiculo);
    }

    public void agregarPropietario(Propietario propietario){
        this.propietarios.add(propietario);
    }

    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    

    public List<VehiculoCarga> getVehiculosCarga() {
        return vehiculosCarga;
    }

    public void setVehiculosCarga(List<VehiculoCarga> vehiculosCarga) {
        this.vehiculosCarga = vehiculosCarga;
    }

    public List<VehiculoPasajeros> getVehiculosPasajeros() {
        return vehiculosPasajeros;
    }

    public void setVehiculosPasajeros(List<VehiculoPasajeros> vehiculosPasajeros) {
        this.vehiculosPasajeros = vehiculosPasajeros;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void inicializarDatos() {

        Propietario propietario1 = new Propietario("Din", "12345", "din@gmail.com", "310654",20);
        Propietario propietario2 = new Propietario("Wyn", "23456", "wyn@gmail.com", "320780",30);
        Propietario propietario3 = new Propietario("Miu", "34567", "miu@gmail.com", "318590",35);
        VehiculoCarga vehiculoC1 = new VehiculoCarga("123", "cx", "mazda", "negro","ns", 70, 4);
        VehiculoCarga vehiculoC2 = new VehiculoCarga("234", "360", "mercedes", "negro","56h", 80, 3);
        VehiculoCarga vehiculoC3 = new VehiculoCarga("345", "ns", "audi", "negro","fg", 40, 2);
        VehiculoPasajeros vehiculoP1 = new VehiculoPasajeros("567", "2004", "audi", "negro", "40", 80);
        VehiculoPasajeros vehiculoP2 = new VehiculoPasajeros("678", "tx", "toyota", "negro", "10", 50);
        VehiculoPasajeros vehiculoP3 = new VehiculoPasajeros("789", "x30", "suzuki", "negro", "20", 10);

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
        System.out.println("ingrese la edad del propietario: ");
        int edad = ingresa.nextInt();
        ingresa.nextLine();

        System.out.println("ingrese la placa del vehiculo: ");
        String placa = ingresa.nextLine();
        System.out.println("ingrese el modelo del vehiculo: ");
        String modelo = ingresa.nextLine();
        System.out.println("ingrese la marca del vehiculo: ");
        String marca = ingresa.nextLine();
        System.out.println("ingrese el color del vehiculo: ");
        String color = ingresa.nextLine();
        System.out.println("ingrese el numero de chasis del vehiculo: ");
        String numeroChasis = ingresa.nextLine();
        System.out.println("ingrese la capacidad de carga del vehiculo: ");
        double capacidadCarga = ingresa.nextDouble();
        System.out.println("ingrese el numero de ejes del vehiculo: ");
        int numeroEjes = ingresa.nextInt();

        Propietario propietario = new Propietario(nombre, numeroIdentificacion, email, numeroCelular, edad);
        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color,numeroChasis, capacidadCarga, numeroEjes);

        propietario.agregarVehiculo(vehiculoCarga);

        System.out.println(propietario);
    }

    public void cantidadPasajeros(){
        
        Scanner input = new Scanner(System.in);
        Propietario propietario = new Propietario("Valery", "1044213851", "valery@gmail", "3016224112",18);

        System.out.println("ingrese la cantidad de vehiculos");
        int cantidad = input.nextInt();
        input.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Datos del vehiculo: ");
            
            System.out.println("ingrese la placa del vehiculo: ");
            String placa = input.nextLine();

            System.out.println("ingrese el modelo del vehiculo: ");
            String modelo = input.nextLine();
            
            System.out.println("ingrese la marca del vehiculo: ");
            String marca = input.nextLine();
            System.out.println("ingrese el color del vehiculo: ");
            String color = input.nextLine();
            System.out.println("ingrese el numero de chasis del vehiculo: ");
            String numeroChasis = input.nextLine();
            System.out.println("ingrese el maximo de pasajeros del vehiculo: ");
            int maximoPasajeros = input.nextInt();
            input.nextLine();
            

            VehiculoPasajeros vehiculo = new VehiculoPasajeros(placa, modelo, marca, color,numeroChasis, maximoPasajeros);
            propietario.agregarVehiculo(vehiculo);
        }    

        System.out.println("Ingrese la placa del vehículo que desea buscar: ");
        String placaBusqueda = input.nextLine();
        Vehiculo vehiculoEncontrado = propietario.buscarVehiculoPorPlaca(placaBusqueda);

        if (vehiculoEncontrado != null && vehiculoEncontrado instanceof VehiculoPasajeros) {
            VehiculoPasajeros vehiculoPasajeros = (VehiculoPasajeros) vehiculoEncontrado;
            System.out.println("Vehículo encontrado: " + vehiculoPasajeros.toString());
            System.out.println("Total de pasajeros transportados hoy: " + vehiculoPasajeros.getMaximoPasajeros());
        } else {
            System.out.println("Vehículo con placa " + placaBusqueda + " no encontrado o no es un vehículo de pasajeros.");
        }
        
    }

    public Collection<Propietario> propietariosMayores(){
        EmpresaTransporte transporte = new EmpresaTransporte();

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la cantidad de propietarios que desea registrar: ");
        int cantidad = input.nextInt();
        input.nextLine();

        for(int i=0; i<cantidad; i++){
            System.out.println("ingrese el nombre del propietario: ");
            String nombre = input.nextLine();

            System.out.println("ingrese la edad del propietario: ");
            int edad = input.nextInt();
            input.nextLine();

            Propietario propietario = new Propietario(nombre, edad);
            transporte.agregarPropietario(propietario);
        }


        var propietariosMayores = new LinkedList<Propietario>();
        for(Propietario propietario : transporte.getPropietarios()){
            if (propietario.getEdad()>40){
                propietariosMayores.add(propietario);
            }
        }
        System.out.println("Los usuarios mayores de 40 años son:");
        System.out.println(propietariosMayores);

        return Collections.unmodifiableCollection(propietariosMayores);
        
    }

    public Collection<Usuario> usuariosSobrepeso(){
        EmpresaTransporte transporte = new EmpresaTransporte();
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese la cantidad de usuarios que desea registrar: ");
        int cantidad = input.nextInt();
        input.nextLine();

        for(int i=0; i<cantidad; i++){
            System.out.println("ingrese el nombre del usuario: ");
            String nombre = input.nextLine();

            System.out.println("ingrese el peso del usuario: ");
            Double peso = input.nextDouble();
            input.nextLine();

            Usuario usuario = new Usuario(nombre, peso);
            transporte.agregarUsuario(usuario);
        }

        System.out.println("ingrese el peso estandar: ");
        double peso = input.nextDouble();
        input.nextLine();
    
        var usuariosSobrepeso = new LinkedList<Usuario>();
        for(Usuario usuario : transporte.getUsuarios()){
            if (usuario.getPeso() > peso){
                usuariosSobrepeso.add(usuario);
            }
        }
        System.out.println("Usuarios que superan el peso de " + peso + ":");
        System.out.println(usuariosSobrepeso);

        return Collections.unmodifiableCollection(usuariosSobrepeso);
    }

}
