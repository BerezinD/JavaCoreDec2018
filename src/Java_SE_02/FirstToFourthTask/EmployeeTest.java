package Java_SE_02.FirstToFourthTask;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void sortStationery() {
        Employee mVasya = new Employee();
        mVasya.addStationery(new Pen(15));
        mVasya.addStationery(new Pencil(30));
        mVasya.addStationery(new ScotchTape(50));

        assertEquals(95, mVasya.getAllStationeryCost());

        SetOfNewbie oneSet = new SetOfNewbie();
        mVasya = new Employee(oneSet.getSetOfNewbie());

        assertEquals(15, mVasya.getAllStationeryCost());

        mVasya.addStationery(new Pen(0));
        mVasya.addStationery(new Pen(15));
        mVasya.addStationery(new Pen(10, 5,"AfroPen", Color.BLACK, TypeOfPen.SIMPLE));
        mVasya.addStationery(new Stapler(10));
        for (Stationery good: mVasya.getGoods())
            System.out.println(good);
        System.out.println();

        mVasya.sortStationery(true, false, mVasya.getGoods());

        assertEquals(50, mVasya.getAllStationeryCost());

        for (Stationery good: mVasya.getGoods())
            System.out.println(good);
    }
}