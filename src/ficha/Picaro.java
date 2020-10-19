package ficha;
import java.util.Scanner;

public class Picaro extends Ficha{
    private static int contadorPicaro;
    private int idPicaro;
    protected String especialidad;
    protected int destreza;
    Scanner teclado=new Scanner(System.in);
    
    public Picaro(){
        this.idPicaro=++Picaro.contadorPicaro;
    }
    
    public Picaro(String nombre,int fuerza, int inteligencia, boolean magico, String especialidad, int destreza){
        super(nombre, fuerza, inteligencia, magico);
        this.especialidad=especialidad;
        this.destreza=destreza;
    }
    
    public void construirPicaro(){
        System.out.println("CREACIÓN DE UN PICARO");
        crearFicha();
        System.out.print("¿Cual es su especialidad dominante? ");
        especialidad=teclado.next();
        destreza=((inteligencia+fuerza)/2);
        System.out.println("Sus puntos de destreza son: "+destreza);
    }

    public static int getContadorPicaro() {
        return contadorPicaro;
    }

    public int getIdPicaro() {
        return idPicaro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    
    

    @Override
    public String toString() {
        return "Picaro{" + "idPicaro=" + idPicaro + super.toString() + ", especialidad=" + especialidad + ", destreza=" + destreza + '}';
    }
    
    
    
}
