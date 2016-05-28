/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;
import java.util.ArrayList;
/**
 *
 * @author Pc01
 */


public class Animales {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <clsAnimales> anim = new ArrayList<>();
        clsAnimales anim1 = new clsAnimales(1, "ballena",200, clsAnimales.tipo.vertebrados,clsAnimales.clasificacion.mamifero);
        clsAnimales anim2 = new clsAnimales(2, "avestruz",100, clsAnimales.tipo.vertebrados,clsAnimales.clasificacion.oviparo);
        clsAnimales anim3 = new clsAnimales(3, "elefante",2220, clsAnimales.tipo.vertebrados,clsAnimales.clasificacion.mamifero);
        clsAnimales anim4 = new clsAnimales(4, "buho",3, clsAnimales.tipo.vertebrados,clsAnimales.clasificacion.oviparo);
        clsAnimales anim5 = new clsAnimales(5, "jirafa",15, clsAnimales.tipo.vertebrados,clsAnimales.clasificacion.mamifero);
        clsAnimales anim6 = new clsAnimales(1, "culebra",5, clsAnimales.tipo.invertebrados,clsAnimales.clasificacion.oviparo);
        clsAnimales anim7 = new clsAnimales(2, "lombriz",01, clsAnimales.tipo.invertebrados,clsAnimales.clasificacion.oviparo);
        clsAnimales anim8 = new clsAnimales(3, "pulpo",20, clsAnimales.tipo.invertebrados,clsAnimales.clasificacion.oviparo);
        clsAnimales anim9 = new clsAnimales(4, "gallina",10, clsAnimales.tipo.vertebrados,clsAnimales.clasificacion.oviparo);
        clsAnimales anim10 = new clsAnimales(6, "reno",220, clsAnimales.tipo.vertebrados,clsAnimales.clasificacion.mamifero);
anim.add(anim1);
anim.add(anim2);
anim.add(anim3);
anim.add(anim4);
anim.add(anim5);
anim.add(anim6);
anim.add(anim7);
anim.add(anim8);
anim.add(anim9);
anim.add(anim10);
imprimir(anim);
    }
public static void imprimir(ArrayList<clsAnimales> anim) {
for (clsAnimales Animal : anim){
System.out.println("**************");
System.out.println("id:     " + Animal.Id());
System.out.println("nombre:     " + Animal.Nombre());
System.out.println("peso:     " + Animal.Peso());
System.out.println("tipo:     " + Animal.Tipo());
System.out.println("clasificacion:     " + Animal.Clasificacion());
System.out.println("");
}
    }

}