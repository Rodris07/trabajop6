
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;



/**
 *
 * @author Jon_kevin27
 */
public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
  

    public Producto(int codigo, String descripcion, double precio, String categoria, int stock ) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }

    @Override public int compareTo(Producto other) { 
        if(codigo == other.codigo){
            return 0;
           
        }else if (codigo > other.codigo){
        return 1;
        }else {
            return -1;
        }
        
        
    }    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
