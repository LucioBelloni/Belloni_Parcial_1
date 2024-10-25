
package parcial_1;

import java.util.Objects;


public abstract class Planta 
{
    private String nombre;
    private String ubicacion;
    private String clima;

    public Planta(String nombre, String ubicacion, String clima) 
    {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }
    
    public abstract void podar();

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima + '}';
    }

  
    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null || getClass() != obj.getClass() ) {
            return false;
        }
        
        if (this == obj) 
        {
            return true;
        }
        
        if(obj instanceof Planta other)
        {
            return nombre.equals(other.nombre);
        }
        
        if(obj instanceof Planta other)
        {
            return ubicacion.equals(other.ubicacion);
        }
        return  false;
    }
           
}      
        
            
        
    

    
    
    
    
    

