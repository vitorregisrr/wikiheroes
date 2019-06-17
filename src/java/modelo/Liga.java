/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author luigh
 */
@NamedQueries({
    @NamedQuery(name="Liga.findAll", query="SELECT l FROM Liga l"),
    @NamedQuery(name="Liga.findFilter", query="SELECT i FROM Liga i WHERE UPPER(i.nome) LIKE :filtro")

})
@Entity
public class Liga implements Serializable {

    @OneToMany(mappedBy = "liga")
    private List<Gibi> gibis;


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Column(length=355)
    private String url;
    private String descricao;
    @OneToMany(mappedBy = "liga")
    private List<Heroi> herois;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(List<Heroi> herois) {
        this.herois = herois;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Gibi> getGibis() {
        return gibis;
    }

    public void setGibis(List<Gibi> gibis) {
        this.gibis = gibis;
    }
    
    
}
