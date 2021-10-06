package examen_recuperacion_Cedenio;

import java.util.*;

public class MainAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorS = new Scanner(System.in);
		Scanner lectorI = new Scanner(System.in);
		String usuario = "";
		String clave = "";
		List<Socio> listaSocios = new ArrayList<Socio>();
		int menu = 0;
		int tipoSocio;
		String apellido;
		String nombre;
		String codigoMen;
		String codigoVip;
		String cumpleanios;
		String codigoGeneral;
		String profesion;
		String codigoEsporadico;
		String actividadPrefe;
		String busqueda;
		String codigoBusqueda;
		int busqSocio;
		String busquedaf;
		do {
			System.out.println("Sistema CLUB CASTILLOS DEL VALLE!!");
			System.out.println("Ingrese usuario del sistema: ");
			usuario = lectorS.nextLine();
			if (usuario.contains("ADMIN")) {
				System.out.println("Ingrese clave: ");
				clave = lectorS.nextLine();
				do {
					if (clave.equals("ABC345")) {
						do {
							System.out.println(
									"Sistema CLUB CASTILLOS DEL VALLE\n1.Ingresar socio\n2.Búsqueda general\n3.Búsquedapor tipo de socio\n4.SALIR");
							menu = lectorI.nextInt();
							switch (menu) {
							case 1:
								System.out.println(
										"Para ingresar un socio seleccione: \n1.Socio VIP\n2.Socio General\n3.Socio Esporadico");
								tipoSocio = lectorI.nextInt();

								if (tipoSocio == 1) {
									SocioVip socioV = new SocioVip();
									System.out.println("Nombre: ");
									socioV.setNombre(nombre = lectorS.nextLine());
									System.out.println("Apellido: ");
									socioV.setApellido(apellido = lectorS.nextLine());
									System.out.println("Codigo Membresia: ");
									socioV.setCodigoMembresia(codigoMen = lectorS.nextLine());
									System.out.println("Codigo VIP: ");
									socioV.setCodigoVip(codigoVip = lectorS.nextLine());
									System.out.println("Cumpleaños: ");
									socioV.setCumpleanios(cumpleanios = lectorS.nextLine());
									listaSocios.add(socioV);

								} else if (tipoSocio == 2) {
									SocioGeneral socioG = new SocioGeneral();
									System.out.println("Nombre: ");
									socioG.setNombre(nombre = lectorS.nextLine());
									System.out.println("Apellido: ");
									socioG.setApellido(apellido = lectorS.nextLine());
									System.out.println("Codigo Membresia: ");
									socioG.setCodigoMembresia(codigoMen = lectorS.nextLine());
									System.out.println("Codigo General: ");
									socioG.setCodigoGeneral(codigoGeneral = lectorS.nextLine());
									System.out.println("Profesion: ");
									socioG.setProfesion(profesion = lectorS.nextLine());
									listaSocios.add(socioG);

								} else if (tipoSocio == 3) {
									SocioEsporadico socioE = new SocioEsporadico();
									System.out.println("Nombre: ");
									socioE.setNombre(nombre = lectorS.nextLine());
									System.out.println("Apellido: ");
									socioE.setApellido(apellido = lectorS.nextLine());
									System.out.println("Codigo Membresia: ");
									socioE.setCodigoMembresia(codigoMen = lectorS.nextLine());
									System.out.println("Codigo Esporadico: ");
									socioE.setCodigoEsporadico(codigoVip = lectorS.nextLine());
									System.out.println("Actividad: ");
									socioE.setActividadPrefe(actividadPrefe = lectorS.nextLine());
									listaSocios.add(socioE);
								}
								break;
							case 2:
								System.out.println("Ingrese el codigo de membresia para buscar: ");
								busqueda = lectorS.nextLine();
								for (int i = 0; i < listaSocios.size(); i++) {
									if (busqueda.equals(listaSocios.get(i).getCodigoMembresia())) {
										System.out.println("Socio Encontrado: ");
										System.out.println(listaSocios.get(i).toString());
									} else {
										System.out.println("Socio no encontrado");
									}
								}
								break;
							case 3:
								System.out.println(
										"Escoja el tipo de socio a buscar: \n1.Socio VIP\\n2.Socio General\\n3.Socio Esporadico");
								busqSocio = lectorI.nextInt();
								if (busqSocio == 1) {
									System.out.println("Ingrese el codigo VIP: ");
									codigoBusqueda = lectorS.nextLine();
									for (int j = 0; j < listaSocios.size(); j++) {
										if (codigoBusqueda.equals(listaSocios.get(j).getCodigoMembresia())) {
											System.out.println("Socio Encontrado: ");
											System.out.println(listaSocios.get(j).toString());

										} else if (busqSocio == 2) {
											System.out.println("Ingrese el codigo General: ");
											codigoBusqueda = lectorS.nextLine();
											for (int k = 0; k < listaSocios.size(); k++) {
												if (codigoBusqueda.equals(listaSocios.get(k).getCodigoMembresia())) {
													System.out.println("Socio Encontrado: ");
													System.out.println(listaSocios.get(k).toString());
												}
											}
										} else if (busqSocio == 3) {
											System.out.println("Ingrese el codigo Esporadico: ");
											codigoBusqueda = lectorS.nextLine();
											for (int l = 0; l < listaSocios.size(); l++) {
												if (codigoBusqueda.equals(listaSocios.get(l).getCodigoMembresia())) {
													System.out.println("Socio Encontrado: ");
													System.out.println(listaSocios.get(l).toString());
												}
											}
										}

									}
								}
								break;
							case 4:
								System.out.println("Fin del SISTEMA Gracias");
								break;
							default:
								break;
							}

						} while (menu != 4);

					} else {
						System.out.println("Clave incorrecta");
					}

				} while (clave.equals("ABC345"));
			} else {
				System.out.println("Usuario incorrecto! Intente otra vez");
			}
		} while (!usuario.contains("ADMIN"));

	}

}
