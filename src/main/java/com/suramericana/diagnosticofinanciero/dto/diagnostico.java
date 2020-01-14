package com.suramericana.diagnosticofinanciero.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author santaroc
 *
 */
@Component
public class diagnostico {
	
	private int cddiagnostico;
	private String dniempresa;
	private String dsdiagnostico;
	private String cdusuario;
	private Date fealta;
	private Date febaja;
	
	public diagnostico() {
		
	}
	
	public diagnostico(int cddiagnostico, String dniempresa, String dsdiagnostico, String cdusuario, Date fealta,
			Date febaja) {
		this.cddiagnostico = cddiagnostico;
		this.dniempresa = dniempresa;
		this.dsdiagnostico = dsdiagnostico;
		this.cdusuario = cdusuario;
		this.fealta = fealta;
		this.febaja = febaja;
	}

	public int getCddiagnostico() {
		return cddiagnostico;
	}

	public void setCddiagnostico(int cddiagnostico) {
		this.cddiagnostico = cddiagnostico;
	}

	public String getDniempresa() {
		return dniempresa;
	}

	public void setDniempresa(String dniempresa) {
		this.dniempresa = dniempresa;
	}

	public String getDsdiagnostico() {
		return dsdiagnostico;
	}

	public void setDsdiagnostico(String dsdiagnostico) {
		this.dsdiagnostico = dsdiagnostico;
	}

	public String getCdusuario() {
		return cdusuario;
	}

	public void setCdusuario(String cdusuario) {
		this.cdusuario = cdusuario;
	}

	public Date getFealta() {
		return fealta;
	}

	public void setFealta(Date fealta) {
		this.fealta = fealta;
	}

	public Date getFebaja() {
		return febaja;
	}

	public void setFebaja(Date febaja) {
		this.febaja = febaja;
	}

	@Override
	public String toString() {
		return "diagnostico [cddiagnostico=" + cddiagnostico + ", dniempresa=" + dniempresa + ", dsdiagnostico="
				+ dsdiagnostico + ", cdusuario=" + cdusuario + ", fealta=" + fealta + ", febaja=" + febaja + "]";
	}

	
	
}
