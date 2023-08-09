
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
* Classe que representa a tabela TRIPULACAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TRIPULACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tripulacao")
public class Tripulacao implements Serializable {
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
    @Column(name = "tripulante", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tripulante;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tripulacao_0", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Tripulacao capitao;


    /**
    * Construtor
    * @generated
    */
    public Tripulacao(){
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
    public Tripulacao setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém tripulante
    * return tripulante
    * @generated
    */
    public java.lang.String getTripulante() {
        return this.tripulante;
    }

    /**
    * Define tripulante
    * @param tripulante tripulante
    * @generated
    */
    public Tripulacao setTripulante(java.lang.String tripulante) {
        this.tripulante = tripulante;
        return this;
    }
    /**
    * Obtém capitao
    * return capitao
    * @generated
    */
    public Tripulacao getCapitao() {
        return this.capitao;
    }

    /**
    * Define capitao
    * @param capitao capitao
    * @generated
    */
    public Tripulacao setCapitao(Tripulacao capitao) {
        this.capitao = capitao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Tripulacao object = (Tripulacao)obj;
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