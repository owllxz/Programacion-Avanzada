package ayudantia;


public class Moto extends Vehiculo {

    private int Luces;
    
    public int getLuces() {
        return Luces;
    }

    public void setLuces(int Luces) {
        this.Luces = Luces;
    }
    
    public Moto(String Motor, String Patente, int Ruedas, int Velocidad, int Luces){
        super(Motor, Patente, Ruedas, Velocidad);
        this.Luces = Luces;
    }
}
