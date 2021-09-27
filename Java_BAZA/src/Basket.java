import java.util.ArrayList;

public class Basket {
    private ArrayList<String> basket = new ArrayList<>();

    public void addProduct(String name){
        basket.add(name);
    }
    public void showBasket(){
        System.out.println("Basket :");
        for (String product : basket) {
            System.out.println(product);
        }
    }

    public void clear(){
        basket.clear();
    }
}
