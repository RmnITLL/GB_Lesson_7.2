package ru.gb.javaCore1_Homework_7;

public class MainClassHW7 {

    public static void main(String[] args) {

        int coun = 0;

        CatHW7 cat = new CatHW7("Barsik", 100);
        PlateHW7 plate = new PlateHW7(99);

        CatHW7[] bandaCats = new CatHW7[] {
                new CatHW7("Чижик", 10),
                new CatHW7("Рижик", 20),
                new CatHW7("Васька", 15)
        };

        for (int i = 0; i < bandaCats.length; i++) {
            coun += bandaCats[i].getAppetite();
        }

        plate.info();
        cat.eat(plate);
        cat.isCatFull(plate);
        plate.info();

    }

//    public static void isBandaFull(PlateHW7 plateHW7) {
//
//       // plateHW7.info();
//       plateHW7.decreaseFood(int coun);
//       // plateHW7.getFood() -= coun;
//
//        if (plateHW7.info() > 0 && plateHW7.getFood() > 0) {
//
//
//        }
//
//    }
}
