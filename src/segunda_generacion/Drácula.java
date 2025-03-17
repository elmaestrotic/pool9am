package segunda_generacion;

import primera_generacion.Vampiro;

public class Drácula extends Vampiro  {
    int estatura;
    public Drácula(int estatura,String nombre, int edad) {
        super(nombre, edad);
        this.estatura=estatura;
    }
    public void hipnotizar(){
        System.out.println("Venga  q' no es pa' eso...");
    }
}
