package Homework7;

/**
 * T
 */
public class Bird {

    protected int flySpeed = 10;

    public int getFlySpeed() {
        return flySpeed;

    }

    public void fly(){
        System.out.printf("Птица летит со скоростью %d км/ч\n", flySpeed);
    }

}
