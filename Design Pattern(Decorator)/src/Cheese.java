/**
 * Created by yamahachou on 2018/11/2.
 */
public class Cheese extends ToppingDecorator {

    public Cheese(Pizza newPizza){
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    public String getDescription(){
        return tempPizza.getDescription()+ ", Cheese";
    }

    public double getCost(){
        return tempPizza.getCost()+ 0.5;
    }
}
