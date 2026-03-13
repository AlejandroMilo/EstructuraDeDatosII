public class Nodo {
    private Partido valor;
    private Nodo izquierdo;
    private Nodo derecho;

    public Partido getValor() {
        return valor;
    }

    public void setValor(Partido valor) {
        this.valor = valor;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public Nodo(Partido valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;


    }
}
