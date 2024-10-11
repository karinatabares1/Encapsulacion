
public class Main {
	 public static void main(String[] args) {
		 
		 Producto producto1 = new Producto("CAJA de cereal", 3000,10 );
		 Producto producto2 = new Producto("arroz", 5000,5 );
		 
		 producto1.mostrarInfo();
		 producto2.mostrarInfo();
		 
		 producto1.setPrecio(7000);
		 producto1.setNombre("yogur");
		 
		 producto2.setcantidadEnStock(35);
		 producto2.setPrecio(3000);

		 producto1.mostrarInfo();
		 producto2.mostrarInfo();
		 }
}
