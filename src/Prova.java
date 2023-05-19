public class Prova {
    public String c;
    public int nww, i;

    public Prova(String c, int nww) {
        this.c = c;
        this.nww = nww;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public int getNww() {
        return nww;
    }

    public void setNww(int nww) {
        this.nww = nww;
    }


    public String ctoString() {
        return "Prova{" +
                "c='" + c + '\'' +
                ", nww=" + nww +
                ", i=" + i +
                '}';
    }
}
