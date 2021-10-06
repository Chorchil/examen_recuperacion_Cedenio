package examen_recuperacion_Cedenio;

public class SocioVip extends Socio {
	private String codigoVip;
	private String cumpleanios;
	public String getCodigoVip() {
		return codigoVip;
	}
	public void setCodigoVip(String codigoVip) {
		this.codigoVip = codigoVip;
	}
	public String getCumpleanios() {
		return cumpleanios;
	}
	public void setCumpleanios(String cumpleanios) {
		this.cumpleanios = cumpleanios;
	}
	@Override
	public String toString() {
		return "SocioVip [codigoVip=" + codigoVip + ", cumpleanios=" + cumpleanios + "]";
	}
	

}
