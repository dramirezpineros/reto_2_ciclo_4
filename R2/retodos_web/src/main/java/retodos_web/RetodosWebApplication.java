package retodos_web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import retodos_web.interfaces.ChocolateInterface;
import retodos_web.interfaces.UserInterface;


@Component
@SpringBootApplication
public class RetodosWebApplication implements CommandLineRunner {

    @Autowired
    private ChocolateInterface interfaceChocolate;

    @Autowired
    private UserInterface interfaceUser;

    public static void main(String[] args) {
        SpringApplication.run(RetodosWebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll();

    }
}
