/**
 * Created by yamahachou on 2018/11/2.
 */
abstract class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){
        tempPizza = newPizza;
    }

    public String getDescription(){
        return tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }


}
