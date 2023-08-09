
package DSAgenda.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela AGENDA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"AGENDA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("DSAgenda.entity.Agenda")
public class Agenda implements Serializable {
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
    @Column(name = "title", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String title;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date start;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date end;


    /**
    * @generated
    */
    @Column(name = "startTimezone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String startTimezone;


    /**
    * @generated
    */
    @Column(name = "endTimezone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endTimezone;


    /**
    * @generated
    */
    @Column(name = "description", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String description;


    /**
    * @generated
    */
    @Column(name = "recurrenceId", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recurrenceId;


    /**
    * @generated
    */
    @Column(name = "recurrenceRule", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recurrenceRule;


    /**
    * @generated
    */
    @Column(name = "recurrenceException", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recurrenceException;


    /**
    * @generated
    */
    @Column(name = "isAllDay", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean isAllDay;


    /**
    * Construtor
    * @generated
    */
    public Agenda(){
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
    public Agenda setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém title
    * return title
    * @generated
    */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
    * Define title
    * @param title title
    * @generated
    */
    public Agenda setTitle(java.lang.String title) {
        this.title = title;
        return this;
    }
    /**
    * Obtém start
    * return start
    * @generated
    */
    public java.util.Date getStart() {
        return this.start;
    }

    /**
    * Define start
    * @param start start
    * @generated
    */
    public Agenda setStart(java.util.Date start) {
        this.start = start;
        return this;
    }
    /**
    * Obtém end
    * return end
    * @generated
    */
    public java.util.Date getEnd() {
        return this.end;
    }

    /**
    * Define end
    * @param end end
    * @generated
    */
    public Agenda setEnd(java.util.Date end) {
        this.end = end;
        return this;
    }
    /**
    * Obtém startTimezone
    * return startTimezone
    * @generated
    */
    public java.lang.String getStartTimezone() {
        return this.startTimezone;
    }

    /**
    * Define startTimezone
    * @param startTimezone startTimezone
    * @generated
    */
    public Agenda setStartTimezone(java.lang.String startTimezone) {
        this.startTimezone = startTimezone;
        return this;
    }
    /**
    * Obtém endTimezone
    * return endTimezone
    * @generated
    */
    public java.lang.String getEndTimezone() {
        return this.endTimezone;
    }

    /**
    * Define endTimezone
    * @param endTimezone endTimezone
    * @generated
    */
    public Agenda setEndTimezone(java.lang.String endTimezone) {
        this.endTimezone = endTimezone;
        return this;
    }
    /**
    * Obtém description
    * return description
    * @generated
    */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
    * Define description
    * @param description description
    * @generated
    */
    public Agenda setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }
    /**
    * Obtém recurrenceId
    * return recurrenceId
    * @generated
    */
    public java.lang.String getRecurrenceId() {
        return this.recurrenceId;
    }

    /**
    * Define recurrenceId
    * @param recurrenceId recurrenceId
    * @generated
    */
    public Agenda setRecurrenceId(java.lang.String recurrenceId) {
        this.recurrenceId = recurrenceId;
        return this;
    }
    /**
    * Obtém recurrenceRule
    * return recurrenceRule
    * @generated
    */
    public java.lang.String getRecurrenceRule() {
        return this.recurrenceRule;
    }

    /**
    * Define recurrenceRule
    * @param recurrenceRule recurrenceRule
    * @generated
    */
    public Agenda setRecurrenceRule(java.lang.String recurrenceRule) {
        this.recurrenceRule = recurrenceRule;
        return this;
    }
    /**
    * Obtém recurrenceException
    * return recurrenceException
    * @generated
    */
    public java.lang.String getRecurrenceException() {
        return this.recurrenceException;
    }

    /**
    * Define recurrenceException
    * @param recurrenceException recurrenceException
    * @generated
    */
    public Agenda setRecurrenceException(java.lang.String recurrenceException) {
        this.recurrenceException = recurrenceException;
        return this;
    }
    /**
    * Obtém isAllDay
    * return isAllDay
    * @generated
    */
    public java.lang.Boolean getIsAllDay() {
        return this.isAllDay;
    }

    /**
    * Define isAllDay
    * @param isAllDay isAllDay
    * @generated
    */
    public Agenda setIsAllDay(java.lang.Boolean isAllDay) {
        this.isAllDay = isAllDay;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Agenda object = (Agenda)obj;
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