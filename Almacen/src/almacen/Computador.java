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
public class Computador extends HerenciaProductos {
    private String tipo;
    private int capacidadAlmacenamiento;
    private String  procesador;

    public Computador(String nombre, double precio, String marca) {
        super(nombre, precio, marca);
    }

    public Computador(String tipo, int capacidadAlmacenamiento, String procesador, String nombre, double precio, String marca) {
        super(nombre, precio, marca);
        this.tipo = tipo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    

   
    
    
    
    
}