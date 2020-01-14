package com.suramericana.diagnosticofinanciero.dto;

import java.util.Date;

public class balanceGeneral {

	private int cdBalanceGeneral;
	private int cdEstado_resultados;
	private Date feAnio;
	private Date feAlta;
	private Date feBaja;
	private int cdUsuario;
	
	public balanceGeneral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public balanceGeneral(int cdBalanceGeneral, int cdEstado_resultados, Date feAnio, Date feAlta, Date feBaja,
			int cdUsuario) {
		super();
		this.cdBalanceGeneral = cdBalanceGeneral;
		this.cdEstado_resultados = cdEstado_resultados;
		this.feAnio = feAnio;
		this.feAlta = feAlta;
		this.feBaja = feBaja;
		this.cdUsuario = cdUsuario;
	}

	public int getCdBalanceGeneral() {
		return cdBalanceGeneral;
	}

	public void setCdBalanceGeneral(int cdBalanceGeneral) {
		this.cdBalanceGeneral = cdBalanceGeneral;
	}

	public int getCdEstado_resultados() {
		return cdEstado_resultados;
	}

	public void setCdEstado_resultados(int cdEstado_resultados) {
		this.cdEstado_resultados = cdEstado_resultados;
	}

	public Date getFeAnio() {
		return feAnio;
	}

	public void setFeAnio(Date feAnio) {
		this.feAnio = feAnio;
	}

	public Date getFeAlta() {
		return feAlta;
	}

	public void setFeAlta(Date feAlta) {
		this.feAlta = feAlta;
	}

	public Date getFeBaja() {
		return feBaja;
	}

	public void setFeBaja(Date feBaja) {
		this.feBaja = feBaja;
	}

	public int getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	
	
	
	
	
}
