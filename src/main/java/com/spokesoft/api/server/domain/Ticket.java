
public int getId(){return id;}

public void setId(int id){this.id=id;}

public String getName(){return name;}

public void setName(String name){this.name=name;}

public String getEmail(){return email;}

public void setEmail(String email){this.email=email;}

public int getAge(){return age;}

public void setAge(int age){this.age=age;}

public void updateWith(Ticket upToDatePerson){this.age=upToDatePerson.age;this.email=upToDatePerson.email;
package com.spokesoft.api.server.domain;

import java.util.Date;
import java.util.List;

/**
 * Simple ticket for demo purposes
 * 
 * @author Mark Crowley
 *
 */
public class Ticket {

  private int id;
  private String subject;
  private String description;
  private Priority priority;
  private Status status;
  private Date created;
  private Date sla;
  private List<Note> notes;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void updateWith(Ticket upToDatePerson) {
    this.age = upToDatePerson.age;
    this.email = upToDatePerson.email;
    this.name = upToDatePerson.name;
  }

}
