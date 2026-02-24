//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insertar(6);
        bt.insertar(4);
        bt.insertar(8);
        bt.insertar(9);
        bt.insertar(13);
        bt.insertar(10);
        bt.insertar(2);
        bt.insertar(1);

        System.out.println("----------------------------------------------------");

        System.out.println(" 6  : "+bt.buscarValor(6));
        System.out.println(" 13 : "+bt.buscarValor(13));
        System.out.println(" 23 : "+bt.buscarValor(23));
        System.out.println(" 42 : "+bt.buscarValor(42));

        System.out.println("----------------------------------------------------");

        System.out.println("Pre Orden :");
        bt.PreOrder();

        System.out.println("\n----------------------------------------------------");

        System.out.println("Entre Orden :");
        bt.EntreOrder();

        System.out.println("----------------------------------------------------");

        System.out.println("Post Orden :");
        bt.PostOrder();

    }
}