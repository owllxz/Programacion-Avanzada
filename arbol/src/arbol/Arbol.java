package arbol;

public class Arbol {
    public static void main(String[] args) {
        Nodo arbol = new Nodo(5);
        
        arbol.agregar(3);
        arbol.agregar(7);
        arbol.agregar(5);
        arbol.agregar(4);
        
        System.out.println("In-Orden");
        arbol.InOrden();
        System.out.println("Pre-Orden");
        arbol.PreOrden();
        System.out.println("Pos-Orden");
        arbol.PosOrden();
        
        arbol.buscar(4);
        arbol.buscarB(7, 0);
    }
}
