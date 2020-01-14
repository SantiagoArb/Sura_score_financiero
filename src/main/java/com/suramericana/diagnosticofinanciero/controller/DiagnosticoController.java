package com.suramericana.diagnosticofinanciero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suramericana.diagnosticofinanciero.dto.diagnostico;
import com.suramericana.diagnosticofinanciero.service.diagnostico.IDiagnosticoService;

/**
 * @author santaroc
 *
 */
@RestController
@RequestMapping(value="/diagnostico")
public class DiagnosticoController {
	
	@Autowired
	private IDiagnosticoService diag_service;
	
	
	
	/*Recibe en el Body content type de tipo aplication/json  un json 
	 * {"cddiagnostico":"1","dniempresa":"2313","dsdiagnostico":"diagnostico 1","cdusuario":"125656","fealta":"","febaja":""}
	 * */
	/**
	 * @param diagDto
	 * @return
	 */
	@PostMapping(value="/creardiagnostico")
	public diagnostico crearDiagnosticos(@RequestBody diagnostico diagDto) {
		diagnostico resp = diag_service.crearDiagnostico(diagDto);
		System.out.println(resp.toString());
		return resp;
	}
	
	
	
	/**
	 * @param cdempresa
	 * @return
	 */
	@GetMapping(value="/listardiagnosticos")
	public List<diagnostico> obtenerDiagnosticos(@RequestParam(value="cdempresa") String cdempresa) {
		
		List<diagnostico> diagnosticos = diag_service.obtenerDiagnosticos(cdempresa);
		
		return diagnosticos;
	}
}
