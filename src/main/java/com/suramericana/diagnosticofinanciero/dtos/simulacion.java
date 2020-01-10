package com.suramericana.diagnosticofinanciero.dtos;

import java.util.Date;

public class simulacion {

	private int cdsimulacion;
	private int cddiagnostico;
	private String dssimulacion;
	private Date febaja;
	private Date fealta;
	private String cdusuario;
	
	
	
	public simulacion() {
	}



	public simulacion(int cdsimulacion, int cddiagnostico, String dssimulacion, Date febaja, Date fealta,
			String cdusuario) {
		this.cdsimulacion = cdsimulacion;
		this.cddiagnostico = cddiagnostico;
		this.dssimulacion = dssimulacion;
		this.febaja = febaja;
		this.fealta = fealta;
		this.cdusuario = cdusuario;
	}



	public int getCdsimulacion() {
		return cdsimulacion;
	}



	public void setCdsimulacion(int cdsimulacion) {
		this.cdsimulacion = cdsimulacion;
	}



	public int getCddiagnostico() {
		return cddiagnostico;
	}



	public void setCddiagnostico(int cddiagnostico) {
		this.cddiagnostico = cddiagnostico;
	}



	public String getDssimulacion() {
		return dssimulacion;
	}



	public void setDssimulacion(String dssimulacion) {
		this.dssimulacion = dssimulacion;
	}



	public Date getFebaja() {
		return febaja;
	}



	public void setFebaja(Date febaja) {
		this.febaja = febaja;
	}



	public Date getFealta() {
		return fealta;
	}



	public void setFealta(Date fealta) {
		this.fealta = fealta;
	}



	public String getCdusuario() {
		return cdusuario;
	}



	public void setCdusuario(String cdusuario) {
		this.cdusuario = cdusuario;
	}

	
}
