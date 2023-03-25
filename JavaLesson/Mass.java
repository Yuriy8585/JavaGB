// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
// Если в массиве нет подряд идущих 1, вывести 0.

package JavaLesson;

public class Mass {
    
    public static void main(String[] args) {
    int[] arr = new int[]{1,0,1,1,1};
    int count = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
            count++;
            if (count > max) {
                max = count;
            }
        }
        else {
            count = 0;
        }
    }
    System.out.println("Максимальное количество идущих подряд 1:" + max);
    }
}
