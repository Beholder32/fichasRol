package ficha;
import java.util.Scanner;

public class Mago extends Ficha{
    private static int contadorMago;
    private int idMago;
    protected String hechizo;
    protected int mana;
    Scanner teclado=new Scanner(System.in);
    
    public Mago(){
        this.idMago=++Mago.contadorMago;
    }
    
    public Mago(String nombre,int fuerza, int inteligencia, boolean magico, String hechizo, int mana){
        super(nombre, fuerza, inteligencia, magico);
        this.hechizo=hechizo;
        this.mana=mana;
    }
    
    public void construirMago(){
        System.out.println("CREACIÓN DE UN MAGO");
        crearFicha();
        System.out.print("¿Cual es su hechizo dominante? ");
        hechizo=teclado.next();
        mana=(inteligencia-fuerza)+5;
        if(mana<0){
            mana=0;
        }else if(mana>0){
            mana=(inteligencia-fuerza)+5;
        }else{
            mana=0;
        }
        System.out.println("Sus puntos de magia son: "+mana);
    }

    public static int getContadorMago() {
        return contadorMago;
    }

    public int getIdMago() {
        return idMago;
    }


    public String getHechizo() {
        return hechizo;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    
    
    @Override
    public String toString() {
        return "Mago{" + "idMago=" + idMago + super.toString() + ", hechizo=" + hechizo + ", mana=" + mana + '}';
    }
}
