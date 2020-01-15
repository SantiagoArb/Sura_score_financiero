package com.suramericana.diagnosticofinanciero.dto;

import com.suramericana.diagnosticofinanciero.type.valorPositivo;

public class ingresos {
	
	private int cdIngreso;
	private int cdEstado_resultados;
	private valorPositivo ptVentas;
	private valorPositivo ptDescuentos;	
	private valorPositivo ptIngresosOrdinarios;
	
	
	public ingresos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ingresos(int cdIngreso, int cdEstado_resultados, valorPositivo ptVentas, valorPositivo ptDescuentos,
			valorPositivo ptIngresosOrdinarios) {
		super();
		this.cdIngreso = cdIngreso;
		this.cdEstado_resultados = cdEstado_resultados;
		this.ptVentas = ptVentas;
		this.ptDescuentos = ptDescuentos;
		this.ptIngresosOrdinarios = ptIngresosOrdinarios;
	}


	public int getCdIngreso() {
		return cdIngreso;
	}


	public void setCdIngreso(int cdIngreso) {
		this.cdIngreso = cdIngreso;
	}


	public int getCdEstado_resultados() {
		return cdEstado_resultados;
	}


	public void setCdEstado_resultados(int cdEstado_resultados) {
		this.cdEstado_resultados = cdEstado_resultados;
	}


	public valorPositivo getPtVentas() {
		return ptVentas;
	}


	public void setPtVentas(valorPositivo ptVentas) {
		this.ptVentas = ptVentas;
	}


	public valorPositivo getPtDescuentos() {
		return ptDescuentos;
	}


	public void setPtDescuentos(valorPositivo ptDescuentos) {
		this.ptDescuentos = ptDescuentos;
	}


	public valorPositivo getPtIngresosOrdinarios() {
		return ptIngresosOrdinarios;
	}


	public void setPtIngresosOrdinarios(valorPositivo ptIngresosOrdinarios) {
		this.ptIngresosOrdinarios = ptIngresosOrdinarios;
	}

	
	
}

