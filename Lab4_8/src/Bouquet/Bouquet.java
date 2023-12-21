package Bouquet;

import Flower.Flower;
import Accessory.Accessory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bouquet {

   private final List<Flower> flowers;
   private final List<Accessory> accessories;
   private int costBouquet;

    public Bouquet() {
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();
        this.costBouquet=0;
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory){
        accessories.add(accessory);
    }

    public int getCostBouquet() {
        return costBouquet;
    }

    public void setCostBouquet(int costBouquet) {
        this.costBouquet = costBouquet;
    }

    public int calculateCost(){

        int costFlowers=0;

        for(Flower flower: flowers)
        {
            costFlowers+=flower.getCost();
        }

        int costAccessories = 0;

        for(Accessory accessory: accessories)
        {
            costAccessories+=accessory.getCost();
        }

        setCostBouquet(costFlowers+costAccessories);
        return getCostBouquet();

    }

    public void sortFlowerByFreshLevel()
    {
        flowers.sort(Comparator.comparingInt(Flower::getFreshLevel));
    }

    public void findFlowersInRange()
    {
        Scanner scanner = new Scanner(System.in);

        int x,y;
        System.out.println("Enter x and y: ");
        x= scanner.nextInt();
        y= scanner.nextInt();

        boolean flowersFound = false;

        for (Flower flower : flowers)
        {
            if(flower.getLength() >= x  && flower.getLength() <= y)
            {
                System.out.println(flower);
                flowersFound = true;
            }
        }

        if (!flowersFound)
        {
            System.out.println("No flowers found in this range. ");
        }

    }

    @Override
    public String toString() {
        return "Bouquet:" + "\n\n" +
                "Flowers:" + "\n" + flowers + "\n\n" +
                "Accessories:" + "\n" + accessories + "\n";
    }
    
}
