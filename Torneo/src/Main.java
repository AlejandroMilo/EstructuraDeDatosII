public class Main {
    public static void main(String[] args) {

            BinaryTree arbol=new BinaryTree(new Nodo(new Partido("Final")));
            arbol.addNodo(new Partido("Semifinal1"),"Final",true);
            arbol.addNodo(new Partido("Semifinal2"),"Final",false);

            arbol.addNodo(new Partido("Equipo1","Equipo2","1"),"Semifinal1",true);
            arbol.addNodo(new Partido("Equipo3","Equipo4","2"),"Semifinal1",false);
            arbol.addNodo(new Partido("Equipo5","Equipo6","3"),"Semifinal2",true);
            arbol.addNodo(new Partido("Equipo7","Equipo8","4"),"Semifinal2",false);
            System.out.println("============================================================================");
            arbol.MostrarBracket();
            System.out.println("============================================================================");
            System.out.println("Recorriendo en preorden");
            arbol.preOrder();
            System.out.println("============================================================================");
            System.out.println("Simulando torneo");
            arbol.RecorrerYSimular();
            System.out.println("============================================================================");
            System.out.println("Resultados del torneo");
            arbol.MostrarBracket();


        }
    }

