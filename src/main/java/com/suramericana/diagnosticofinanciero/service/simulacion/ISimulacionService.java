package com.suramericana.diagnosticofinanciero.service.simulacion;

import java.util.List;

import com.suramericana.diagnosticofinanciero.dto.simulacion;

/**
 * @author santaroc
 *
 */
public interface ISimulacionService {

	public List<simulacion> listarSimulacion(String cdsimulacion);
	public simulacion crearSimulacion(simulacion sim);
}
