package PatternCommand;

import Bouquet.Bouquet;
import Flower.*;

public class addFlowerToBouquet implements Command{
    private final Bouquet bouquet;
    private final Flower flower;

    public addFlowerToBouquet(Bouquet bouquet,Flower flower){
        this.bouquet=bouquet;
        this.flower=flower;
    }

    public void execute(){
        bouquet.addFlower(flower);
        System.out.println(flower.getName() + " added to the bouquet."+'\n');
    }
}