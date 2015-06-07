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
    public String id;
}
