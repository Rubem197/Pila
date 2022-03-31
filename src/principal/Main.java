package principal;



public class Main {

    public static void main(String[] args) {
	PilaTabla pila = new PilaTabla(2);

        System.out.println(pila);
        pila.apilar();
        pila.apilarPrimeraPosicion();
        pila.apilarPrimeraPosicion();
        pila.apilarPrimeraPosicion();


        System.out.println(pila);
    }
}
