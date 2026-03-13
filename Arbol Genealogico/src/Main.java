public class Main {
    public static void main(String[] args) {


                GeneralTree arbol=new GeneralTree(new Node<>(new Persona("Yusniel","1","M")));
                System.out.println("Calculando altura con arbol con raiz");
                System.out.println(arbol.calcularGeneracionProfunda(arbol.getRoot()));
                System.out.println("----------------------------------------------------------------");

                System.out.println("Agregando hijos");
                arbol.addNodo(new Persona("Suray","2","F"),"Yusniel");
                arbol.addNodo(new Persona("Alejandro","2","M"),"Yusniel");
                arbol.addNodo(new Persona("Andy","2","M"),"Yusniel");
                arbol.addNodo(new Persona("Aaron","2","M"),"Suray");
                arbol.addNodo(new Persona("Betty","2","F"),"Suray");

                System.out.println("Mostrando arbol en BFS(generaciones)");
                arbol.BFS();
                System.out.println("----------------------------------------------------------------");

                System.out.println("Calculando altura actual del arbol");
                System.out.println(arbol.calcularGeneracionProfunda(arbol.getRoot()));
                System.out.println("----------------------------------------------------------------");

                System.out.println("Eliminando nodo que no existe");
                arbol.eliminarRamaFamiliar("Juan");
                System.out.println("----------------------------------------------------------------");

                System.out.println("Agregando nodo a Betty y eliminando rama de Betty ");
                arbol.addNodo(new Persona("Brian","3","M"),"Betty");
                System.out.println("----------------------------------------------------------------");

                System.out.println("Enseñando descendientes de Suray");
                arbol.Descendientes("Suray");
                System.out.println("----------------------------------------------------------------");

                System.out.println("Elimianndo a Betty");
                arbol.eliminarRamaFamiliar("Betty");
                System.out.println("----------------------------------------------------------------");
                arbol.addNodo(new Persona("Cesar","2","F"),"Aaron");
                System.out.println("Enseñando antepasados de Cesar");
                arbol.Antepasados("Cesar");


            }


        }

