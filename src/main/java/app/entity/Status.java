
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
* Classe que representa a tabela STATUS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"STATUS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Status")
public class Status implements Serializable {
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
    @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String status;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Pedido pedido;


    /**
    * Construtor
    * @generated
    */
    public Status(){
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
    public Status setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém status
    * return status
    * @generated
    */
    public java.lang.String getStatus() {
        return this.status;
    }

    /**
    * Define status
    * @param status status
    * @generated
    */
    public Status setStatus(java.lang.String status) {
        this.status = status;
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
    public Status setData(java.util.Date data) {
        this.data = data;
        return this;
    }
    /**
    * Obtém pedido
    * return pedido
    * @generated
    */
    public Pedido getPedido() {
        return this.pedido;
    }

    /**
    * Define pedido
    * @param pedido pedido
    * @generated
    */
    public Status setPedido(Pedido pedido) {
        this.pedido = pedido;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Status object = (Status)obj;
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