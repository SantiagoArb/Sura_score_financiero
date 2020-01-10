package com.suramericana.diagnosticofinanciero.types;

import java.math.BigDecimal;
import com.google.common.base.Preconditions;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class valorPositivo {
	
	//factory
	public static valorPositivo of(BigDecimal value){
        return new valorPositivo(value);
    }

	private final BigDecimal value;
	
    private valorPositivo(BigDecimal value) {
        Preconditions.checkNotNull(value, "El valor no puede ser nulo");
        Preconditions.checkArgument(value.compareTo(BigDecimal.ZERO) != -1, "El valor no puede ser negativo");
        this.value = value;
    }

	public BigDecimal getValue() {
		return value;
	}
    
    
    
}
