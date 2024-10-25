
package parcial_1;


public class PlantaRepetidoExepcion extends RuntimeException{
    
    private static  final String MESSAGE = "La planta ya esta en la lista";
    
    public PlantaRepetidoExepcion()
    {
        super(MESSAGE);
    }
}
