package ru.gb.javaCore1_Homework_7;

public class CatHW7<banda> {

    private String name;
    private int appetite;
    private boolean catFull;
    private CatHW7[] banda;

    public CatHW7 (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public  int getAppetite() {
        return appetite;
    }

    public void eat(PlateHW7 plate) {
            plate.decreaseFood(appetite);
    }


    public boolean isCatFull(PlateHW7 plate) {

        if (plate.getCounter() > 0) {
            System.out.printf("Котик подхолил к миске %d раз.  Котик съел еды %d.\n", plate.getCounter(), this.appetite);
            return true;
        } else {
            System.out.printf("Котик остался голодным тк в миске мало еды, нужно - %d.\n" , this.appetite);
            return false;
        }
    }
}


