package Java_SE_02.FirstToFourthTask;

import java.util.ArrayList;

public class SetOfNewbie {
    private ArrayList<Stationery> goods =
            new ArrayList<>();

    public SetOfNewbie() {
        this.goods.add(new Pen(10));
        this.goods.add(new Pencil(5));
    }

    public ArrayList<Stationery> getSetOfNewbie(){
        return new SetOfNewbie().goods;
    }

}
