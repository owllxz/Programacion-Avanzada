package ayudantia;

public class Vehiculo {
    private String Motor;
    private String Patente;
    private int Ruedas;
    private int Velocidad;
    
    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }    
    public void setMotor(String Motor){
        this.Motor = Motor;
    }
    public String getMotor(){
        return Motor;
    }
    
    public Vehiculo(String Motor, String Patente, int Ruedas, int Velocidad){
        this.crear(Motor, Patente, Ruedas, Velocidad);
    }
    public void crear(String Motor, String Patente, int Ruedas, int Velocidad){
        this.Motor = Motor;
        this.Patente = Patente;
        this.Ruedas = Ruedas;
        this.Velocidad = Velocidad;
    }
}
