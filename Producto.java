import java.util.ArrayList;
public class Producto {
	
	public static void main(String[] args) {
		 ArrayList<Producto> listaProductos = new ArrayList<>();
		 listaProductos.add(new Producto("panela", 8000, 80));
		 listaProductos.add(new Producto("papa", 15000,150));
		 listaProductos.add(new Producto("canela", 500,2));
	
		 // Modifica el precio de uno de los productos usando el índice.
		 //Elimina un producto de la lista.
		 for (Producto emp : listaProductos) {
			 emp.mostrarInfo();
			 System.out.println("----------");
			 }
		 
		 listaProductos.get(1).setPrecio(28000);
		 listaProductos.remove(0);
		 
		 System.out.println("\nLista de productos después de eliminar al primero:");
		 for (Producto emp : listaProductos) {
		 emp.mostrarInfo();
		 System.out.println("----------");
		 }
	}
	
	private String nombre;
	private double precio;
	private double cantidadEnStock;
	
	public Producto(String nombre, double precio, double cantidadEnStock ) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
		}
	
	 public String getNombre() {
		 return nombre;}
	 public void setNombre(String nombre) {
		 this.nombre = nombre;}
	 
	 public double getPrecio() {
		 return precio;
		 }
	 public void setPrecio(double precio) {
		 if (precio > 0) {
		 this.precio = precio;
		 } else {
		 System.out.println("El precio debe ser positivo.");
		 }
		 }
	 
	 
	 public double getcantidadEnStock() {
		 return cantidadEnStock;
		 }
	 public void setcantidadEnStock(double cantidadEnStock) {
		 if (cantidadEnStock > 0) {
		 this.cantidadEnStock = cantidadEnStock;
		 } else {
		 System.out.println("La cantidad en stock debe ser positivo.");
		 }
	 }
		 
	 public void mostrarInfo() {
		 System.out.println("Nombre: " + nombre);
		 System.out.println("precio: $" + precio);
		 System.out.println("cantidad en stock: $" + cantidadEnStock);
	 }
}
