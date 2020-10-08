import java.util.Observable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegisterApp extends Observable {
    private String nombre;
    private String titulo;
    private String enlace;
    String[] RegisterData = new String[3];

    public boolean validateTitulo(String titulo){
        Pattern pattern = Pattern.compile("[0-9]{4}-I{1,2} [A-Z0-9]{6} [E][S|N] [[A-Za-z0-9á-ú]* ]*, [0-9]{1,2}, Semana[0-9]{2}, [[A-Za-z]* ]*,[0-9]{2}/[0-9]{2} [0-9]{2}:[0-9]{2}-[0-9]{2}:[0-9]{2} Laboratorio.|Teoria.", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(titulo);
        return matcher.find();
    }
    public void agregarData() throws Exception {
        RegisterData[0] = nombre;
        RegisterData[1] = titulo;
        RegisterData[2] = enlace;
        if(validateTitulo(titulo)){
            notifyObservers(RegisterData);
        }else{
            throw new Exception("ERROR");
        }
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnlace() {
        return enlace;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public String[] getRegisterData() {
        return RegisterData;
    }
}
