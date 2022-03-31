package principal;

import java.util.Arrays;
import java.util.Scanner;

public class PilaTabla implements Pila {
    Scanner sc = new Scanner(System.in);
    protected Integer[] pila;
    protected int tamanoPila;
    protected int cima;

    public PilaTabla() {
        this.pila = new Integer[10];
        this.cima = -1;
    }

    public PilaTabla(int tamanoPila) {
        this.pila = new Integer[tamanoPila];
        this.tamanoPila = tamanoPila;
        this.cima = -1;
    }

    public Integer[] ampliar(){
        Integer [] pilaAmpliada  = Arrays.copyOf(pila, pila.length+10);
        tamanoPila+=10;
        return pilaAmpliada;
    }

    @Override
    public void apilar() {
        if (cima == tamanoPila - 1) {
            pila=ampliar();
        }
        cima++;
        System.out.println("Introduce un numero");
        pila[cima] = sc.nextInt();
    }

    @Override
    public void desapilar() {
        if (cima < 0) {
            System.out.println("No se puede desapilar no hay nada");
        } else {
            pila[cima] = null;
            cima--;
        }
    }

    public boolean comprobarVacia() {
        boolean vacio = false;
        if (cima == -1) {
            vacio = true;
        }
        return vacio;
    }

    public boolean comprobarLlena() {
        boolean lleno = false;
        if (cima == pila.length - 1) {
            lleno = true;
        }
        return lleno;
    }

    public void elementoCima() {
        if (cima == -1) {
            System.out.println("null");
        } else {
            System.out.println(pila[cima]);
        }
    }

    public void apilarPrimeraPosicion() {
        System.out.println("Introduce un numero");
        int insertar = sc.nextInt();
        int guardado=0;
        if (cima == tamanoPila - 1) {
            pila=ampliar();
        }
        for (int i = 0; i <= cima + 1; i++) {
            if (i <= cima) {
                guardado = pila[i];
            }
            pila[i] = insertar;
            insertar = guardado;
        }
        cima++;
    }

    @Override
    public String toString() {
        return "PilaTabla{" +
                "pila=" + Arrays.toString(pila) +
                ", tamanoPila=" + tamanoPila +
                ", cima=" + cima +
                '}';
    }


}
