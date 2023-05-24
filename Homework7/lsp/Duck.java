package Homework7;

/**
 * S
 */
public class Duck extends Bird {

    @Override
    public void fly() {
        System.out.printf("Утка летит со скоростью %d км/ч\n", flySpeed);
    }
}
