/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import modelo.Glosario;
import java.io.IOException;

public interface IGuardar {
   public void guardar(Glosario glosario, String filename) throws IOException;
}
