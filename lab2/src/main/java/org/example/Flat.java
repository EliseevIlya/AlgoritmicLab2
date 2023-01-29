package org.example;

public class Flat {
    private int FlatSquare = 50;
    private int FlatRoomQuantity = 2;

    public Flat(int flatSquare, int flatRoomQuantity) {
        this.FlatSquare = flatSquare;
        this.FlatRoomQuantity = flatRoomQuantity;
    }

    public Flat() {
    }

    public Flat(int flatSquare) {
        this.FlatSquare = flatSquare;
    }

    public static int GetRoomQuantity(Flat flat) {
        return flat.FlatRoomQuantity;
    }

    public static int GetFlatSquare(Flat flat) {
        return flat.FlatSquare;
    }

    public static void RoomQuantityChange(Flat flat, int number) {
        flat.FlatRoomQuantity = number;
    }

    public static void FlatSquareChange(Flat flat, int square) {
        flat.FlatSquare = square;
    }


    public static void main(String[] args) {
        Flat flat1 = new Flat(100, 3);
        RoomQuantityChange(flat1, 5);
        FlatSquareChange(flat1, 500);
        System.out.println(GetRoomQuantity(flat1));
        System.out.println(GetFlatSquare(flat1));
    }


}

