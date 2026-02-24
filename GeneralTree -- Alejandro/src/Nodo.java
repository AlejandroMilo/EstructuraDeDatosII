import java.util.LinkedList;
public class Nodo<E> {
    public E info;
    public LinkedList<Nodo<E>> hijos;

    public Nodo(E info) {
        this.info = info;
        hijos=new LinkedList<>();
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public LinkedList<Nodo<E>> getHijos() {
        return hijos;
    }

    public void setHijos(LinkedList<Nodo<E>> hijos) {
        this.hijos = hijos;
    }

    public void agregarHijo(Nodo<E> hijo){
        this.hijos.add(hijo);
    }
}
