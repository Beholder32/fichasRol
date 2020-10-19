package equipo;
import ficha.Clerigo;
import ficha.Guerrero;
import ficha.Mago;
import ficha.Picaro;

public class Equipo {
    private final int idEquipo;
    private static int contadorEquipo;
    private String nombreEquipo;
    private Guerrero guerrero;
    private Mago mago;
    private Picaro picaro;
    private Clerigo clerigo;
    
    public Equipo(){
        this.idEquipo=++Equipo.contadorEquipo;
    }
    
    public Equipo(String nombreEquipo, Guerrero guerrero, Mago mago, Picaro picaro, Clerigo clerigo){
        this();
        this.nombreEquipo=nombreEquipo;
        this.guerrero=guerrero;
        this.mago=mago;
        this.picaro=picaro;
        this.clerigo=clerigo;
    }
    
    public void crearEquipo(){
        
    }
    
}
