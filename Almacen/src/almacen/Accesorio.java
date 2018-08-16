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
public class Accesorio extends HerenciaProductos{
    private String tipo;
    private String color;

    public Accesorio(String nombre, double precio, String marca) {
        super(nombre, precio, marca);
    }

    public Accesorio(String tipo, String color, String nombre, double precio, String marca) {
        super(nombre, precio, marca);
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
          
          
}
