import java.util.Observable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegisterApp extends Observable {
    private String nombre;
    private String titulo;
    private String enlace;
    String[] data = new String[3];

    public boolean validateTitulo(String titulo){
        Pattern pattern = Pattern.compile("[0-9]{4}-I{1,2} [A-Z0-9]{6} [E][S|N] [[A-Za-z0-9á-ú]* ]*, [0-9]{1,2}, Semana[0-9]{2}, [[A-Za-z]* ]*,[0-9]{2}/[0-9]{2} [0-9]{2}:[0-9]{2}-[0-9]{2}:[0-9]{2} Laboratorio.|Teoria.", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(titulo);
        return matcher.find();
    }
    public boolean agregarData() throws validateErrorException {
        data[0] = nombre;
        data[1] = titulo;
        data[2] = enlace;
        if(validateTitulo(titulo)){
            notifyObservers(data);
            return true;
        }else{
            throw new validateErrorException("ERROR");
        }
    }

    public String getNombre() {
        return nombre;
    }
}
