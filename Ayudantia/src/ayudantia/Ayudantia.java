package ayudantia;

import java.util.ArrayList;

public class Ayudantia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoClass auto1 = new AutoClass(4, "AMG", "MERCEDEZ", "313113-K", 300);
        System.out.println(auto1.getNumRuedas());
        auto1.setNumRuedas(6);
        System.out.println(auto1.getNumRuedas());
        
        ArrayList<AutoClass> listaAutos = new ArrayList<AutoClass>();
        
        ArrayList<Integer> a = auto1.hola();
        System.out.println(a.get(0));
        System.out.println(a.get(1));
    }
}
