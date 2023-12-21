package PatternCommand;

import Bouquet.Bouquet;
import Accessory.*;

 public class addAccessoryToBouquet implements Command{
    private final Bouquet bouquet;
    private final Accessory accessory;

    public addAccessoryToBouquet(Bouquet bouquet,Accessory accessory){
        this.bouquet=bouquet;
        this.accessory=accessory;
    }

    public void execute(){
        bouquet.addAccessory(accessory);
        System.out.println(accessory.getName() + " added to the bouquet."+'\n');
    }
}
