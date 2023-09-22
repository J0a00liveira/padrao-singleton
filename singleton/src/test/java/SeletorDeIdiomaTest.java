import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeletorDeIdiomaTest {

    @Test
    public void deveRetornarIdiomaPadrao() {
        SeletorDeIdioma.getInstance().setIdioma("portugues");
        assertEquals("portugues", SeletorDeIdioma.getInstance().getIdioma());
    }

}