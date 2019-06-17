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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author luigh
 */
@NamedQueries({
    @NamedQuery(name="Heroi.findAll", query="SELECT h FROM Heroi h"),
    @NamedQuery(name="Heroi.findFilter", query="SELECT h FROM Heroi h WHERE UPPER(h.nome) LIKE :filtro")
})
@Entity
public class Heroi implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Column(length=355)
    private String url;
    private String poder;
    private String fraqueza;
    @ManyToOne
    private Liga liga;
    @ManyToMany(mappedBy = "herois")
    private List<Gibi> gibis;


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

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public List<Gibi> getGibis() {
        return gibis;
    }

    public void setGibis(List<Gibi> gibis) {
        this.gibis = gibis;
    }

    
}
