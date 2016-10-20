package com.losalpes.entities;

import com.losalpes.entities.Ciudad;
import com.losalpes.entities.Profesion;
import com.losalpes.entities.RegistroVenta;
import com.losalpes.entities.TipoDocumento;
import com.losalpes.entities.TipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-10-20T06:18:05")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, Long> documento;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, String> nombreCompleto;
    public static volatile SingularAttribute<Usuario, Boolean> seleccion;
    public static volatile SingularAttribute<Usuario, Long> telefonoCelular;
    public static volatile SingularAttribute<Usuario, TipoDocumento> tipoDocumento;
    public static volatile ListAttribute<Usuario, RegistroVenta> compras;
    public static volatile SingularAttribute<Usuario, Ciudad> ciudad;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, TipoUsuario> tipoUsuario;
    public static volatile SingularAttribute<Usuario, Long> telefonoLocal;
    public static volatile SingularAttribute<Usuario, Profesion> profesion;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}