import java.util.LinkedList;
import java.util.Queue;
import java.math.*;
public class BinaryTree {
    private Nodo root;

        public BinaryTree() {
            this.root = null;
        }
        public BinaryTree(Nodo root) {
            this.root = root;
        }

        public Nodo buscarNodo(String info) {
            if (root == null) {
                System.out.println("No hay nodo raiz");
                return null;
            } else {
                Queue<Nodo> colaHijos = new LinkedList<>();
                colaHijos.add(root);
                while (!colaHijos.isEmpty()) {
                    Nodo nodoTemporal = colaHijos.poll();
                    if (nodoTemporal.getValor().getRonda().equals(info)) {
                        return nodoTemporal;
                    }
                    if (nodoTemporal.getIzquierdo() != null) {
                        colaHijos.add(nodoTemporal.getIzquierdo());

                    }
                    if (nodoTemporal.getDerecho() != null) {
                        colaHijos.add(nodoTemporal.getDerecho());

                    }
                }
                return null;
            }
        }

        public void simularRonda(Nodo nodo){
            double win=Math.random();
            Partido P=nodo.getValor();
            if (win>0.5){
                P.setGanador(P.getEquipo1());
            } else{
                P.setGanador(P.getEquipo2());
            }
            System.out.printf("El ganador de la ronda %s es : %s,",P.getRonda(),P.getGanador());
        }

        public void addNodo(Partido info,String padre,boolean esIzquiero){
            Nodo nodoPadre = buscarNodo(padre);
            Nodo nodoHijo =buscarNodo(info.getRonda());
            if (nodoHijo!=null){
                System.out.println("Ya existe ese hijo");
                return;
            }
            if (nodoPadre != null) {
                Nodo nodo = new Nodo(info);
                if (esIzquiero){
                    nodoPadre.setIzquierdo(nodo);
                } else{
                    nodoPadre.setDerecho(nodo);
                }

            } else {
                System.out.println("El padre no existe");
            }

        }

        public boolean eliminarNodo(String info){
            Nodo P=buscarNodo(info);
            if (P==null){
                System.out.println("No se encuentra el nodo");
                return false;
            }
            if (root==null){
                System.out.println("No hay raiz");
                return false;
            }

            if (root.getValor().getRonda().equals(info)){
                root=null;
                return true;
            }

            return eliminarNodo(root,info);
        }


        public void MostrarBracket(){
            if (root ==null){
                System.out.println("El arbol esta vacio");
                return;
            }
            mostrarBracketRecursivo(root,0,new LinkedList<>());
        }

        private void mostrarBracketRecursivo(Nodo nodo, int nivel, LinkedList<Boolean> esUltimo) {

            for (int i = 0; i < nivel; i++) {
                if (i < esUltimo.size() - 1) {
                    System.out.print(esUltimo.get(i) ? "    " : "│   ");
                }
            }


            if (nivel > 0) {
                System.out.print(esUltimo.get(esUltimo.size() - 1) ? "└── " : "├── ");
            }


            Partido partido = nodo.getValor();
            System.out.printf("%s: %s vs %s → Ganador: %s%n",
                    partido.getRonda(),
                    partido.getEquipo1() != null ? partido.getEquipo1() : "Por definir",
                    partido.getEquipo2() != null ? partido.getEquipo2() : "Por definir",
                    partido.getGanador() != null ? partido.getGanador() : "Sin resultado");


            if (nodo.getIzquierdo() != null || nodo.getDerecho() != null) {
                LinkedList<Boolean> nuevosEsUltimo = new LinkedList<>(esUltimo);


                if (nodo.getIzquierdo() != null) {
                    nuevosEsUltimo.add(nodo.getDerecho() == null);
                    mostrarBracketRecursivo(nodo.getIzquierdo(), nivel + 1, nuevosEsUltimo);
                    nuevosEsUltimo.remove(nuevosEsUltimo.size() - 1);
                }


                if (nodo.getDerecho() != null) {
                    nuevosEsUltimo.add(true);
                    mostrarBracketRecursivo(nodo.getDerecho(), nivel + 1, nuevosEsUltimo);
                    nuevosEsUltimo.remove(nuevosEsUltimo.size() - 1);
                }
            }
        }

        public void RecorrerYSimular() {

            Postorden(root);
        }



        private void Postorden(Nodo node){
            if (node!=null){
                Postorden(node.getIzquierdo());
                Postorden(node.getDerecho());
                if (node.getIzquierdo()!=null ){
                    node.getValor().setEquipo1(node.getIzquierdo().getValor().getGanador());

                }
                if (node.getDerecho()!=null){
                    node.getValor().setEquipo2(node.getDerecho().getValor().getGanador());
                }
                simularRonda(node);
                System.out.println();
            }
        }
        private boolean eliminarNodo(Nodo nodo, String info){
            Nodo iz=nodo.getIzquierdo();
            Nodo de=nodo.getDerecho();


            if (iz.getValor().getRonda().equals(info)){
                nodo.setIzquierdo(null);
                return true;
            }
            if (de.getValor().getRonda().equals(info)){
                nodo.setDerecho(null);
                return true;
            }

            if (eliminarNodo(iz,info)) {
                return true;
            }
            if (eliminarNodo(de,info)) {
                return true;
            }

            return false;
        }






        public void inOrder(){
            inOrderRec(root);
        }
        private void inOrderRec(Nodo root){
            if (root !=null){
                inOrderRec(root.getIzquierdo());
                System.out.println(root.getValor()+" ");
                inOrderRec(root.getDerecho());
            }
        }

        public void preOrder() {
            preOrderRec(root);
        }

        private void preOrderRec(Nodo raiz) {
            if (raiz != null) {
                System.out.print(raiz.getValor().getRonda() + " ");
                preOrderRec(raiz.getIzquierdo());
                preOrderRec(raiz.getDerecho());
            }
        }

        public void postOrder() {
            postOrderRec(root);
        }

        private void postOrderRec(Nodo raiz) {
            if (raiz != null) {
                postOrderRec(raiz.getIzquierdo());
                postOrderRec(raiz.getDerecho());
                System.out.print(raiz.getValor().getRonda() + " ");
            }
        }







    }


