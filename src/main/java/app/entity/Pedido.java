
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
* Classe que representa a tabela PEDIDO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PEDIDO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pedido")
public class Pedido implements Serializable {
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
    @Column(name = "item", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String item;


    /**
    * @generated
    */
    @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidade;


    /**
    * Construtor
    * @generated
    */
    public Pedido(){
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
    public Pedido setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém item
    * return item
    * @generated
    */
    public java.lang.String getItem() {
        return this.item;
    }

    /**
    * Define item
    * @param item item
    * @generated
    */
    public Pedido setItem(java.lang.String item) {
        this.item = item;
        return this;
    }
    /**
    * Obtém quantidade
    * return quantidade
    * @generated
    */
    public java.lang.Integer getQuantidade() {
        return this.quantidade;
    }

    /**
    * Define quantidade
    * @param quantidade quantidade
    * @generated
    */
    public Pedido setQuantidade(java.lang.Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pedido object = (Pedido)obj;
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