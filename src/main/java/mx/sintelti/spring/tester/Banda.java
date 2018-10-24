package mx.sintelti.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")
public class Banda implements PlayList {

    @Override
    public String getName() {
        return "Banda"; //retorna el nombre del genero
    }


}
