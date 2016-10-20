

package com.losalpes.beans;

import com.losalpes.entities.RegistroVenta;
import com.losalpes.servicios.IServicioReportesMockLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;


/**
 * Managed bean encargado del catálogo de muebles en el sistema
 * 
 */
public class ReporteVentasBean implements Serializable
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    @EJB
    private IServicioReportesMockLocal reporte;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    public ReporteVentasBean()
    {
        
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Retornar el listado de compras de un usuario
     */
    public List<RegistroVenta> darListadoCompras(){
        //System.out.println("Se envia el listado de compras:");
        //System.out.println(reporte.darListadoCompras("eduardo"));
        return reporte.darListadoCompras("eduardo");
    }


}
