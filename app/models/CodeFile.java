package models;
import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CodeFile extends Model{
    @Id
    public String id;
    public String programmingLanguage;
    //jaka zmienna dla samego pliku? string czy PLIK?

    public CodeFile(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }
}

