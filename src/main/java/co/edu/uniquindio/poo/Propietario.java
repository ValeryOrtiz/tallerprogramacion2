package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String numeroIdentificacion;
    private String email;
    private String numeroCelular;
    private int edad;
    private List<Vehiculo> vehiculos;

    public Propietario(String nombre,String numeroIdentificacion,String email,String numeroCelular,int edad){
        this.nombre=nombre;
        this.numeroIdentificacion=numeroIdentificacion;
        this.numeroCelular=numeroCelular;
        this.email=email;
        this.edad=edad;
        this.vehiculos = new ArrayList<>();
    }

    public Propietario(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    
    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        if (numeroIdentificacion == null && email == null && numeroCelular == null && (vehiculos == null || vehiculos.isEmpty())) {
            return "Propietario [nombre=" + nombre + ", edad=" + edad + "]";
        } 
        else {
            return "Propietario [nombre=" + nombre + ", numeroIdentificacion=" + numeroIdentificacion + ", email=" + email
                + ", numeroCelular=" + numeroCelular + ", edad=" + edad + ", vehiculos=" + vehiculos + "]";
        }
    }

    
}
