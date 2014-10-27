package ubu.lsi.dms.agenda.modelo;

import java.io.Serializable;

/**
 * Clase de entidad con la información de Contactos
 * @author Carlos López
 *
 */
@SuppressWarnings("serial")
public class Contacto implements Serializable{
	private int idContacto;
	private String  nombre ,  apellidos ,  estimado ,  direccion ,  ciudad ,  prov ,  codPostal ,  region ,
	pais ,  nombreCompania ,  cargo ,  telefonoTrabajo ,  extensionTrabajo ,  telefonoMovil ,  numFax ,
	nomCorreoElectronico, notas;
	
	private TipoContacto tipoContacto;
	
	public Contacto(int idContacto, String nombre, String apellidos,
			String estimado, String direccion, String ciudad, String prov,
			String codPostal, String region, String pais,
			String nombreCompania, String cargo, String telefonoTrabajo,
			String extensionTrabajo, String telefonoMovil, String numFax,
			String nomCorreoElectronico, String notas, TipoContacto tipoContacto) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estimado = estimado;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.prov = prov;
		this.codPostal = codPostal;
		this.region = region;
		this.pais = pais;
		this.nombreCompania = nombreCompania;
		this.cargo = cargo;
		this.telefonoTrabajo = telefonoTrabajo;
		this.extensionTrabajo = extensionTrabajo;
		this.telefonoMovil = telefonoMovil;
		this.numFax = numFax;
		this.nomCorreoElectronico = nomCorreoElectronico;
		this.notas = notas;
		this.tipoContacto = tipoContacto;
	}

	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", estimado=" + estimado
				+ ", direccion=" + direccion + ", ciudad=" + ciudad + ", prov="
				+ prov + ", codPostal=" + codPostal + ", region=" + region
				+ ", pais=" + pais + ", nombreCompania=" + nombreCompania
				+ ", cargo=" + cargo + ", telefonoTrabajo=" + telefonoTrabajo
				+ ", extensionTrabajo=" + extensionTrabajo + ", telefonoMovil="
				+ telefonoMovil + ", numFax=" + numFax
				+ ", nomCorreoElectronico=" + nomCorreoElectronico + ", notas="
				+ notas + ", tipoContacto=" + tipoContacto + "]";
	}
	
	


}
