package clases;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
	private int numero;
	private EstadoPedido estado;
	private List<Producto> productos = new ArrayList<>();
	public Pedido(int numero) {
		this.numero = numero;
	}
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	public double calcularTotal(){
		double total = 0;
		for (int i = 0; i<productos.size();i++) {
			total+=productos.get(i).getPrecio();
		}
		return total;
	}
	public int getNumero() {
		return numero;
	}
	public EstadoPedido getEstado() {
		return estado;
	}
	public void SetEstadoPedido (EstadoPedido estado) {
		this.estado = estado;
	}
}
