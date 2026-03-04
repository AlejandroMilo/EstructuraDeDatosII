public class Nodo {
    int numero;
    Nodo hijoI;
    Nodo hijoD;

    public Nodo(int  numero){
        this.numero =numero;
        this.hijoI=null;
        this.hijoD=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getHijoI() {
        return hijoI;
    }

    public void setHijoI(Nodo hijoI) {
        this.hijoI = hijoI;
    }

    public Nodo getHijoD() {
        return hijoD;
    }

    public void setHijoD(Nodo hijoD) {
        this.hijoD = hijoD;
    }
}

