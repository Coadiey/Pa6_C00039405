// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 260
// Programming Assignment : #6
// Due Date : 4/13/18 
// Program Description: makes an ArrayList of user defined length, sums,averages,sums even indexed elements,counts number of negative elements and produces arrayList with reversed elements from initial Arraylist
// Certificate of Authenticity:
// I certify that the code in the method function main of this project is entirely my own
// work.
package pa6_c00039405;

import java.util.ArrayList;
import java.util.Collections;

public class Pa6_C00039405 {

    // This method receives a parameter giving the number of doubles
    // that will be placed in an ArrayList<Double>, creates the 
    // ArrayList<Double>, add random double numbers within the range 
    // ­size/2 to +size/2, and returns the reference (address) of the 
    // ArrayList<Double>.
    public static ArrayList<Double> makeArrayList(int size) {
        if (size < 1) {
            return null;
        }

        ArrayList<Double> a = new ArrayList();

        for (int i = 0; i < size; i++) {
            a.add(Math.random() * size - size / 2);
        }

        return a;
    }

    public static double arrayListSum(ArrayList<Double> a) {
        int i;
        double sum = 0;
        for (i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum;
    }

    public static double arrayListAvg(ArrayList<Double> a) {
        int i;
        double sum = 0;
        double avg;
        for (i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        avg = sum / i;
        return avg;
    }

    public static void arrayListEven(ArrayList<Double> a) {
        int i = 0;
        double evenSum = 0;
        for (; i < a.size(); i++) {
            if (i % 2 == 0 && i != 0) {
                evenSum += a.get(i);
            }
        }
        System.out.printf("Sum of array elements with even index: %.2f", evenSum);
        System.out.println();
    }

    public static void arrayListNegatives(ArrayList<Double> a) {
        int i = 0;
        int negativeAmount = 0;
        for (; i < a.size(); i++) {
            if (a.get(i) < 0) {
                negativeAmount += 1;
            }
        }
        System.out.printf("Count of negative numbers in the array: %d", negativeAmount);
        System.out.println();
    }

    public static ArrayList<Double> arrayListReverser(ArrayList<Double> a) {
        int i = 0;
        ArrayList<Double> reversedA = new ArrayList<>(a.size());
        for (; i < a.size(); i++) {
            reversedA.add(i, a.get(i));
            Collections.reverse(reversedA);
        }
        return reversedA;
    }

    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("Please give the size of the arrayList you'd like to start with(integer bigger than 0): ");
        int size = keyboard.nextInt();
        ArrayList<Double> newArrayList = makeArrayList(size);
        double sum = arrayListSum(newArrayList);
        System.out.printf("The sum of the arrayList elements is %.2f", sum);
        System.out.println();
        double avg = arrayListAvg(newArrayList);
        System.out.printf("The average of the arrayList elements is %.2f", avg);
        System.out.println();
        arrayListEven(newArrayList);
        arrayListNegatives(newArrayList);

        ArrayList<Double> reversedArrayList = arrayListReverser(newArrayList);
        int i = 0;
        for (; i < reversedArrayList.size(); i++) {
            System.out.printf("%.2f,   %.2f", newArrayList.get(i), reversedArrayList.get(i));
            System.out.println();
        }
        System.out.println("");
    }
}
