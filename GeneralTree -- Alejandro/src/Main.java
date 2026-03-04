public class Main {
    public static void main(String[] args) {
        
     GeneralTree gt = new GeneralTree<>(new Nodo<>(8));
        gt.insertar(6,5);
        gt.insertar(6,8);
        gt.insertar(6,2);

        gt.insertar(5,3);
        gt.insertar(5,1);

        gt.insertar(8,12);

        System.out.println("---------------------------------------------------------------------------------------------------------");
        gt.ImprimirBFS(); 
        
        System.out.println("---------------------------------------------------------------------------------------------------------");
        gt.ImprimirDFSPila(); 
    }
}
