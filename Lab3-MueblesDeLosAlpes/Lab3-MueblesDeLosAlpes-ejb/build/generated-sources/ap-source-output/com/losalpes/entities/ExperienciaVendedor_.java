package com.losalpes.entities;

import com.losalpes.entities.Vendedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-10-20T06:18:05")
@StaticMetamodel(ExperienciaVendedor.class)
public class ExperienciaVendedor_ { 

    public static volatile SingularAttribute<ExperienciaVendedor, String> nombreEmpesa;
    public static volatile SingularAttribute<ExperienciaVendedor, String> descripcion;
    public static volatile SingularAttribute<ExperienciaVendedor, Integer> ano;
    public static volatile SingularAttribute<ExperienciaVendedor, Long> id;
    public static volatile SingularAttribute<ExperienciaVendedor, String> cargo;
    public static volatile ListAttribute<ExperienciaVendedor, Vendedor> vendedorCollection;

}