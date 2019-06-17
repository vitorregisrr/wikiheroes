package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Heroi;
import modelo.Liga;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T08:31:14")
@StaticMetamodel(Gibi.class)
public class Gibi_ { 

    public static volatile SingularAttribute<Gibi, String> numeroserie;
    public static volatile SingularAttribute<Gibi, Liga> liga;
    public static volatile SingularAttribute<Gibi, Cliente> ocupado;
    public static volatile ListAttribute<Gibi, Heroi> herois;
    public static volatile SingularAttribute<Gibi, String> nome;
    public static volatile SingularAttribute<Gibi, Long> id;
    public static volatile SingularAttribute<Gibi, String> url;

}