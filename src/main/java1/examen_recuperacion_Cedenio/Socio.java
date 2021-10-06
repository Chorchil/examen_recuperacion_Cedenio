package examen_recuperacion_Cedenio;

public class Socio {
protected String CodigoMembresia;
protected String nombre;
protected String apellido;
public String getCodigoMembresia() {
	return CodigoMembresia;
}
public void setCodigoMembresia(String codigoMembresia) {
	CodigoMembresia = codigoMembresia;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
@Override
public String toString() {
	return "Socio [CodigoMembresia=" + CodigoMembresia + ", nombre=" + nombre + ", apellido=" + apellido + "]";
}



}
