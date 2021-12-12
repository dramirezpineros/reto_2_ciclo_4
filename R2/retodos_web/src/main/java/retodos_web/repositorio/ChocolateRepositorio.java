
package retodos_web.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retodos_web.interfaces.ChocolateInterface;
import retodos_web.modelo.Chocolate;


@Repository
public class ChocolateRepositorio {
    
    @Autowired
    private ChocolateInterface repository;
    
        public List<Chocolate> getAll() {
        return repository.findAll();
    }
        
    public Optional<Chocolate> getClothe(String reference){
        return repository.findById(reference);
    }
    
    public Chocolate create(Chocolate clothe) {
        return repository.save(clothe);
    }

    public void update(Chocolate clothe) {
        repository.save(clothe);
    }
    
    public void delete(Chocolate clothe) {
        repository.delete(clothe);
    }    
}
