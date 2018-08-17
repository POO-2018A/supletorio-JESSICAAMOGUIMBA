
package almacen;

import java.io.Serializable;

/**
 *
 * @author ESFOT
 */
public class HerenciaProductos implements Serializable{
        private String nombre;
        private double precio;
        private String marca;
        
   

    public HerenciaProductos(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        
    }
        
    

    HerenciaProductos() {
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
       
        
        
                
        
        

}
