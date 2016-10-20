/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.RegistroVenta;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author dito
 */
@Stateless
public class ServicioReportesMock implements IServicioReportesMockLocal {

    @EJB
    private IServicioPersistenciaMockLocal persistencia;
    
    @Override
    public List<RegistroVenta> darListadoCompras(String usuario) {
        return persistencia.getAllCompras(usuario);
    }

}
