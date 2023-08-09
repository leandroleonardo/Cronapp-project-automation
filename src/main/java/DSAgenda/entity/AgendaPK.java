package DSAgenda.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class AgendaPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.String startTimezone = UUID.randomUUID().toString().toUpperCase();

  /**
   * Construtor
   * @generated
   */
  public AgendaPK(){
  }

  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public AgendaPK setId(java.lang.String id){
    this.id = id;
    return this;
  }
  /**
   * Obtém startTimezone
   * return startTimezone
   * @generated
   */
  public java.lang.String getStartTimezone(){
    return this.startTimezone;
  }

  /**
   * Define startTimezone
   * @param startTimezone startTimezone
   * @generated
   */
  public AgendaPK setStartTimezone(java.lang.String startTimezone){
    this.startTimezone = startTimezone;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
AgendaPK object = (AgendaPK)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (startTimezone != null ? !startTimezone.equals(object.startTimezone) : object.startTimezone != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((startTimezone == null) ? 0 : startTimezone.hashCode());
    return result;
  }

}
