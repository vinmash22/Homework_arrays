import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1, задача 2");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.println(array[index]);
                break;
            }
            System.out.print(array[index] + ", ");
        }
        float[] array1 = new float[]{1.57f, 7.654f, 9.986f};
        for (int index = 0; index < array1.length; index++) {
            if (index == array1.length - 1) {
                System.out.println(array1[index]);
                break;
            }
            System.out.print(array1[index] + ", ");
        }

        int[] array2 = {95, 87, 100, 110, 6, 7, 1250};
        for (int index = 0; index < array2.length; index++) {
            if (index == array2.length - 1) {
                System.out.println(array2[index]);
                break;
            }
            System.out.print(array2[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int index = array.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(array[index]);
                break;
            }
            System.out.print(array[index] + ", ");
        }
        float[] array1 = new float[]{1.57f, 7.654f, 9.986f};
        for (int index = array1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(array1[index]);
                break;
            }
            System.out.print(array1[index] + ", ");
        }

        int[] array2 = {95, 87, 100, 110, 6, 7, 1250};
        for (int index = array2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(array2[index]);
                break;
            }
            System.out.print(array2[index] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array4 = new int[3];
        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 3;
        for (int index = 0; index < array4.length; index++) {
            if (array4[index] % 2 == 1) {
                array4[index] = array4[index] + 1;
            }
        }
        System.out.println(Arrays.toString(array4));
    }
}
