package arbol;

public class Nodo {
    private Nodo izquierdo;
    private Nodo derecho;
    private int valor;
    
    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
    public Nodo(int valor){
        this.valor = valor;
    }
    public void agregar(int valor){
        if(valor < this.valor){
            if(izquierdo != null){
                izquierdo.agregar(valor);
            }
            else{
                izquierdo = new Nodo(valor);
            }
        }
        else{
            if(derecho != null){
                derecho.agregar(valor);
            }
            else{
                derecho = new Nodo(valor);
            }
        }
    }
    public void InOrden(){
        if(izquierdo != null){
            izquierdo.InOrden();
        }
        System.out.println(valor);
        if(derecho != null){
            derecho.InOrden();
        }
    }
    public void PreOrden(){
        System.out.println(valor);
        if(izquierdo != null){
            izquierdo.PreOrden();
        }
        if(derecho != null){
            derecho.PreOrden();
        }        
    }
    public void PosOrden(){
        if(izquierdo != null){
            izquierdo.PosOrden();
        }
        if(derecho != null){
            derecho.PosOrden();
        }        
        System.out.println(valor);
    }
    public void buscar(int valor){
        if(valor == this.valor){
            System.out.println("encontrado");
        }
        if(izquierdo != null){
            izquierdo.buscar(valor);
        }
        if(derecho != null){
            derecho.buscar(valor);
        }
    }
    public void buscarB(int valor, int aux){
        if(this.valor == valor){
            System.out.println("Encontrado");
            aux = 1;
        }
        if(valor < this.valor){
            if(izquierdo != null){
                izquierdo.buscarB(valor, aux);
            }
            else{
                if(aux != 1){
                    System.out.println("No Encontrado");   
                }
            }
        }
        else{
            if(derecho != null){
                derecho.buscarB(valor, aux);
                aux = 1;
            }
            else{
                if(aux != 1){            
                    System.out.println("No Encontrado");
                }
            }
        }
    }
}
