package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Gibi;
import modelo.Heroi;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T08:31:14")
@StaticMetamodel(Liga.class)
public class Liga_ { 

    public static volatile ListAttribute<Liga, Gibi> gibis;
    public static volatile ListAttribute<Liga, Heroi> herois;
    public static volatile SingularAttribute<Liga, String> nome;
    public static volatile SingularAttribute<Liga, Long> id;
    public static volatile SingularAttribute<Liga, String> url;
    public static volatile SingularAttribute<Liga, String> descricao;

}