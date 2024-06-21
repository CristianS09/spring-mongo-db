package cristian.spring_mongo_db.repository;

import cristian.spring_mongo_db.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {
    public List<User> findByPassWord(String passWord);
}
