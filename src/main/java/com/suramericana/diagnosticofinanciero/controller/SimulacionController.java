package com.suramericana.diagnosticofinanciero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suramericana.diagnosticofinanciero.dto.simulacion;
import com.suramericana.diagnosticofinanciero.service.simulacion.ISimulacionService;

/**
 * @author santaroc
 *
 */
@RestController
@RequestMapping(value="/simulacion")
public class SimulacionController {
	
	@Autowired
	private ISimulacionService sim_service;
	
	@PostMapping(value="/crearsimulacion")
	public simulacion crearSimulacion(@RequestBody simulacion simDto) {
		
		return sim_service.crearSimulacion(simDto);
	}
	
	@GetMapping(value="/listarsimulacion")
	public List<simulacion> listarSimulaciones(@RequestParam(value="cdsimulacion")String cdsimulacion){
		
		return sim_service.listarSimulacion(cdsimulacion);
	}
}
