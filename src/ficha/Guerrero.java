package ficha;
import java.util.Scanner;

public class Guerrero extends Ficha{
    private static int contadorGuerrero;
    private int idGuerrero;
    protected String habilidadCombate;
    protected int poder;
    Scanner teclado=new Scanner(System.in);
    
    public Guerrero(){
        this.idGuerrero=++Guerrero.contadorGuerrero;
    }
    
    public Guerrero(String nombre,int fuerza, int inteligencia, boolean magico, String habilidadCombate, int poder){
        super(nombre, fuerza, inteligencia, magico);
        this.habilidadCombate=habilidadCombate;
        this.poder=poder;
    }
    
    public void construirGuerrero(){
        System.out.println("CREACIÓN DE UN GUERRERO");
        crearFicha();
        System.out.print("¿Cual es su habilidad de combate? ");
        habilidadCombate=teclado.next();
        poder=fuerza-inteligencia;
        if(fuerza-inteligencia<0){
            poder=inteligencia-fuerza;
        }else if(fuerza-inteligencia>0){
            poder=fuerza-inteligencia;
        }else{
            poder=0;
        }
        System.out.println("Sus puntos de poder son: "+poder);
    }

    public static int getContadorGuerrero() {
        return contadorGuerrero;
    }

  
    public int getIdGuerrero() {
        return idGuerrero;
    }


    public String getHabilidadCombate() {
        return habilidadCombate;
    }

    public void setHabilidadCombate(String habilidadCombate) {
        this.habilidadCombate = habilidadCombate;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    
    @Override
    public String toString() {
        return "Guerrero{" +"idGuerrero=" + idGuerrero+ " " + super.toString() + ", habilidadCombate=" + habilidadCombate + ", poder=" + poder + '}';
    }
    
    
    
}
