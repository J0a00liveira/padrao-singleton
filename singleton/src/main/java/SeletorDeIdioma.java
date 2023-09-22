public class SeletorDeIdioma {

    private SeletorDeIdioma() {};
    private static SeletorDeIdioma instance = new SeletorDeIdioma();
    public static SeletorDeIdioma getInstance() {
        return instance;
    }

    private String idiomaPadrao;

    public String getIdioma() {
        return idiomaPadrao;
    }

    public void setIdioma(String idiomaPadrao) {
        this.idiomaPadrao = idiomaPadrao;
    }
}
