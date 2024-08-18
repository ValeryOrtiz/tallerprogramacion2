package co.edu.uniquindio.poo;

public class VehiculoPasajeros extends Vehiculo {
    private int maximoPasajeros;
    

    public VehiculoPasajeros(String placa, String modelo, String marca, String color, String numeroChasis, int maximoPasajeros) {
        super(placa, modelo, marca, color,numeroChasis);
        this.maximoPasajeros = maximoPasajeros;
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

    

    
}
