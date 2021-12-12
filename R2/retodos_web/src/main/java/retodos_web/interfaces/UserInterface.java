
package retodos_web.interfaces;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import retodos_web.modelo.User;


public interface UserInterface extends MongoRepository<User, Integer>{
    
    Optional<User> findByEmail (String email);
    Optional<User> findByEmailAndPassword (String email, String password);
    
}
