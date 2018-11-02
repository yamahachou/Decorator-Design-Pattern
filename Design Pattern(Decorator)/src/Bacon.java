/**
 * Created by yamahachou on 2018/11/2.
 */
public class Bacon extends ToppingDecorator {

    public Bacon(Pizza newPizza){
        super(newPizza);

        System.out.println("Adding Bacon");
    }

    public String getDescription(){
        return tempPizza.getDescription()+ ", Bacon";
    }

    public double getCost(){
        return tempPizza.getCost()+ 2.0;
    }
}
