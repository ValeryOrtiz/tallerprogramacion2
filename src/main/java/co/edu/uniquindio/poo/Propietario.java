package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String numeroIdentificacion;
    private String email;
    private String numeroCelular;
    private List<Vehiculo> vehiculos;

    public Propietario(String nombre,String numeroIdentificacion,String email,String numeroCelular){
        this.nombre=nombre;
        this.numeroIdentificacion=numeroIdentificacion;
        this.numeroCelular=numeroCelular;
        this.email=email;
        this.vehiculos = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", numeroIdentificacion=" + numeroIdentificacion + ", email=" + email
                + ", numeroCelular=" + numeroCelular + ", vehiculos=" + vehiculos + "]";
    }

    
}
