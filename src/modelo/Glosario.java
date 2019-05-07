package modelo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author victor
 */
public class Glosario {

    private String tema;
    private Map<String, String> terminos;

    public Glosario() {
        terminos = new TreeMap<>();
        setTema("");
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public void annadir(String termino, String definicion) {
        terminos.put(termino, definicion);
    }
    
    public int getCantidad() {
        return terminos.size();
    }

    public String buscar(String termino) {
        return terminos.get(termino);
    }
    
    public void vaciar() {
        terminos.clear();
    }
    
    public Set<String> getTerminos() {
        return terminos.keySet();
    }
}
