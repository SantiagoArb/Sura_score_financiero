package com.suramericana.diagnosticofinanciero.service.simulacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suramericana.diagnosticofinanciero.dao.simulacion.ISimulacionDao;
import com.suramericana.diagnosticofinanciero.dto.simulacion;

/**
 * @author santaroc
 *
 */
@Service
public class SimulacionServiceImpl implements ISimulacionService{
	
	@Autowired
	private ISimulacionDao simDao;
	/**
	 * @param cdsimulacion
	 * @return
	 */
	@Override
	public List<simulacion> listarSimulacion(String cdsimulacion){
		List<simulacion> listSimulaciones = null;
		
		System.out.println("buscar : "+ cdsimulacion);
		return listSimulaciones;
	}
	
	/**
	 * @param sim
	 * @return
	 */
	@Override
	public simulacion crearSimulacion(simulacion sim) {
		
		return sim;
	}
	

}
