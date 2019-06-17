package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Gibi;
import modelo.Liga;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T08:31:14")
@StaticMetamodel(Heroi.class)
public class Heroi_ { 

    public static volatile SingularAttribute<Heroi, String> fraqueza;
    public static volatile SingularAttribute<Heroi, Liga> liga;
    public static volatile ListAttribute<Heroi, Gibi> gibis;
    public static volatile SingularAttribute<Heroi, String> nome;
    public static volatile SingularAttribute<Heroi, Long> id;
    public static volatile SingularAttribute<Heroi, String> poder;
    public static volatile SingularAttribute<Heroi, String> url;

}