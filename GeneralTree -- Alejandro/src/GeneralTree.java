import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GeneralTree<E> {
    Nodo<E> raiz;

    //Constructor
    public GeneralTree(Nodo<E> raiz) {
        this.raiz = raiz;
    }
    public GeneralTree(){
        raiz=null;
    }

    public Nodo<E> getRaiz() {
        return raiz;
    }
    public void setRaiz(Nodo<E> raiz) {
        this.raiz = raiz;
    }

    public void insertar(E valorPadre, E nuevo){
        Nodo<E> NodoPadre=BuscarNodo(raiz,valorPadre);
        if (NodoPadre !=null){
            Nodo<E> nuevoNodo=new Nodo<E>(nuevo);
            NodoPadre.agregarHijo(nuevoNodo);
        }
    }
    public Nodo<E> BuscarNodo(Nodo<E> NodoAcutal , E valor){
        if(NodoAcutal==null){
            return null;
        }

        if (NodoAcutal.getInfo().equals(valor)){
            return NodoAcutal;
        }
        for (Nodo<E> hijo: NodoAcutal.getHijos()){
            Nodo<E> resultado= BuscarNodo(hijo,valor);
            if (resultado !=null){
                return resultado;
            }
        }
        return null;
    }
    //BFS
    public Nodo<E> BusquedaBFS(Nodo<E> NodoAcutal, E valor){
        Queue<Nodo<E>> cola=new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()){
            Nodo<E> aux= cola.poll();
            if (aux.getInfo().equals(valor)){
                return aux;
            }
            for(Nodo<E> hijo: aux.getHijos()){
                cola.add(hijo);
            }
        }
        return null;
    }

    public void ActualizarNodo(E hijo){
        Nodo<E> NodoHijo=BuscarNodo(raiz, hijo);
        if (NodoHijo==null){
            System.out.println("No se endcontro el nodo Padre");
        } else{
            NodoHijo.setInfo(hijo);
        }
    }

    public Nodo<E> EliminarNodo(E padre,E hijo){
        Nodo<E> NodoPadre=BuscarNodo(raiz,padre);
        if (NodoPadre !=null){
            Nodo<E> NodoHijo=BuscarNodo(NodoPadre,hijo);
            if (NodoHijo ==null){
                System.out.println("No se encontro");
                return null;
            } else{
                NodoPadre.getHijos().remove(NodoHijo);
            }
        } else{
            System.out.println("No existe Nodo Padre");
            return null;
        }
        return null;
    }

    //Imprimir en DFS
    public void ImprimirDFS(Nodo<E> Nodo){
        if (Nodo==null){
            return ;
        }
        System.out.println(Nodo.getInfo()+" ");
        for (Nodo<E> hijo:Nodo.getHijos()){
            ImprimirDFS(hijo);
        }

    }
    public void ImprimirDFSPila(){
        if (raiz==null){
            return;
        }
        Stack<Nodo<E>> pila=new Stack<>();
        pila.push(raiz);
        while(!pila.isEmpty()){
            Nodo<E> NodoActual=pila.pop();

            System.out.println(NodoActual.getInfo()+" ");

            LinkedList<Nodo<E>> hijos=NodoActual.getHijos();

            for (int i=hijos.size()-1;i>=0;i--){
                pila.push(hijos.get(i));
            }
        }
    }
    //Imprimir BFS
    public void ImprimirBFS (){
        Queue<Nodo<E>> cola=new LinkedList<>();
        cola.add(raiz);
        while(!cola.isEmpty()){
            Nodo<E> nodoActual=cola.poll();
            System.out.println(nodoActual.getInfo());

            for (Nodo<E> hijo: nodoActual.getHijos()){
                cola.add(hijo);
            }
        }
    }






}
