package cristian.spring_mongo_db.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//Classe entidade
@Document("user")
public class User {
    //Atributos
    @Id
    public String id;

    public String email;
    @Field("password")
    public String passWord;

    //Construtor padrão
    public User(){}

    public User(String passWord, String email) {
        this.passWord = passWord;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' + '}';
    }
}
