package ar.edu.unlam.pb2;

public class CuentaVirtual implements Transferible {

	private String cvu;
	private String entidad;
	private String titular;
	
	public CuentaBancaria(String cvu, String entidad, String titular) {
		this.cvu=cvu;
		this.entidad=entidad;
		this.titular=titular;
	}

	
	public String getCvu() {
		return cvu;
	}

	public void setCvu(String cvu) {
		this.cvu = cvu;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
