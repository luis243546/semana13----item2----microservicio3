package com.personal.personal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item2 {
    private Personal personal;

    public String getSucursales() {
	
		if (personal.getLugarTrabajo().equals("Jr. Asamblea 200")) {
			return "SUCURSAL 1";
		} 

        if (personal.getLugarTrabajo().equals("Av. del ejercito 1520")) {
            return "SUCURSAL 2";
        }

        if (personal.getLugarTrabajo().equals("Av. los Incas 576")) {
            return "SUCURSAL 3";
        } else {
            return null;
        }

    }


    public String getCargos(){
        if (personal.getCargo().equals("Administrador") | personal.getCargo().equals("Contador")) {
			return "TECNICO I";
		} 

        if (personal.getCargo().equals("Secretaria") | personal.getCargo().equals("Seguridad")) {
            return "TECNICO II";
        } else {
            return null;
        }
    }

}
