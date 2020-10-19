package ficha;
import java.util.Scanner;

public class Clerigo extends Ficha{
    private static int contadorClerigo;
    private int idClerigo;
    protected String invocacion;
    protected int devocion;
    Scanner teclado=new Scanner(System.in);

    public Clerigo(){
        this.idClerigo=++Clerigo.contadorClerigo;
    }
    
    public Clerigo(String nombre,int fuerza, int inteligencia, boolean magico, String invocacion, int devocion){
        super(nombre, fuerza, inteligencia, magico);
        this.invocacion=invocacion;
        this.devocion=devocion;
    }

    public void construirClerigo(){
        System.out.println("CREACIÓN DE UN CLÉRIGO");
        crearFicha();
        System.out.print("¿Cual es su invocación dominante? ");
        invocacion=teclado.next();
        devocion=((inteligencia+fuerza)/2)+5;
        if(devocion<0){
            devocion=0;
        }else if(devocion>0){
            devocion=((inteligencia+fuerza)/2)+5;
        }else{
            devocion=0;
        }
        System.out.println("Sus puntos de devoción son: "+devocion);
    }

    public static int getContadorClerigo() {
        return contadorClerigo;
    }

    public int getIdClerigo() {
        return idClerigo;
    }

    public String getInvocacion() {
        return invocacion;
    }

    public void setInvocacion(String invocacion) {
        this.invocacion = invocacion;
    }

    public int getDevocion() {
        return devocion;
    }

    public void setDevocion(int devocion) {
        this.devocion = devocion;
    }

    
    
    @Override
    public String toString() {
        return "Clerigo{" + "idClerigo=" + idClerigo + super.toString() + ", invocacion=" + invocacion + ", devocion=" + devocion + '}';
    }
    
    
    
}

