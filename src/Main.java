

public class Main
{

	public static void main(String[] args) {
        Granjero paco = new Granjero("Paquete", "Paquez", 58, 'H');
        Granja granjaDePaco = new Granja("Pacota del Sur", "Panama", paco);
        Mascota mascota = new Mascota("Rex", 13, "Perro");
        
        paco.setMascota(mascota);
        
        System.out.println(granjaDePaco);
    }
    
}
