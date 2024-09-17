
import java.util.TreeSet;



/**
 *
 * @author Jon_kevin27
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    //private TreeSet <String>listaProductos= new TreeSet<>();

    public Producto(int codigo, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
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

//    //public Set<String> getListaProductos() {
//        return listaProductos;
//    }
//
//    public void setListaProductos(Set<String> listaProductos) {
//        this.listaProductos = listaProductos;
//    }
    
    public void agregarProducto (Producto p){
        //listaProductos.add(p);
    }
    
    public void eliminarProducto (){
        
    }
    
    
}
