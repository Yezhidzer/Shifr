package Origin;

import java.util.Scanner;
import Origin.CaesarСipher;
public class Menu {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        boolean isWorking = true;
        if (isWorking){
            System.out.println(" Make a choice: 1 - If you want encrypt data or you want decrypt data , 3 - if you want to use \" brute force \" , 4 - if you want to exit the program ");
            int choose = console.nextInt();
            if(choose == 1) {


              new CaesarСipher();



            } else if (choose == 3) {
                System.out.println("Какой файл хотите рашифровать");
                // вызов метода brute force
            } else if (choose == 4) {
                System.out.println("Выход...");
                System. exit(0);

            }
        }
    }


}


