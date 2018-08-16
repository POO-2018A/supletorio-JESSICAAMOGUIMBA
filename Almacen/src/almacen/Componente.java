/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author ESFOT
 */
public class Componente extends HerenciaProductos{
    private String tipoComponente;
    private String capacidad;
    private double velocidad;

    public Componente(String nombre, double precio, String marca) {
        super(nombre, precio, marca);
    }

    public Componente(String tipoComponente, String capacidad, double velocidad, String nombre, double precio, String marca) {
        super(nombre, precio, marca);
        this.tipoComponente = tipoComponente;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
