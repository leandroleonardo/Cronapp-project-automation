
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela EVENTOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"EVENTOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Eventos")
public class Eventos implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "evento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String evento;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * @generated
    */
    @Column(name = "detalhes", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String detalhes;


    /**
    * @generated
    */
    @Column(name = "icone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String icone;


    /**
    * @generated
    */
    @Column(name = "posicao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String posicao;


    /**
    * Construtor
    * @generated
    */
    public Eventos(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Eventos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém evento
    * return evento
    * @generated
    */
    public java.lang.String getEvento() {
        return this.evento;
    }

    /**
    * Define evento
    * @param evento evento
    * @generated
    */
    public Eventos setEvento(java.lang.String evento) {
        this.evento = evento;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    public java.util.Date getData() {
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public Eventos setData(java.util.Date data) {
        this.data = data;
        return this;
    }
    /**
    * Obtém detalhes
    * return detalhes
    * @generated
    */
    public java.lang.String getDetalhes() {
        return this.detalhes;
    }

    /**
    * Define detalhes
    * @param detalhes detalhes
    * @generated
    */
    public Eventos setDetalhes(java.lang.String detalhes) {
        this.detalhes = detalhes;
        return this;
    }
    /**
    * Obtém icone
    * return icone
    * @generated
    */
    public java.lang.String getIcone() {
        return this.icone;
    }

    /**
    * Define icone
    * @param icone icone
    * @generated
    */
    public Eventos setIcone(java.lang.String icone) {
        this.icone = icone;
        return this;
    }
    /**
    * Obtém posicao
    * return posicao
    * @generated
    */
    public java.lang.String getPosicao() {
        return this.posicao;
    }

    /**
    * Define posicao
    * @param posicao posicao
    * @generated
    */
    public Eventos setPosicao(java.lang.String posicao) {
        this.posicao = posicao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Eventos object = (Eventos)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}