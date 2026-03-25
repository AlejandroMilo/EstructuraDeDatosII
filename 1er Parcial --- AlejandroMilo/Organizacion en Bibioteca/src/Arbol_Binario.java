public class Arbol_Binario {
    private Nodo raiz;

    public Arbol_Binario() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    // Insertar un libro
    public void insertar(Libro libro) {
        raiz = insertarRec(raiz, libro);
    }

    private Nodo insertarRec(Nodo actual, Libro libro) {
        if (actual == null) {
            return new Nodo(libro);
        }
        if (libro.getTitulo().compareToIgnoreCase(actual.libro.getTitulo()) < 0) {
            actual.izquierda = insertarRec(actual.izquierda, libro);
        } else if (libro.getTitulo().compareToIgnoreCase(actual.libro.getTitulo()) > 0) {
            actual.derecha = insertarRec(actual.derecha, libro);
        }
        return actual;
    }

    // Buscar un libro por título
    private Libro buscar(String titulo) {
        return buscarRec(raiz, titulo);
    }
   public String buscar_Titulo(String titulo){
        Libro encontrado = buscarRec(raiz, titulo);
     if (encontrado != null) {
         return "Encontrado: " + encontrado;
     } else {
         return"No se encontro el libro.";
     }
 }
    private Libro buscarRec(Nodo actual, String titulo) {
        if (actual == null) {
            return null;
        }
        if (titulo.equalsIgnoreCase(actual.libro.getTitulo())) {
            return actual.libro;
        }
        if (titulo.compareToIgnoreCase(actual.libro.getTitulo()) < 0) {
            return buscarRec(actual.izquierda, titulo);
        } else {
            return buscarRec(actual.derecha, titulo);
        }
    }


    private void eliminar(String titulo) {
        raiz = eliminarRec(raiz, titulo);
    }

    public String eliminar_por_titulo(String titulo) {
        if (buscar(titulo) != null) {
            raiz = eliminarRec(raiz, titulo);
            return "Eliminado: "+titulo;
        } else {
            return "El libro '" + titulo + "' no se encontra en la biblioteca";
        }
    }

    private Nodo eliminarRec(Nodo actual, String titulo) {
        if (actual == null) {
            return null;
        }
        if (titulo.compareToIgnoreCase(actual.libro.getTitulo()) < 0) {
            actual.izquierda = eliminarRec(actual.izquierda, titulo);
        } else if (titulo.compareToIgnoreCase(actual.libro.getTitulo()) > 0) {
            actual.derecha = eliminarRec(actual.derecha, titulo);
        } else {

            if (actual.izquierda == null && actual.derecha == null) {
                return null;
            }

            else if (actual.izquierda == null) {
                return actual.derecha;
            } else if (actual.derecha == null) {
                return actual.izquierda;
            }

            else {
                Nodo sucesor = encontrarMin(actual.derecha);
                actual.libro = sucesor.libro;
                actual.derecha = eliminarRec(actual.derecha, sucesor.libro.getTitulo());
            }
        }

        return actual;
    }

    private Nodo encontrarMin(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    // Recorridos
    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(Nodo actual) {
        if (actual != null) {
            inOrdenRec(actual.izquierda);
            System.out.println(actual.libro);
            inOrdenRec(actual.derecha);
        }
    }

    public void preOrden() {
        preOrdenRec(raiz);
    }

    private void preOrdenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.libro);
            preOrdenRec(nodo.izquierda);
            preOrdenRec(nodo.derecha);
        }
    }

    public void postOrden() {
        postOrdenRec(raiz);
    }

    private void postOrdenRec(Nodo nodo) {
        if (nodo != null) {
            postOrdenRec(nodo.izquierda);
            postOrdenRec(nodo.derecha);
            System.out.println(nodo.libro);
        }
    }
}