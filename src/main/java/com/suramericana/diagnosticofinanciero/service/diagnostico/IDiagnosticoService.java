package com.suramericana.diagnosticofinanciero.service.diagnostico;

import java.util.List;

import com.suramericana.diagnosticofinanciero.dto.diagnostico;

/**
 * @author santaroc
 *
 */
public interface IDiagnosticoService {
	
	public diagnostico crearDiagnostico(diagnostico diag);
	public List<diagnostico> obtenerDiagnosticos(String cdempresa);

}
