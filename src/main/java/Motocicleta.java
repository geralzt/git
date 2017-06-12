package java;

/**
 * Created by adrian1 on 6/12/2017.
 */
public class Motocicleta {

    private String marca;
    private int modelo;
    private String tamano;
    public Motocicleta (String m,int mo,String t){
        marca=m;
        modelo=mo;
        tamano=t;
    }

    public void mostrar() {
        System.out.println("La marca es:" + marca);
        System.out.println("El modelo es:" + modelo);
        System.out.println("El tamano es:" + tamano);
    }

}
