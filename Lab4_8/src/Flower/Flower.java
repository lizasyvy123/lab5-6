package Flower;

public class Flower {

    private final String name;
    private final int  cost;
    private final int length;
    private final int freshLevel;

    public Flower(String name, int cost, int length, int freshLevel) {
        this.name = name;
        this.cost = cost;
        this.length = length;
        this.freshLevel = freshLevel;
    }

    public String getName() {
        return name;
    }

    public int getCost(){ return cost;}

    public int getLength(){
        return length;
    }

    public int getFreshLevel(){
        return freshLevel;
    }

    @Override
    public String toString() {
        return "\n" + name + ':' +
                " cost=" + cost +
                ", length=" + length +
                ", freshLevel=" + freshLevel;
    }
}




