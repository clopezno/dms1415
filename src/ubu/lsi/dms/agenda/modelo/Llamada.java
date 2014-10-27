package ubu.lsi.dms.agenda.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Llamada implements Serializable{
	
	 private int idLlamada;
	 private Contacto contacto;
	 private String fechaLlamada ;
	 private String asunto,notas;
	 
	 

	public Llamada(int idLlamada, Contacto contacto, String fechaLlamada,
			String asunto, String notas) {
		super();
		this.idLlamada = idLlamada;
		this.contacto = contacto;
		this.fechaLlamada = fechaLlamada;
		this.asunto = asunto;
		this.notas = notas;
	}
	
	@Override
	public String toString() {
		return "Llamada [idLlamada=" + idLlamada + ", contacto=" + contacto
				+ ", fechaLlamada=" + fechaLlamada + ", asunto=" + asunto
				+ ", notas=" + notas + "]";
	}

	 
	 
	   
	

}
