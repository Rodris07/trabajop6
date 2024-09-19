
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class SupermercadodetodoSA {
    private HashSet<String> rubro = new HashSet();
    private TreeSet<Producto>listaProductos= new TreeSet();
    
    

    public SupermercadodetodoSA() {
        rubro.add("Limpieza");
        rubro.add("Perfumería");
        rubro.add("Comestibles");
        Producto p1 = new Producto(25,"arroz",28,5);
        Producto p2= new Producto(35,"kevin",500,55);
        Producto p3= new Producto(48,"lavandina",25,85);
        Producto p4= new Producto(28,"papa",28,13);
        Producto p5= new Producto(9,"detergente",36,5);
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
    }

    public HashSet<String> getRubro() {
        return rubro;
    }

    public void setRubro(HashSet<String> rubro) {
        this.rubro = rubro;
    }

    public TreeSet<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(TreeSet<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    
    
    
    public void agregarProducto() {
        

    }

    public void eliminarProducto() {

    }

    public void modificarProducto() {

    }
}
