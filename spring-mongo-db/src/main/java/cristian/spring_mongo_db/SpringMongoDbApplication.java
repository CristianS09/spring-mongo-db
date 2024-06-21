package cristian.spring_mongo_db;

import cristian.spring_mongo_db.model.User;
import cristian.spring_mongo_db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		//Salva uma entidade no banco de dados.
		userRepository.save(new User("jhenifer123","jhenifer@gmail.com"));
		//Lista todos os usuários cadastrados no banco de dados.
		for(User u : userRepository.findAll()){
			System.out.println(u);
		}
		//Deleta todos os usuários do banco de dados
		//userRepository.deleteAll();
	}
}
