package org.example;

import static org.example.Flat.*;

public class Main {
    public static void main(String[] args) {
        Flat flat1 = new Flat(100, 3);
        RoomQuantityChange(flat1, 5);
        FlatSquareChange(flat1, 500);
        System.out.println(GetRoomQuantity(flat1));
        System.out.println(GetFlatSquare(flat1));
    }
}