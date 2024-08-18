package co.edu.uniquindio.poo;

public class Usuario {
    private String nombre;
    private int edad;
    private double peso;

    public Usuario(String nombre, int edad, double peso){
        this.nombre= nombre;
        this.edad = edad;
        this.peso = peso;
    }
    public Usuario(String nombre, double peso){
        this.nombre=nombre;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        if (edad == 0) {
            return "Usuario [nombre=" + nombre + ", peso=" + peso + "]";
        } 
        else {
            return "Usuario [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
        }
    }

    
    
}
