import org.testng.Assert;

import org.testng.annotations.Test;


@Test
public class RegisterAppTest {

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void sameTimeTest() throws validateErrorException {
        RegisterApp app = new RegisterApp();
        Client profesorc = new CounterAlumnos("JNE");
        String profesor = "Jesus";
        String titulo = "2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.";
        String enlace = "https://utec.zoom.us/rec/share/";
        String profesorName = profesorc.registerName("Jesus");
        String profesorTitulo = profesorc.registerTitle("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");

        Assert.assertFalse(app.validateTitulo(titulo));
        Assert.assertEquals(profesorName,profesor);
        Assert.assertEquals(profesorTitulo,titulo);
    }

}
