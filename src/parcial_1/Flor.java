
package parcial_1;


public class Flor  extends Planta{
    private Estaciones temporadaFloreciento;

    public Flor(String nombre, String ubicacion, String clima, Estaciones temporadaFloreciento) {
        super(nombre, ubicacion, clima);
        this.temporadaFloreciento = temporadaFloreciento;
        
    }

    @Override
    public void podar() {
        System.out.println("La flor no se puede podar.");
    }

    @Override
    public String toString() {
        return "Flor{" + "temporadaFloreciento=" + temporadaFloreciento + '}';
    }
    
    
    
    
}
