
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

    Componente(String nombre, double precio, String marca, String categoria, String tipo, Integer valueOf, Integer valueOf0) {
       
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
