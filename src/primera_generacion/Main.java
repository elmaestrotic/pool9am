package primera_generacion;

import segunda_generacion.Drácula;
import segunda_generacion.Murcielago;

public class Main {
    public static void main(String[] args) {
        Drácula draculita = new Drácula(190,"Vladimir",600);
        draculita.hipnotizar();//método propio de Drácula
        draculita.morder();//método heredado de Vampiro
        draculita.chuparSangre();//método heredado de Vampiro
        draculita.aguantarSol();//método heredado de Vampiro
        draculita.volar();//método de la interfaz Murcielago
        draculita.amamantar();//método de Mamifero que heredó a través de Murcielago
        draculita.respirar();//método de Animal
        draculita.comerFrutas();//método opcional de la interfaz Murcielago
        draculita.vivir();//método de Servivo
        Murcielago.hacerChichi();//método de la interfaz Murcielago
    }
}
