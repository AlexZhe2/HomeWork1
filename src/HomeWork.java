import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {


        // 1. Найти наименьший общий делитель

        int maxValue2 = 1000;
        int randommValue4 = (int) (Math.random() * maxValue2) + 1;
        int randommValue5 = (int) (Math.random() * maxValue2) + 1;
        int maxOfTwo = 0;
        int minOfTwo = 0;
        int temp = 0;
        int NOD = 0;
        boolean check = true;

        if (randommValue4 == randommValue5) {
            NOD = randommValue4;
            check = false;
        }

        if (randommValue4 < randommValue5 && check == true) {
            maxOfTwo = randommValue5;
            minOfTwo = randommValue4;
        } else {
            maxOfTwo = randommValue4;
            minOfTwo = randommValue5;
        }

        while (check == true) {

            if (maxOfTwo % minOfTwo != 0) {

                temp = maxOfTwo % minOfTwo;
                maxOfTwo = minOfTwo;
                minOfTwo = temp;
            } else {
                NOD = minOfTwo;
                break;
            }
        }

        System.out.println("1. НОД чисел " + randommValue4 + " и " + randommValue5 + " = " + NOD);
        System.out.println();


        // 2. Написать программу перевода числа из 10 системы счисления
        // в 2 систему счисления

        int i = 0;
        int q = 0;
        int maxValue = 256;

        int randommValue = (int) (Math.random() * maxValue);
        System.out.print("2. Число " + randommValue + " в десятичной системе счисления = ");
        int randommValue16 = randommValue;
        int saveRandommValue = randommValue;
        int saveRandommValue16 = randommValue;

        while (randommValue != 0) {              // счетчик для кол-ва элементов в массиве
            randommValue = randommValue / 2;
            i++;
        }

        int[] array = new int[i];                 // создаем массив с кол-вом элементов = i

        for (int j = 0; j < array.length; j++) {  // вычисление + сохранение данных в массив
            array[j] = saveRandommValue % 2;
            saveRandommValue /= 2;
        }

        int[] array2 = new int[i];
        for (int k = array.length - 1; k > -1; k--) {   // реверс данных + вывод на печать
            array2[q] = array[k];
            System.out.print(array2[q]);
            q++;
        }

        System.out.println(" в двоичной системе счисления");
        System.out.println();


        // 3. Написать программу перевода числа из 10 системы счисления
        // в 16 систему счисления

        int z = 0;
        int x = 0;

        System.out.print("3. Число " + randommValue16 + " в десятичной системе счисления = ");

        while (randommValue16 != 0) {                  // счетчик для кол-ва элементов в массиве
            randommValue16 = randommValue16 / 16;
            z++;
        }

        int[] array16 = new int[z];                    // создаем массив с кол-вом элементов = i
        for (int j = 0; j < array16.length; j++) {     // вычисление + сохранение данных в массив
            array16[j] = saveRandommValue16 % 16;
            saveRandommValue16 /= 16;
        }
        int[] array16_2 = new int[z];
        for (int k = array16.length - 1; k > -1; k--) {   // реверс данных + вывод на печать

            array16_2[x] = array16[k];
            if (array16_2[x] <= 9) {
                System.out.print(array16_2[x]);
            }
            if (array16_2[x] == 10) {
                System.out.print("A");
            }
            if (array16_2[x] == 11) {
                System.out.print("B");
            }
            if (array16_2[x] == 12) {
                System.out.print("C");
            }
            if (array16_2[x] == 13) {
                System.out.print("D");
            }
            if (array16_2[x] == 14) {
                System.out.print("E");
            }
            if (array16_2[x] == 15) {
                System.out.print("F");
            }

            x++;
        }

        System.out.println(" в шестнадцатеричной системе счисления");
        System.out.println();


        /* 4. Дан массив целых чисел.
        Массив не отсортирован, числа могут повторяться.
        Необходимо найти в данном массиве такие два числа n и m,
        чтобы их сумма была равна 7.
        Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7
        * */

        int sizeArray = 30;
        int maxNum = 128;
        int minNum = -128;
        int v = 0;
        int numOfLoop = 0;
        int[] arr = new int[sizeArray];             // создаем массив с кол-вом элементов = sizeArray

        for (int j = 0; j < arr.length; j++) {      // заполнение массива
            int randommNum = (int) (Math.random() * (maxNum * 2)) + minNum;
            arr[j] = randommNum;
        }
        System.out.println("4. В массиве \"arr\"");
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {

            for (int c = numOfLoop; c + 1 < arr.length; c++) {
                int s = arr[j] + arr[c + 1];

                if (s == 7 && v == 0) {
                    System.out.println("сумма элементов равна 7 у пар с номерами индексов: ");
                    v++;
                }
                if (s == 7 && v != 0) {
                    System.out.println(j + " и " + (c + 1) + "    // числа " + arr[j] + ", " + +arr[c + 1]);
                    v++;
                }
            }
            numOfLoop++;
        }
        if (v == 0) {
            System.out.println("отсутствует пара с суммой равной 7");
        }
    }
}
