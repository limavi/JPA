package com.losalpes.entities;

import com.losalpes.entities.Pais;
import com.losalpes.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-10-20T06:18:05")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile ListAttribute<Ciudad, Pais> paisCollection;
    public static volatile ListAttribute<Ciudad, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Ciudad, String> nombre;

}