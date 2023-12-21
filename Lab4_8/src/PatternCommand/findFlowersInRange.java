package PatternCommand;

import Bouquet.Bouquet;


public class findFlowersInRange implements Command{
    private final Bouquet bouquet;

    public findFlowersInRange(Bouquet bouquet){
        this.bouquet=bouquet;
    }

    public void execute(){
        bouquet.findFlowersInRange();
    }
}
