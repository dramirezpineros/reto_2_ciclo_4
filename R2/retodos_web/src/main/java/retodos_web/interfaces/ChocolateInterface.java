
package retodos_web.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import retodos_web.modelo.Chocolate;


public interface ChocolateInterface extends MongoRepository<Chocolate, String>{
    
}
