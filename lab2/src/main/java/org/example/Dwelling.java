package org.example;

public class Dwelling {
    private static DwellingFloor[][] Building;
// принимает количество этажей и массив квартир по этажам
    public Dwelling (int count, DwellingFloor[] floorFlats){
        Building=new DwellingFloor[count][];
        for (int i=0;i<count;i++){
            Building[i]=floorFlats;
        }
    }
//принимает массив этажей дома
    public Dwelling(DwellingFloor[][] dwelling){
        Building=dwelling;
    }

    public Dwelling(Flat[][] build1) {
    }

    //получение общего количесва этажей
    public static int GetCountOfDwelling() {
        System.out.println(Building);
        return 0;
    }

    public static void main(String[] args) {
        Flat flat1 = new Flat(100, 3);
        Flat flat2 = new Flat(50,2);
        Flat[] floor1={flat1,flat2};
        Flat flat3 = new Flat(120, 4);
        Flat flat4 = new Flat(300,6);
        Flat[] floor2={flat3,flat4};
        Flat flat5 = new Flat(130, 4);
        Flat flat6 = new Flat(200,6);
        Flat[] floor3={flat5,flat6};
        Flat[][] Build1={floor1,floor2,floor3};
        System.out.println(Build1[1][1]);
        System.out.println(new Dwelling(Build1));
        System.out.println(GetCountOfDwelling());
    }
}
