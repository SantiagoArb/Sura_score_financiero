package com.suramericana.diagnosticofinanciero.service.diagnostico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suramericana.diagnosticofinanciero.dao.diagnostico.IDiagnosticoDao;
import com.suramericana.diagnosticofinanciero.dto.diagnostico;

/**
 * @author santaroc
 *
 */

@Service
public class DiagnosticoServiceImpl implements IDiagnosticoService{
	
	@Autowired
	private IDiagnosticoDao diagnosticoDao;
	
	/**
	 * @param diag
	 * @return
	 */
	@Override
	public diagnostico crearDiagnostico(diagnostico diag) {
		
		return diag;
	}
	
	/**
	 * @param cdempresa
	 * @return
	 */
	@Override
	public List<diagnostico> obtenerDiagnosticos(String cdempresa){
		
		ArrayList<diagnostico> diagnosticos = new ArrayList<diagnostico>();
		
		diagnosticos.add(new diagnostico(1,"2313","diagnostico 1","111", new Date(),new Date()));
		diagnosticos.add(new diagnostico(2,"2313","diagnostico 2","111", new Date(),new Date()));
		diagnosticos.add(new diagnostico(3,"2314","diagnostico 3","222", new Date(),new Date()));
		diagnosticos.add(new diagnostico(4,"2314","diagnostico 4","222", new Date(),new Date()));
		
		List<diagnostico> respuesta = diagnosticos.stream()
										.filter(diagno -> cdempresa.equalsIgnoreCase(diagno.getDniempresa()))
										.collect(Collectors.toList());
		
		return respuesta;
		
	}

}
