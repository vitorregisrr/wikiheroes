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
import javax.persistence.OneToOne;

@NamedQueries({
    @NamedQuery(name="Gibi.findAll", query="SELECT g FROM Gibi g"),
    @NamedQuery(name="Gibi.findFilter", query="SELECT g FROM Gibi g WHERE UPPER(g.nome) LIKE :filtro"),
    @NamedQuery(name="Gibi.findAlugavel", query="SELECT g FROM Gibi g WHERE g.ocupado IS NULL")
})
@Entity
public class Gibi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String numeroserie;
    @Column(length=1000)
    private String url;
    @ManyToOne
    private Liga liga;
    @ManyToMany
    private List<Heroi> herois;
    @OneToOne
    private Cliente ocupado;

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

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(List<Heroi> herois) {
        this.herois = herois;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Cliente getOcupado() {
        return ocupado;
    }

    public void setOcupado(Cliente ocupado) {
        this.ocupado = ocupado;
    }

    
}
