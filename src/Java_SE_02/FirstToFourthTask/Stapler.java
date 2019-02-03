package Java_SE_02.FirstToFourthTask;

import java.util.Objects;

public class Stapler implements Stationery {
    private int cost = 0;
    private int size = 2;
    private String name = "Simple";

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stapler stapler = (Stapler) o;
        return getCost() == stapler.getCost() &&
                getSize() == stapler.getSize() &&
                Objects.equals(getName(), stapler.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getSize(), getName());
    }

    @Override
    public String toString() {
        return "Stapler{" +
                "cost=" + cost +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public Stapler() {
    }

    public Stapler(int cost) {
        this.cost = cost > 0 ? cost : 0;
    }

    public Stapler(int cost, int size, String name) {
        this.cost = cost > 0 ? cost : 0;
        this.size = size > 0 ? size : 1;
        this.name = name;
    }
}
