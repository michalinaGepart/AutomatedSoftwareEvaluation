package models;

import play.db.jpa.JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person{

    @Id @GeneratedValue
    public int id;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public int matriculationNumber;

    public Person(String name, String surname, String email, String password){
        firstName = name;
        lastName = surname;
        this.email = email;
        this.password = password;
    }
//    public static Person find(int personID){
//        TypedQuery<Person> query = JPA.em().createQuery("SELECT p FROM Person p WHERE p.id = :personID", Person.class);
//        query.setParameter("personID", personID);
//        return (Person) Helper.JpaResultHelper.getSingleResultOrNull(query);
//    }
//
//    public static Person find(String personEmail){
//        TypedQuery<Person> query = JPA.em().createQuery("SELECT p FROM Person p WHERE p.email = :email", Person.class);
//        query.setParameter("email", email);
//        return (Person) Helper.JpaResultHelper.getSingleResultOrNull(query);
//    }

    public void save() {
        JPA.em().persist(this);
    }

}
