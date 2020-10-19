package ficha;

import java.util.Scanner;

public class Ficha {

    protected String nombre;
    protected int fuerza;
    protected int inteligencia;
    protected boolean magico;
    protected Scanner teclado = new Scanner(System.in);

    public Ficha() {
    }

    public Ficha(String nombre, int fuerza, int inteligencia, boolean magico) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.magico = magico;
    }

    public void crearFicha() {
        System.out.print("Introduce su nombre: ");
        nombre = teclado.next();
        System.out.print("Introduce su fuerza: (valor entre 1 y 10): ");
        do {
            fuerza = teclado.nextInt();
        } while (fuerza < 1 || fuerza > 10);
        System.out.println("Introduce su inteligencia: (valor entre 1 y 10)");
        do {
            System.out.println("La fuerza y la inteligencia no puede sumar mas de 10: ");
            do {
                inteligencia = teclado.nextInt();
            } while (inteligencia < 1 || inteligencia > 10);
        } while ((fuerza + inteligencia) > 10);
        System.out.print("¿Tu personaje va a tener poder magico? (1=si/0=no)");
        int respuesta = teclado.nextInt();
        do {
            if (respuesta == 1) {
                magico = true;
            } else if (respuesta == 0) {
                magico = false;
            }
        }while(respuesta>1&&respuesta<0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public boolean isMagico() {
        return magico;
    }

    public void setMagico(boolean magico) {
        this.magico = magico;
    }

    @Override
    public String toString() {
        return "Ficha{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", inteligencia=" + inteligencia + ", magico=" + magico + '}';
    }

}
