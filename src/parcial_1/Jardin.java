
package parcial_1;

import java.util.ArrayList;
import java.util.List;


public class Jardin {
    private List <Planta> listaPlanta = new ArrayList<>();

    
    public void agregarPlanta(Planta planta)
    {
       if(planta == null)
       {
         throw  new NullPointerException("Me pasaste un null en lugar de una planta");
       }
       if(listaPlanta.contains(planta)){
           throw  new PlantaRepetidoExepcion();
       }
       listaPlanta.add(planta);
      
    } 
    
    
    public void mostrarPlantas(){
        
        for(Planta p : listaPlanta)
        {
            
          System.out.println(p);
             
        }
        
    }
    
    public void poderPlanta(){
        
        for (Planta  p : listaPlanta)
        {
            if(p instanceof Arbol a)
            {
                a.podar();
            }
            else if(p instanceof Arbusto ar)
            {
                ar.podar();
            }
            else if(p instanceof Flor f)
            {
                f.podar();
               
            }
        }
    }
    
    
    
    
   
    
    
}
