public class Main {
    public static void main(String[] args) {
        Arbol_Binario biblioteca = new Arbol_Binario();

        // Insertamos 8 libros de prueba
        biblioteca.insertar(new Libro("Don Quijote", "Miguel de Cervantes", 1605));
        biblioteca.insertar(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.insertar(new Libro("La Odisea", "Homero", -800));
        biblioteca.insertar(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943));
        biblioteca.insertar(new Libro("Crimen y castigo", "Fiódor Dostoyevski", 1866));
        biblioteca.insertar(new Libro("Hamlet", "William Shakespeare", 1603));
        biblioteca.insertar(new Libro("Alicia en el País de las Maravillas", "Lewis Carroll", 1865));
        biblioteca.insertar(new Libro("Ulises", "James Joyce", 1922));

        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ~ Ordenado Alfabeticamente(InOrden) ~ \n");
        biblioteca.inOrden();

        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ~ Recorrido PreOrden ~ \n");
        biblioteca.preOrden();

        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ~ Recorrido PostOrden ~ \n");
        biblioteca.postOrden();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("~ Buscando nombre que existe ~ \n");
        System.out.println(biblioteca.buscar_Titulo("Hamlet"));

        System.out.println("-----------------------------------------------------------------");
        System.out.println("~ Buscando libro que no existe ~ \n");
        System.out.println(biblioteca.buscar_Titulo("El Cuervo"));

        System.out.println("-----------------------------------------------------------------");
        System.out.println("~ Eliminando libro que no existe ~ \n");
        System.out.println( biblioteca.eliminar_por_titulo("Juana la Palida"));

        System.out.println("-----------------------------------------------------------------");
        System.out.println("~ Eliminando libro que existe ~ \n");
        System.out.println( biblioteca.eliminar_por_titulo("Don Quijote"));

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Listado de Libros despues de eliminar 'Don Quijote' :\n");
        biblioteca.inOrden();
    }
}
