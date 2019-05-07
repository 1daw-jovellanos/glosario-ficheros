package ficheros;

import modelo.Glosario;
import java.io.IOException;

public interface ICargar {
   public Glosario cargar(String filename) throws IOException;
}

