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
            if (this.food < 0) {
                System.out.println("В миску необходимо положить корм");
                break;
            }
            counter++;
            break;
        }
    }


    public int info() {

        System.out.println("В миске сейчас: " + food);
        return food;
    }

    public void putFood(int amount) {
        this.food += amount;
        System.out.println("В миску положили " + amount + " сейчас в миске " + food + " еды.");
    }
}
