package PatternCommand;

import Bouquet.Bouquet;

public class sortFlowerByFreshLevel implements Command{
    private final Bouquet bouquet;

    public sortFlowerByFreshLevel(Bouquet bouquet){
        this.bouquet=bouquet;
    }

    public void execute(){
        bouquet.sortFlowerByFreshLevel();
        System.out.println("Bouquet was sorted by fresh level. "+'\n');
    }
}
