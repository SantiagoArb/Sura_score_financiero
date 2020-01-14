package com.suramericana.diagnosticofinanciero.dto;

import com.suramericana.diagnosticofinanciero.type.valorPositivo;

public class patrimonio {
	
	private int cdBalanceGral;
	private int cdPatrimonio;
	private valorPositivo ptCapitalSuscritoYPagado;
	private valorPositivo ptReservaLegal;
	private valorPositivo ptReservaOcacional;
	private valorPositivo ptSuperavitPorValorizacion;
	private valorPositivo ptResultadoEjerciciosAnteriores;
	private valorPositivo ptResultadoDelEjercicio;
	
	
	public patrimonio() {
			
	}
	
	public patrimonio(int cdBalanceGral, int cdPatrimonio, valorPositivo ptCapitalSuscritoYPagado,
			valorPositivo ptReservaLegal, valorPositivo ptReservaOcacional, valorPositivo ptSuperavitPorValorizacion,
			valorPositivo ptResultadoEjerciciosAnteriores, valorPositivo ptResultadoDelEjercicio) {
		super();
		this.cdBalanceGral = cdBalanceGral;
		this.cdPatrimonio = cdPatrimonio;
		this.ptCapitalSuscritoYPagado = ptCapitalSuscritoYPagado;
		this.ptReservaLegal = ptReservaLegal;
		this.ptReservaOcacional = ptReservaOcacional;
		this.ptSuperavitPorValorizacion = ptSuperavitPorValorizacion;
		this.ptResultadoEjerciciosAnteriores = ptResultadoEjerciciosAnteriores;
		this.ptResultadoDelEjercicio = ptResultadoDelEjercicio;
	}
	
	
	public int getCdBalanceGral() {
		return cdBalanceGral;
	}



	public void setCdBalanceGral(int cdBalanceGral) {
		this.cdBalanceGral = cdBalanceGral;
	}



	public int getCdPatrimonio() {
		return cdPatrimonio;
	}



	public void setCdPatrimonio(int cdPatrimonio) {
		this.cdPatrimonio = cdPatrimonio;
	}



	public valorPositivo getPtCapitalSuscritoYPagado() {
		return ptCapitalSuscritoYPagado;
	}



	public void setPtCapitalSuscritoYPagado(valorPositivo ptCapitalSuscritoYPagado) {
		this.ptCapitalSuscritoYPagado = ptCapitalSuscritoYPagado;
	}



	public valorPositivo getPtReservaLegal() {
		return ptReservaLegal;
	}



	public void setPtReservaLegal(valorPositivo ptReservaLegal) {
		this.ptReservaLegal = ptReservaLegal;
	}



	public valorPositivo getPtReservaOcacional() {
		return ptReservaOcacional;
	}



	public void setPtReservaOcacional(valorPositivo ptReservaOcacional) {
		this.ptReservaOcacional = ptReservaOcacional;
	}



	public valorPositivo getPtSuperavitPorValorizacion() {
		return ptSuperavitPorValorizacion;
	}



	public void setPtSuperavitPorValorizacion(valorPositivo ptSuperavitPorValorizacion) {
		this.ptSuperavitPorValorizacion = ptSuperavitPorValorizacion;
	}



	public valorPositivo getPtResultadoEjerciciosAnteriores() {
		return ptResultadoEjerciciosAnteriores;
	}



	public void setPtResultadoEjerciciosAnteriores(valorPositivo ptResultadoEjerciciosAnteriores) {
		this.ptResultadoEjerciciosAnteriores = ptResultadoEjerciciosAnteriores;
	}



	public valorPositivo getPtResultadoDelEjercicio() {
		return ptResultadoDelEjercicio;
	}



	public void setPtResultadoDelEjercicio(valorPositivo ptResultadoDelEjercicio) {
		this.ptResultadoDelEjercicio = ptResultadoDelEjercicio;
	}



	
	
	
	
	
}
