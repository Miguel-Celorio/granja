

public class Granja
{
    private Granjero granjero;
    private String nombre;
    private String ubicacion;
   
    
    public Granja(Granjero granjero)
    {
        this.granjero = granjero;
    }
    
    public Granja(String nombre, String ubicacion, Granjero granjero){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;        
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Datos de la Granja: ");
        sb.append("\n=====================");
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nUbicacion: ");
        sb.append(ubicacion);
        sb.append("\nGranjero: ");
        sb.append(granjero);
        
        return sb.toString();
    }
    

    public boolean pruebaMiguel() {
    	return true;
    }

    
}
