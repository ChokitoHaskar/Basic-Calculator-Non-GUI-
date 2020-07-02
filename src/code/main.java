package code;

import java.util.*;

public class main {

    public static void main(String[] args){
        while (true) {
            init p = new init();
            try {
                p.proses();
            } catch (InputMismatchException e) {
                System.out.println("Untuk koma gunakan '.'");
            }

        }
    }

}
