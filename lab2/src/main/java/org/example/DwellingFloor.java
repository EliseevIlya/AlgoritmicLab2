package org.example;

import static org.example.Flat.*;

public class DwellingFloor {
    private static Flat[] FloorFlats;

    //принимает количество квартир
    public DwellingFloor(int count) {
        FloorFlats = new Flat[count];
    }

    //принимает массив квартир
    public DwellingFloor(Flat[] floorFlats) {
        FloorFlats = floorFlats;
    }
//получение количества квартир
    public int GetCountOfFlats() {
        return FloorFlats.length;
    }

    //получение общей площади квартир
    public int GetSquareOfFlats() {
        int SumSquare = 0;
        for (int i = 0; i < FloorFlats.length; i++) {
            SumSquare += GetFlatSquare(FloorFlats[i]);
        }
        return SumSquare;
    }

    //получение количество комнат
    public static int GetCountOfRooms() {
        int SumRooms = 0;
        for (int i = 0; i < FloorFlats.length; i++) {
            SumRooms += GetRoomQuantity(FloorFlats[i]);
        }
        return SumRooms;
    }
//получение массива квартир
    public Flat[] GetFlats() {
        return FloorFlats;
    }
    //получение квартиры по ее номеру
    public Flat GetFlatNumber(int FlatNumber){
        return FloorFlats[FlatNumber];
    }
    //изменение квартиры по номеру
    public void ChangeFlatOnFloor(int FlatNumber, Flat NewFlat) {
        FloorFlats[FlatNumber]=NewFlat;
    }
    //добавление квартиры
    public void AddFlat(int NewCount,Flat NewFlat){
        Flat[] NewFloorFlats=new Flat[NewCount];
        for (int i=0;i<FloorFlats.length;i++){
            NewFloorFlats[i]=FloorFlats[i];
        }
        NewFloorFlats[NewCount]=NewFlat;
        FloorFlats=NewFloorFlats;
    }
    //удаление квартиры
    public void DeleteFlat(int DeleteNumber){
        Flat[] NewFloorFlats=new Flat[FloorFlats.length-1];
        for (int i=0;i<FloorFlats.length;i++){
            if (i != DeleteNumber) {
                NewFloorFlats[i]=FloorFlats[i];
            }
        }
        FloorFlats=NewFloorFlats;
    }
    public Flat getBestSpace(){
        int MaxSpace=0;
        int square=0;
        Flat BestFlat=new Flat();
        for (int i=0;i<FloorFlats.length;i++){
            square=GetFlatSquare(FloorFlats[i]);
            if (square>MaxSpace){
                MaxSpace=square;
                BestFlat=FloorFlats[i];
            }
        }
        return BestFlat;
    }

    public static void main(String[] args) {
        Flat flat1 = new Flat(100, 3);
        Flat flat2 = new Flat();
        Flat[] floor1={flat1,flat2};
        new DwellingFloor(floor1);
        System.out.println(GetCountOfRooms());
        System.out.println(floor1.getClass());
    }

}
