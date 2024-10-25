
package parcial_1;


public class Test {

    
    public static void main(String[] args) {
        Jardin jardin = new Jardin();
        
       
    
        try{
            
            jardin.agregarPlanta(new Arbol("Roble", "norte", "frio", 10));
            jardin.agregarPlanta(new Arbol("Roble", "norte", "frio", 10));
        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
          try {          
            jardin.agregarPlanta(new Arbol("Roble", "Zona sur del jardin", "Calido", 15));
            jardin.agregarPlanta(new Arbusto("Arbusto", "Zona sur ", "Calido", 5));
            jardin.agregarPlanta(new Flor("Flor", "Zona oeste ", "Calor", Estaciones.INVIERNO));
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

       
        
        jardin.mostrarPlantas();
        
        jardin.poderPlanta();

    }
    
}
