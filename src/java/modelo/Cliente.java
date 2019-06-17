/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author vitor
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c"),
    @NamedQuery(name="Cliente.findFilter", query="SELECT c FROM Cliente c WHERE UPPER(c.nome) LIKE :filtro"),
})
public class Cliente implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Column(unique=true)
    private String cpf;
    private String endereco;
    private String telefone;
    @OneToOne(mappedBy = "ocupado")
    private Gibi gibi;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Gibi getGibi() {
        return gibi;
    }

    public void setGibi(Gibi gibi) {
        this.gibi = gibi;
    }

}
