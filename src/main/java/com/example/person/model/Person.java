package com.example.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person_db")
public class Person {
  @Id
  private String id;

  private String name;
  private String prenom;
  private String date;
  private String code;
  private String email;
  private String phone;


  public Person() {

  }

  public Person(String name, String prenom, String date,String code,String email,String phone) {
    this.name = name;
    this.prenom = prenom;
    this.date = date;
    this.code = code;
    this.email = email;
    this.phone = phone;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrenon() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
 
  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", prenom=" + prenom + ", date=" + date + ", code=" + code + ", email=" + email + ", phone=" + phone + "]";
  }
}