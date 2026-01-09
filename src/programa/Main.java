package programa;
import clases.EstadoPedido;
import clases.Pedido;
import clases.Producto;
public class Main {
	public void main() {
		Pedido p1 = new Pedido(1);
		Producto pro1 = new Producto("teclado", 25.50);
		Producto pro2 = new Producto("raton", 15);
		p1.agregarProducto(pro1);
		p1.agregarProducto(pro2);
		System.out.printf("Número del producto: %d.\nEstado del producto: %s.\nPrecio total: %.2f.\n", p1.getNumero(), p1.getEstado(), p1.calcularTotal());
		p1.SetEstadoPedido(EstadoPedido.ENVIADO);
		System.out.println(p1.getEstado());
	}
	public static void main(String[] args) {
		new Main().main();
	}

}
