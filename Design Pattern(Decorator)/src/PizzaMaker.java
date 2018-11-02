/**
 * Created by yamahachou on 2018/11/2.
 */
public class PizzaMaker {

    public static void main(String[] args){
        Pizza customPizza = new Bacon(new Cheese(new PlainPizza()));

        System.out.println("Contents of the Pizza " + customPizza.getDescription());
        System.out.println("Cost of the Pizza "+ customPizza.getCost());
    }
}
