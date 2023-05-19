import java.util.Arrays;

public class Tecnico {
    public String CF;
    public String Nome;
    public String Cognome;

    public Tecnico(String CF, String nome, String cognome) {
        this.CF = CF;
        this.Nome = nome;
        this.Cognome = cognome;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public Tecnico[] add(Tecnico[] tecnico , String CF, String Nome, String Cognome) {

        Tecnico[] listaAdd = new Tecnico[tecnico.length + 1];

        System.arraycopy(tecnico, 0, listaAdd, 0, tecnico.length);
        listaAdd[tecnico.length].CF = CF;
        listaAdd[tecnico.length].Nome = Nome;
        listaAdd[tecnico.length].Cognome = Cognome;

        return tecnico = listaAdd;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "CF='" + CF + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                '}';
    }
}
