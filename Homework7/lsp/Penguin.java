package Homework7;

public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать!");
    }

}
