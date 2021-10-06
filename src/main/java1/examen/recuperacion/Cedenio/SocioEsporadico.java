package examen.recuperacion.Cedenio;

public class SocioEsporadico extends Socio{
private String codigoEsporadico;
private String actividadPrefe;
public String getCodigoEsporadico() {
	return codigoEsporadico;
}
public void setCodigoEsporadico(String codigoEsporadico) {
	this.codigoEsporadico = codigoEsporadico;
}
public String getActividadPrefe() {
	return actividadPrefe;
}
public void setActividadPrefe(String actividadPrefe) {
	this.actividadPrefe = actividadPrefe;
}
@Override
public String toString() {
	return "SocioEsporadico [codigoEsporadico=" + codigoEsporadico + ", actividadPrefe=" + actividadPrefe + "]";
}


}
