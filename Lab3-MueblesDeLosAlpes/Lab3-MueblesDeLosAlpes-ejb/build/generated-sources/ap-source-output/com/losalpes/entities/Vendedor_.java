package com.losalpes.entities;

import com.losalpes.entities.ExperienciaVendedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-10-20T06:18:05")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ { 

    public static volatile SingularAttribute<Vendedor, String> apellidos;
    public static volatile SingularAttribute<Vendedor, String> foto;
    public static volatile ListAttribute<Vendedor, ExperienciaVendedor> experiencia;
    public static volatile SingularAttribute<Vendedor, Double> salario;
    public static volatile SingularAttribute<Vendedor, Long> id;
    public static volatile SingularAttribute<Vendedor, Double> comisionVentas;
    public static volatile SingularAttribute<Vendedor, String> nombres;
    public static volatile SingularAttribute<Vendedor, String> perfil;

}