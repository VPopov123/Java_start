import com.sun.tools.javac.Main;

import java.io.Console;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test{
    static BaseTypes baseTypes = new BaseTypes();
    static FindMax findMax = new FindMax();
    static FindSimple findSimple = new FindSimple();
    static Basket basket = new Basket();
    static Password password = new Password();

    public static void main(String[] args){
        // 1 task
        //baseTypes.printBaseJavaTypes();

        // 2 task
        //System.out.print("MAX : " + findMax.findMax(123, 321));

        // 3 task
//        int start = 20;
//        int end = 10000;
//        ArrayList<Integer> result = findSimple.findSimple(start,end);
//
//        System.out.print("Simple numbers from:" + start + " to:" + end + " -> ");
//        if(result != null)
//            for (int curr : result) {
//                System.out.print(curr + " ");
//            }
//        else System.out.print("\nWrong parameters");

        // 4 task
//        Scanner inp = new Scanner(System.in);
//        while (true){
//            System.out.print("Enter product name (s - show, c - clear, x - exit): ");
//            String product = inp.nextLine();
//            switch (product){
//                case "s": {basket.showBasket(); break;}
//                case "c": {basket.clear(); break;}
//                case "x": return;
//                default: basket.addProduct(product);
//            }
//        }

        // 5 task
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = inp.nextLine();
        password.addPassword(pass);
        do{
            System.out.print("Enter password: ");
            pass = inp.nextLine();
        }while(password.checkPassword(pass));
    }
}
