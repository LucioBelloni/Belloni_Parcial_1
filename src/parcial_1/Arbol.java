
package parcial_1;


public class Arbol  extends  Planta{
    private int alturaMaxima;
    
    public Arbol(String nombre, String ubicacion, String clima, int  alturaMaxima) {
        super(nombre, ubicacion, clima);
        this.alturaMaxima = alturaMaxima;
    }
    
    public void podar()
    {
        System.out.println("El arbol se esta podando...");
    }

    @Override
    public String toString() {
        
        return "Arbol{" + "alturaMaxima: " + alturaMaxima + '}';
    }

    
    
    
}
