/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Danilo
 */
@Entity
@Table(name = "agencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencias.findAll", query = "SELECT a FROM Agencias a"),
    @NamedQuery(name = "Agencias.findById", query = "SELECT a FROM Agencias a WHERE a.id = :id"),
    @NamedQuery(name = "Agencias.findByCodigo", query = "SELECT a FROM Agencias a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Agencias.findByDigito", query = "SELECT a FROM Agencias a WHERE a.digito = :digito"),
    @NamedQuery(name = "Agencias.findByEndereco", query = "SELECT a FROM Agencias a WHERE a.endereco = :endereco"),
    @NamedQuery(name = "Agencias.findByNome", query = "SELECT a FROM Agencias a WHERE a.nome = :nome")})
public class Agencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "digito")
    private String digito;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "nome")
    private String nome;

    public Agencias() {
    }

    public Agencias(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencias)) {
            return false;
        }
        Agencias other = (Agencias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Agencias[ id=" + id + " ]";
    }
    
}
