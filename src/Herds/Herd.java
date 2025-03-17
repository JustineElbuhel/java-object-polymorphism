package Herds;

import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;
    private int x;
    private int y;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy){
        for(Movable item : herd){
            item.move(dx, dy);
        }
    }

    @Override
    public String toString(){
        String print = "";
        for(Movable organism : herd){
            print += organism.toString() + "\n";
        }

        return print;
    }
}
