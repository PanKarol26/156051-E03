package Z1;

import java.util.LinkedList;
import java.util.List;

public class zadanie1 {
    public static void main(String[] args){
        Integer[] lista = new Integer[]{1,2,3,4,5,6,7,8};
        redukuj(lista);

    }
  public static <T extends Comparable> void redukuj(T[] tab){
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
            i++;

        }


    }
}
