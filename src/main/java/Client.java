import java.util.Observable;
import java.util.Observer;


public class Client implements Observer{
    private String nombre;

    String[] data = new String[3];

    Client(String name){
        this.nombre = name;
    }

    public void update(Observable app,Object values){
        this.data = (String [])values;
    }

    public String[] getData(){
        return data;
    }

    public String registerName(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public String registerTitle(String title){
        return title;
    }

    public String registerEnlace(String enlace){
        return enlace;
    }

}


class DGA extends Client{
    DGA(String name) {
        super(name);
    }
}

class CounterDocentes extends Client{
    CounterDocentes(String name) {
        super(name);
    }
}

class CounterAlumnos extends Client{
    CounterAlumnos(String name) {
        super(name);
    }
}

