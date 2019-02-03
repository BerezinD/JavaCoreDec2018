package Java_SE_02.FirstToFourthTask;

import java.util.Objects;

/**
 * Class with pen (abstraction pen)
 * @author Berezin Dmitrii
 */
public class Pen implements Stationery {
    private int cost = 0;
    private int size = 2;
    private String name = "Simple";
    private Color colorOfPen = Color.BLACK;
    private TypeOfPen typeOfPen = TypeOfPen.SIMPLE;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Color getColorOfPen() {
        return colorOfPen;
    }

    public TypeOfPen getTypeOfPen() {
        return typeOfPen;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "cost=" + cost +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", colorOfPen=" + colorOfPen +
                ", typeOfPen=" + typeOfPen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return cost == pen.cost &&
                size == pen.size &&
                Objects.equals(name, pen.name) &&
                colorOfPen == pen.colorOfPen &&
                typeOfPen == pen.typeOfPen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, size, name, colorOfPen, typeOfPen);
    }

    Pen (){
    }

    Pen (int cost){
        this.cost = cost > 0 ? cost : 0;
    }

    Pen(int cost, int size, String name, Color colorOfPen, TypeOfPen typeOfPen){
        this.cost = cost > 0 ? cost : 0;
        this.size = size > 0 ? size : 1;
        this.name = name;
        this.colorOfPen = colorOfPen;
        this.typeOfPen = typeOfPen;
    }
}

enum Color{
    BLUE,
    BLACK,
    GREEN
}

enum TypeOfPen{
    AUTOMATIC,
    SIMPLE,
    CLICKABLE
}