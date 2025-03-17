package primera_generacion;

import segunda_generacion.Murcielago;

public class Vampiro implements Murcielago {
   //Atributos
   private String nombre;
   private int edad;


    private interface intentarSol {
        void aguantarSol();
    }

    public final void aguantarSol() {// Se declara final para que no pueda ser sobrescrito en subclases.
        // Verificación de que el objeto es exactamente de la clase Vampiro.
        if (this.getClass() == Vampiro.class) {
            System.out.println("Vampiro Broncendose.\n" +
                    " No asará pa'");
        } else {            // En lugar de lanzar una excepción, simplemente se imprime un mensaje informando.
            System.out.println("Llorelo papá. Solo los vampiros de primera generación pueden aguantar sol." +
                    "\n ¡Mera flor!");
        }
    }


   //Métodos
    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void morder(){
        System.out.println("Vampiro mordiendo..");
    }
    public void chuparSangre(){
        System.out.println("Vampiro chupando sangre..");
    }

   /* protected void aguantarSol(){
        System.out.println("Vampiro bronceándose..");
    }*/
    @Override
    public void volar() {
        System.out.println("Volando con ecolocalizaicón..");
    }

    @Override
    public void amamantar() {
        System.out.println("Vampiro ammantando con un tetero sangriento..");
    }

    @Override
    public void respirar() {
        System.out.println("Ahh me estaba ahogando..");
    }
}
