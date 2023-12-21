package PatternCommand;

import Bouquet.Bouquet;

public class calculateCostBouquet implements Command{
    private final Bouquet bouquet;

    public calculateCostBouquet(Bouquet bouquet){
        this.bouquet=bouquet;
    }

    public void execute(){
        int cost = bouquet.calculateCost();
        System.out.println("Bouquet cost: " + cost+'\n');
    }
}
