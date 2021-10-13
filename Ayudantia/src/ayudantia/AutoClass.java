package ayudantia;

public class AutoClass extends Vehiculo {

    private int Asientos;
        
    public int getAsientos() {
        return Asientos;
    }

    public void setAsientos(int Asientos) {
        this.Asientos = Asientos;
    }
    
    public AutoClass(String Motor, String Patente, int Ruedas, int Velocidad, int Asientos){
        super(Motor, Patente, Ruedas, Velocidad);
        this.Asientos = Asientos;
    }
}
