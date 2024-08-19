package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoPasajeros extends Vehiculo {
    private int maximoPasajeros;
    private List<Usuario> usuarios;
    

    public VehiculoPasajeros(String placa, String modelo, String marca, String color, String numeroChasis, int maximoPasajeros) {
        super(placa, modelo, marca, color,numeroChasis);
        this.maximoPasajeros = maximoPasajeros;
        this.usuarios = new ArrayList<>();
    }
    
    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
    

    @Override
    public String toString() {
        return "VehiculoPasajeros [maximoPasajeros=" + maximoPasajeros + ", Placa=" + getPlaca() + ", Modelo="
                + getModelo() + ", Marca=" + getMarca() + ", Color=" + getColor() + ", numero de chasis=" + getNumeroChasis() + "]";
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
