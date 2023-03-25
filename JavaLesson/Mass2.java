/*Дан массив nums = [1,3,2,4,3,5,3,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
а остальные - равны ему.
решить нужно без использования дополнительного массива, а только перестановкой элементов.
[1,2,4,5,3,3,3,3]
*/

package JavaLesson;

public class Mass2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,4,3,5,3,3};
        int val = 3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == val) {
                    
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }
        }
        /* */ 
        for (int i : arr) {
            System.out.print(i + " ");
        }
        //System.out.println(arr);
}
}