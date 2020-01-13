package com.suramericana.diagnosticofinanciero.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suramericana.diagnosticofinanciero.dtos.simulacion;
import com.suramericana.diagnosticofinanciero.services.simulacion.simulacionService;

/**
 * @author santaroc
 *
 */
@RestController
@RequestMapping(value="/simulacion")
public class simulacionController {
	
	public final simulacionService sim_service = new simulacionService();
	
	@PostMapping(value="/crearsimulacion")
	public simulacion crearSimulacion(@RequestBody simulacion simDto) {
		
		return this.sim_service.crearSimulacion(simDto);
	}
	
	@GetMapping(value="/listarsimulacion")
	public List<simulacion> listarSimulaciones(@RequestParam(value="cdsimulacion")String cdsimulacion){
		
		return this.sim_service.listarSimulacion(cdsimulacion);
	}
}
