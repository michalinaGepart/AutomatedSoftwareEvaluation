package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Bambi on 07.06.15.
 */
@Entity
public class Person extends Model {

    @Id
    public String id;  // can be for example matriculation number
    public String firstName;
    public String lastName;
    public String email;
    public String password;

    public Person(String name, String surname, String email, String password){
        firstName = name;
        lastName = surname;
        this.email = email;
        this.password = password;
    }

}
