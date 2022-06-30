package ar.edu.unlam.pb2;

public class Billetera implements Pagadora, Transferible {
	
	private String nombre;
	private Set<Consumidor> listaConsumidores;
	private Set<Comercio> listaComercios;
	private Set<MedioDePago> listaMediosDePago;
	private Set<Compra> listaCompras;
	
	public Billetera(String nombre) {
		this.nombre=nombre;
	}

	public void agregarConsumidor(Consumidor nuevoConsumidor) {
		this.listaConsumidores.add(nuevoConsumidor);
	}
	
	public void agregarComercio(Comercio nuevoComercio) {
		this.listaComercios.add(nuevoComercio);
	}
	
	
	public void agregarMedioDePago(Integer dni, CuentaBancaria cb) {
		this.listaMediosdePago.add();
		
	}
	
	public Boolean agregarMedioDePago(Integer dni, CuentaVirtual cv) {
		
	}
	
	public Boolean agregarMedioDePago(Integer dni, TarjetaDeCredito tc) {
		
	}
	
	public Boolean agregarMedioDePago(Integer dni, TarjetaDeDebito td) {
		
	}
	
	public Boolean pagar(Compra nuevaCompra, MedioPagador nuevoMP) {
				nuevaCompra.setCompraSaldada(true);
				return true;
		}
	
	public void generarCodigoQR(Long cuitComercio, Double importe) {
		Compra compraConQR = new Compra(cuitComercio, importe);
	}
	
	public Integer getCantidadDeComercios() {
		this.listaComercios=listado;
		Integer contadorComercios=0;
		
		for(Comercio actual:listado) {
			contadorComercios++;
		}
		return contadorComercios;
	}
	
	public Integer getCantidadDeConsumidores() {
		this.listaConsumidores=listado;
		Integer contadorConsumidores=0;
		
		for(Consumidor actual:listado) {
			contadorConsumidores++;
		}
		return contadorConsumidores;
	}

	public Integer getCantidadDeMediosDePago() {
		this.listaMediosDePago=listado;
		Integer contadorMP=0;
		
		for(MedioDePago actual:listado) {
			contadorMP++;
		}
		return contadorMP;
	}

}
