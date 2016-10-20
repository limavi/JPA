package com.losalpes.entities;

import com.losalpes.entities.RegistroVenta;
import com.losalpes.entities.TipoMueble;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-10-20T06:18:05")
@StaticMetamodel(Mueble.class)
public class Mueble_ { 

    public static volatile SingularAttribute<Mueble, String> descripcion;
    public static volatile SingularAttribute<Mueble, TipoMueble> tipo;
    public static volatile SingularAttribute<Mueble, Double> precio;
    public static volatile SingularAttribute<Mueble, String> imagen;
    public static volatile SingularAttribute<Mueble, Integer> cantidad;
    public static volatile ListAttribute<Mueble, RegistroVenta> registroventaCollection;
    public static volatile SingularAttribute<Mueble, String> nombre;
    public static volatile SingularAttribute<Mueble, Boolean> seleccion;
    public static volatile SingularAttribute<Mueble, Long> referencia;

}