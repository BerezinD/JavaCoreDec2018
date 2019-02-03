package Java_SE_02.FirstToFourthTask;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee{
    private ArrayList<Stationery> goods;

    public Employee(ArrayList<Stationery> goods) {
        this.goods = goods;
    }

    public Employee() {
        this.goods = new ArrayList<Stationery>();
    }

    public ArrayList<Stationery> getGoods() {
        return goods;
    }

    public int getAllStationeryCost(){
        int rezult = 0;
        for(Stationery good: goods){
            rezult += good.getCost();
        }
        return rezult;
    }

    public void addStationery(Stationery good){
        this.goods.add(good);
    }

    public void sortStationery (boolean sortByCost, boolean sortByName, ArrayList<Stationery> goods){
        if (sortByCost){
            if (sortByName){
                //sort by cost and by name, then return
                goods.sort(new Comparator<Stationery>() {
                    @Override
                    public int compare(Stationery o1, Stationery o2) {
                        if (o2.getCost() == o1.getCost())
                            return o1.getName().compareToIgnoreCase(o2.getName());
                        else return o1.getCost() - o2.getCost();
                    }
                });
                return;
            }
            //sort by cost only then return
            goods.sort(new Comparator<Stationery>() {
                @Override
                public int compare(Stationery o1, Stationery o2) {
                    return o1.getCost() - o2.getCost();
                }
            });
        } else {
            if (sortByName) {
                //sort by Name only, then return
                goods.sort(new Comparator<Stationery>() {
                    @Override
                    public int compare(Stationery o1, Stationery o2) {
                        return o1.getName().compareToIgnoreCase(o2.getName());
                    }
                });
            }
        }
    }
}