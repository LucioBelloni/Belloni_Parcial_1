
package parcial_1;


public class Arbusto extends Planta{
    private int densidadFollaje;
    private static final int MIN_PUNTAJE = 1;
    private static final int MAX_PUNTAJE = 10;
    
    
    public Arbusto(String nombre, String ubicacion, String clima, int desidadaFollaje) {
        super(nombre, ubicacion, clima);
        validarDensidad(desidadaFollaje);
        this.densidadFollaje = desidadaFollaje;
    }

    @Override
    public void podar() {
        System.out.println("El arbusto se esta podando....");
    }

   
    private boolean validarDensidad(int densidadFollaje){
        if(densidadFollaje >= MIN_PUNTAJE && densidadFollaje <= MAX_PUNTAJE){
            return true;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Arbusto{" + "densidadFollaje=" + densidadFollaje + '}';
    }
    
    
    
    
}
