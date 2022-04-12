package ru.gb.javaCore1_Homework_7;


public class PlateHW7 {
    private int food;
    private int counter = 0;

    public PlateHW7(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int getCounter() {
        return counter;
    }

    public void decreaseFood(int feed) {

        while (this.food > feed) {
            this.food -= feed;
            counter++;
            break;
        }
    }

//    public void isBandaFull(CatHW7[] cat) {
//        int coun = 0;
//
//        CatHW7[] bandaCats = new CatHW7[] {
//                new CatHW7("Чижик", 10),
//                new CatHW7("Рижик", 20),
//                new CatHW7("Васька", 15)
//        };
//
//
//        for (int i = 0; i < cat.length; i++) {
//            coun += cat[i].getAppetite();
//        }
//        System.out.println(coun);
//    }

    public void info() {
        System.out.println("В миске сейчас: " + food);
    }
}
