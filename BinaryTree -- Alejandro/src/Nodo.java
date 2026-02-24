public class Nodo {
    int numero;
    Nodo hijoD;
    Nodo hijoI;

    public Nodo(int  numero){
        this.numero =numero;
        this.hijoD=null;
        this.hijoI=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getHijoD() {
        return hijoD;
    }

    public void setHijoD(Nodo hijoD) {
        this.hijoD = hijoD;
    }

    public Nodo getHijoI() {
        return hijoI;
    }

    public void setHijoI(Nodo hijoI) {
        this.hijoI = hijoI;
    }
}
