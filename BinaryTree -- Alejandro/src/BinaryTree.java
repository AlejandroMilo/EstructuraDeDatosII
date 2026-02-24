public class BinaryTree{
    private Nodo root;

    public BinaryTree() {
        this.root = null;
    }

    public void insertar(int numero) {
        root = insertarRecorrido(root, numero);
    }

    private Nodo insertarRecorrido(Nodo root, int numero) {
        if (root == null) {
            root = new Nodo(numero);
            return root;
        }

        if (numero < root.getNumero()) {
            root.hijoD = insertarRecorrido(root.getHijoD(), numero);
        } else if (numero > root.numero) {
            root.hijoI = insertarRecorrido(root.getHijoI(), numero);
        }

        return root;

    }

    public boolean buscarValor(int numero){
        return buscarRecorrido(root,numero);
    }

    private boolean buscarRecorrido(Nodo root, int numero){
        if (root==null){
            return false;
        }

        if (numero==root.getNumero()){
            return true;
        }

        if (numero < root.getNumero()){
            return buscarRecorrido(root.getHijoD(),numero);
        } else{
            return buscarRecorrido(root.getHijoI(),numero);
        }
    }

    public void EntreOrder(){
        RecorridoEntreOrder(root);
    }
    private void RecorridoEntreOrder(Nodo raiz){
        if (raiz !=null){
            RecorridoEntreOrder(raiz.getHijoD());
            System.out.println(raiz.getNumero()+" ");
            RecorridoEntreOrder(raiz.getHijoI());

        }
    }

    public void PreOrder() {
        RecorridoPreOrder(root);
    }

    private void RecorridoPreOrder(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.getNumero() + " ");
            RecorridoPreOrder(raiz.getHijoD());
            RecorridoPreOrder(raiz.getHijoI());
        }
    }

    public void PostOrder() {
        RecorridoPostOrder(root);
    }

    private void RecorridoPostOrder(Nodo raiz) {
        if (raiz != null) {
            RecorridoPostOrder(raiz.getHijoD());
            RecorridoPostOrder(raiz.getHijoI());
            System.out.print(raiz.getNumero() + " ");
        }
    }
}
