package ayudantia;

import java.util.ArrayList;

class retornar2datos{
    int x;
    int y;
}

public class AutoClass {

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    private int numRuedas;
    private String modelo;
    private String marca;
    private String patente;
    private int velocidadMax;
    
    public AutoClass(int numRuedas, String modelo, String marca, String patente, int velocidadMax){
        this.numRuedas = numRuedas;
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.velocidadMax = velocidadMax;
    }
    
    public ArrayList<Integer> hola(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(this.numRuedas);
        a.add(this.velocidadMax);
        return a;
    }
    
    //Encapsulamiento
    //Set para asignar
    //Get para obtener
}
