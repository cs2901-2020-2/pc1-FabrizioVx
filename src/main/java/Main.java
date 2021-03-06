import org.testng.Assert;

public class Main {
    public static void main(String[] args) {
        RegisterApp app = new RegisterApp();
        Client profesorc = new Client("Jesus");
        String profesor = "Jesus";
        String titulo = "2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.";
        String enlace = "https://utec.zoom.us/rec/share/";
        String profesorName = profesorc.registerName("Jesus");
        String profesorTitulo = profesorc.registerTitle("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");

        Assert.assertEquals(profesorName,profesor);
        Assert.assertEquals(profesorTitulo,titulo);
        Assert.assertTrue(app.validateTitulo(titulo));
    }

}
