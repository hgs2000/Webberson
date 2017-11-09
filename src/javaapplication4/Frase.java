package javaapplication4;

public class Frase {

    private String valor_frase;
    private boolean correto;
    private int id;

    public Frase(String val, boolean vf) {
        this.valor_frase = val;
        this.correto = vf;
    }

    public String get() {
        return this.valor_frase;
    }

    public void set(String val) {
        this.valor_frase = val;
    }

    public boolean correta() {
        return this.correto;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

}
