package com.suramericana.diagnosticofinanciero.dto;

import com.suramericana.diagnosticofinanciero.type.valorPositivo;

public class otrosIngresos {

	private int cdOtrosIngresos;
	private int cdEstado_resultados;
	private valorPositivo ptIngresosFinancieros;
	private valorPositivo ptInteresesInversiones;
	private valorPositivo ptIngresosNoOperativos;
	
	public otrosIngresos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public otrosIngresos(int cdOtrosIngresos, int cdEstado_resultados, valorPositivo ptIngresosFinancieros,
			valorPositivo ptInteresesInversiones, valorPositivo ptIngresosNoOperativos) {
		super();
		this.cdOtrosIngresos = cdOtrosIngresos;
		this.cdEstado_resultados = cdEstado_resultados;
		this.ptIngresosFinancieros = ptIngresosFinancieros;
		this.ptInteresesInversiones = ptInteresesInversiones;
		this.ptIngresosNoOperativos = ptIngresosNoOperativos;
	}

	public int getCdOtrosIngresos() {
		return cdOtrosIngresos;
	}

	public void setCdOtrosIngresos(int cdOtrosIngresos) {
		this.cdOtrosIngresos = cdOtrosIngresos;
	}

	public int getCdEstado_resultados() {
		return cdEstado_resultados;
	}

	public void setCdEstado_resultados(int cdEstado_resultados) {
		this.cdEstado_resultados = cdEstado_resultados;
	}

	public valorPositivo getPtIngresosFinancieros() {
		return ptIngresosFinancieros;
	}

	public void setPtIngresosFinancieros(valorPositivo ptIngresosFinancieros) {
		this.ptIngresosFinancieros = ptIngresosFinancieros;
	}

	public valorPositivo getPtInteresesInversiones() {
		return ptInteresesInversiones;
	}

	public void setPtInteresesInversiones(valorPositivo ptInteresesInversiones) {
		this.ptInteresesInversiones = ptInteresesInversiones;
	}

	public valorPositivo getPtIngresosNoOperativos() {
		return ptIngresosNoOperativos;
	}

	public void setPtIngresosNoOperativos(valorPositivo ptIngresosNoOperativos) {
		this.ptIngresosNoOperativos = ptIngresosNoOperativos;
	}
	
	
	
	
}
