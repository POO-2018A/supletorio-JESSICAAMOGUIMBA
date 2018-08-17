/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ESFOT
 */
public class Computador extends HerenciaProductos implements Serializable{
    private String tipo;
    private int capacidadAlmacenamiento;
    private int RAM;
    private String  procesador;

    public Computador(String tipo, int capacidadAlmacenamiento, int RAM, String procesador, String nombre, double precio, String marca) {
        super(nombre, precio, marca);
        this.tipo = tipo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.RAM = RAM;
        this.procesador = procesador;
    }

    public Computador(String tipo, int capacidadAlmacenamiento, int RAM, String procesador) {
        this.tipo = tipo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.RAM = RAM;
        this.procesador = procesador;
    }

    Computador(String text, double parseDouble, String text0) {
        
    }

    Computador(String text, double parseDouble, String text0, String string, ArrayList<Object> listaProductos) {
   
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

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    
    
    

   
    
    
    
    
}