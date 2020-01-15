package com.suramericana.diagnosticofinanciero.dto;

import com.suramericana.diagnosticofinanciero.type.valorPositivo;

public class pasivo {
	
	private int cdPasivos;
	private int cdBalanceGral;
	private valorPositivo ptObligacionesFinancieras;
	private valorPositivo ptCuentasPorPagarAProveedores;
	private valorPositivo ptCXPPorComisionesUHonorarios;
	private valorPositivo ptCXPACasaMatrizFiliales;
	private valorPositivo ptImpuestosGravamenesTasas;
	private valorPositivo ptCuentasPorPagarAEmpleados;
	private valorPositivo ptPasivosEstimadosYProvisiones;
	private valorPositivo ptPasivosDiferidos;
	private valorPositivo ptOtrosPasivos;
	
	public pasivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public pasivo(int cdPasivos, int cdBalanceGral, valorPositivo ptObligacionesFinancieras,
			valorPositivo ptCuentasPorPagarAProveedores, valorPositivo ptCXPPorComisionesUHonorarios,
			valorPositivo ptCXPACasaMatrizFiliales, valorPositivo ptImpuestosGravamenesTasas,
			valorPositivo ptCuentasPorPagarAEmpleados, valorPositivo ptPasivosEstimadosYProvisiones,
			valorPositivo ptPasivosDiferidos, valorPositivo ptOtrosPasivos) {
		super();
		this.cdPasivos = cdPasivos;
		this.cdBalanceGral = cdBalanceGral;
		this.ptObligacionesFinancieras = ptObligacionesFinancieras;
		this.ptCuentasPorPagarAProveedores = ptCuentasPorPagarAProveedores;
		this.ptCXPPorComisionesUHonorarios = ptCXPPorComisionesUHonorarios;
		this.ptCXPACasaMatrizFiliales = ptCXPACasaMatrizFiliales;
		this.ptImpuestosGravamenesTasas = ptImpuestosGravamenesTasas;
		this.ptCuentasPorPagarAEmpleados = ptCuentasPorPagarAEmpleados;
		this.ptPasivosEstimadosYProvisiones = ptPasivosEstimadosYProvisiones;
		this.ptPasivosDiferidos = ptPasivosDiferidos;
		this.ptOtrosPasivos = ptOtrosPasivos;
	}
	
	public int getCdPasivos() {
		return cdPasivos;
	}
	public void setCdPasivos(int cdPasivos) {
		this.cdPasivos = cdPasivos;
	}
	public int getCdBalanceGral() {
		return cdBalanceGral;
	}
	public void setCdBalanceGral(int cdBalanceGral) {
		this.cdBalanceGral = cdBalanceGral;
	}
	public valorPositivo getPtObligacionesFinancieras() {
		return ptObligacionesFinancieras;
	}
	public void setPtObligacionesFinancieras(valorPositivo ptObligacionesFinancieras) {
		this.ptObligacionesFinancieras = ptObligacionesFinancieras;
	}
	public valorPositivo getPtCuentasPorPagarAProveedores() {
		return ptCuentasPorPagarAProveedores;
	}
	public void setPtCuentasPorPagarAProveedores(valorPositivo ptCuentasPorPagarAProveedores) {
		this.ptCuentasPorPagarAProveedores = ptCuentasPorPagarAProveedores;
	}
	public valorPositivo getPtCXPPorComisionesUHonorarios() {
		return ptCXPPorComisionesUHonorarios;
	}
	public void setPtCXPPorComisionesUHonorarios(valorPositivo ptCXPPorComisionesUHonorarios) {
		this.ptCXPPorComisionesUHonorarios = ptCXPPorComisionesUHonorarios;
	}
	public valorPositivo getPtCXPACasaMatrizFiliales() {
		return ptCXPACasaMatrizFiliales;
	}
	public void setPtCXPACasaMatrizFiliales(valorPositivo ptCXPACasaMatrizFiliales) {
		this.ptCXPACasaMatrizFiliales = ptCXPACasaMatrizFiliales;
	}
	public valorPositivo getPtImpuestosGravamenesTasas() {
		return ptImpuestosGravamenesTasas;
	}
	public void setPtImpuestosGravamenesTasas(valorPositivo ptImpuestosGravamenesTasas) {
		this.ptImpuestosGravamenesTasas = ptImpuestosGravamenesTasas;
	}
	public valorPositivo getPtCuentasPorPagarAEmpleados() {
		return ptCuentasPorPagarAEmpleados;
	}
	public void setPtCuentasPorPagarAEmpleados(valorPositivo ptCuentasPorPagarAEmpleados) {
		this.ptCuentasPorPagarAEmpleados = ptCuentasPorPagarAEmpleados;
	}
	public valorPositivo getPtPasivosEstimadosYProvisiones() {
		return ptPasivosEstimadosYProvisiones;
	}
	public void setPtPasivosEstimadosYProvisiones(valorPositivo ptPasivosEstimadosYProvisiones) {
		this.ptPasivosEstimadosYProvisiones = ptPasivosEstimadosYProvisiones;
	}
	public valorPositivo getPtPasivosDiferidos() {
		return ptPasivosDiferidos;
	}
	public void setPtPasivosDiferidos(valorPositivo ptPasivosDiferidos) {
		this.ptPasivosDiferidos = ptPasivosDiferidos;
	}
	public valorPositivo getPtOtrosPasivos() {
		return ptOtrosPasivos;
	}
	public void setPtOtrosPasivos(valorPositivo ptOtrosPasivos) {
		this.ptOtrosPasivos = ptOtrosPasivos;
	}
	
	

}

