
package kartya;

import java.util.Scanner;

public class Kartya {

    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }
 private static void Kirak() {
    String[] tomb = new String[21]; 
    int index = 0;

    String[] szin = {"P", "Z", "S", "F"};
    String[] ertek = {"Asz", "K", "D", "Fel", "VII", "VI"};

    for (int i = 0; i < szin.length; i++) {
        if (i < 3) {
            
            for (String ertek1 : ertek) {
                tomb[index] = szin[i] + ":" + ertek1;
                index++;
            }
        } else {
            
            for (int j = 0; j < 3; j++) {
                tomb[index] = szin[i] + ":" + ertek[j];
                index++;
            }
        }
    }

        
        for (String tomb1 : tomb) {
            System.out.println(tomb1);
        }
}


    private static void Melyik() {
        Scanner beker = new Scanner(System.in);
        int szam;
        System.out.println("irj egy lapot!: ");
        szam = beker.nextInt();
    }

    private static void Kever() {
    }

    private static void EzVolt() {
        
    }
    
}
