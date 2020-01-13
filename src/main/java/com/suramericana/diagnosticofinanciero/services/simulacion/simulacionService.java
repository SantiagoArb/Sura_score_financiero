package com.suramericana.diagnosticofinanciero.services.simulacion;

import java.util.List;

import com.suramericana.diagnosticofinanciero.dtos.simulacion;

/**
 * @author santaroc
 *
 */
public class simulacionService {
	
	
	/**
	 * @param cdsimulacion
	 * @return
	 */
	public List<simulacion> listarSimulacion(String cdsimulacion){
		List<simulacion> listSimulaciones = null;
		
		System.out.println("buscar : "+ cdsimulacion);
		return listSimulaciones;
	}
	
	/**
	 * @param sim
	 * @return
	 */
	public simulacion crearSimulacion(simulacion sim) {
		
		return sim;
	}
	

}
