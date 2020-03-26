package Assignmetn1Final;

import java.util.Random;
import java.util.Arrays;


public class Main {



    public static void main(String[] args) {

        Sorts s = new Sorts();


        int[] coreData = new int[1000000];

        Random randNum = new Random();

        for(int i = 0; i < 1000000;i++){

            coreData[i] = randNum.nextInt(3000000)+1;

        }

        int[]coreDataFifty = new int[50];
        int[]coreDataThousand = new int[1000];
        int[]coreDataTenThou = new int[10000];
        int[]coreDataHunThou = new int[100000];


        for (int i=0; i<coreDataFifty.length; i++){
            coreDataFifty[i] = coreData[i];

        }

        for (int i=0; i<coreDataThousand.length; i++){
            coreDataThousand[i] = coreData[i];

        }

        for (int i=0; i<coreDataTenThou.length; i++){
            coreDataTenThou[i] = coreData[i];

        }

        for (int i=0; i<coreDataHunThou.length; i++){
            coreDataHunThou[i] = coreData[i];

        }


        //System.out.println(s.timingFunction(coreDataFifty, coreDataThousand, coreDataTenThou, coreDataHunThou, coreData));
        long startQuiFifty = System.nanoTime();

        s.quickSort(coreDataFifty, 0, coreDataFifty.length-1);

        long endQuiFifty = System.nanoTime();

        long timeQuiFifty = endQuiFifty - startQuiFifty;

        //Thou

        long startQuiThou = System.nanoTime();

        s.quickSort(coreDataThousand, 0, coreDataThousand.length-1);

        long endQuiThou = System.nanoTime();


        long timeQuiThou = endQuiThou - startQuiThou;

        //TenThou

        long startQuiTenThou = System.nanoTime();

        s.quickSort(coreDataTenThou, 0, coreDataTenThou.length-1);

        long endQuiTenThou = System.nanoTime();


        long timeQuiTenThou = endQuiTenThou - startQuiTenThou;


        //HunThou

        long startQuiHunThou = System.nanoTime();

        s.quickSort(coreDataHunThou, 0, coreDataHunThou.length-1);

        long endQuiHunThou = System.nanoTime();

        long timeQuiHunThou = endQuiHunThou - startQuiHunThou;

        //Mill

        long startQuiMill = System.nanoTime();

        s.quickSort(coreData, 0, coreData.length-1);

        long endQuiMill = System.nanoTime();

        long timeQuiMill = endQuiMill - startQuiMill;

        System.out.println("Quick Sort:");

        System.out.println("50: Nanoseconds " + timeQuiFifty);
        System.out.println("1000: Nanoseconds "+ timeQuiThou);
        System.out.println("10,000: Nanoseconds " + timeQuiTenThou);
        System.out.println("100,000: Nanoseconds " + timeQuiHunThou);
        System.out.println("1,000,000: Milliseconds "+ timeQuiMill/1000000);



        System.out.println("***********************************");


        long startInsFifty = System.nanoTime();

        s.InsertionSort(coreDataFifty);

        long endInsFifty = System.nanoTime();

        long timeInsFifty = endInsFifty - startInsFifty;

        //Thou

        long startInsThou = System.nanoTime();

        s.InsertionSort(coreDataThousand);

        long endInsThou = System.nanoTime();


        long timeInsThou = endInsThou - startInsThou;

        //TenThou

        long startInsTenThou = System.nanoTime();

        s.InsertionSort(coreDataTenThou);

        long endInsTenThou = System.nanoTime();


        long timeInsTenThou = endInsTenThou - startInsTenThou;


        //HunThou

        long startInsHunThou = System.nanoTime();

        s.InsertionSort(coreDataHunThou);

        long endInsHunThou = System.nanoTime();

        long timeInsHunThou = endInsHunThou - startInsHunThou;

        //Mill

        long startInsMill = System.nanoTime();

        s.InsertionSort(coreData);

        long endInsMill = System.nanoTime();

        long timeInsMill = endInsMill - startInsMill;

        System.out.println("Insertion Sort:");

        System.out.println("50: Nanoseconds " + timeInsFifty);
        System.out.println("1000: Nanoseconds "+ timeInsThou);
        System.out.println("10,000: Nanoseconds " + timeInsTenThou);
        System.out.println("100,000: Nanoseconds " + timeInsHunThou);
        System.out.println("1,000,000: Milliseconds "+ timeInsMill/1000000);


        System.out.println("***********************************");

        long startSelFifty = System.nanoTime();

        s.SelectionSort(coreDataFifty);

        long endSelFifty = System.nanoTime();

        long timeSelFifty = endSelFifty - startSelFifty;

        //Thou

        long startSelThou = System.nanoTime();

        s.SelectionSort(coreDataThousand);

        long endSelThou = System.nanoTime();


        long timeSelThou = endSelThou - startSelThou;

        //TenThou

        long startSelTenThou = System.nanoTime();

        s.SelectionSort(coreDataTenThou);

        long endSelTenThou = System.nanoTime();


        long timeSelTenThou = endSelTenThou - startSelTenThou;


        //HunThou

        long startSelHunThou = System.nanoTime();

        s.SelectionSort(coreDataHunThou);

        long endSelHunThou = System.nanoTime();

        long timeSelHunThou = endSelHunThou - startSelHunThou;

        //Mill

        long startSelMill = System.nanoTime();

        s.SelectionSort(coreData);

        long endSelMill = System.nanoTime();

        long timeSelMill = endSelMill - startSelMill;

        System.out.println("Selection Sort:");

        System.out.println("50: Nanoseconds " + timeSelFifty);
        System.out.println("1000: Nanoseconds "+ timeSelThou);
        System.out.println("10,000: Nanoseconds " + timeSelTenThou);
        System.out.println("100,000: Nanoseconds " + timeSelHunThou);
        System.out.println("1,000,000: Milliseconds "+ timeSelMill/1000000);

        System.out.println("***********************************");

        long startMerFifty = System.nanoTime();

        s.mergeSort(coreDataFifty);

        long endMerFifty = System.nanoTime();

        long timeMerFifty = endMerFifty - startMerFifty;

        //Thou

        long startMerThou = System.nanoTime();

        s.mergeSort(coreDataThousand);

        long endMerThou = System.nanoTime();


        long timeMerThou = endMerThou - startMerThou;

        //TenThou

        long startMerTenThou = System.nanoTime();

        s.mergeSort(coreDataTenThou);

        long endMerTenThou = System.nanoTime();


        long timeMerTenThou = endMerTenThou - startMerTenThou;


        //HunThou

        long startMerHunThou = System.nanoTime();

        s.mergeSort(coreDataHunThou);

        long endMerHunThou = System.nanoTime();

        long timeMerHunThou = endMerHunThou - startMerHunThou;

        //Mill

        long startMerMill = System.nanoTime();

        s.SelectionSort(coreData);

        long endMerMill = System.nanoTime();

        long timeMerMill = endMerMill - startMerMill;

        System.out.println("Merge Sort:");

        System.out.println("50: Nanoseconds " + timeMerFifty);
        System.out.println("1000: Nanoseconds "+ timeMerThou);
        System.out.println("10,000: Nanoseconds " + timeMerTenThou);
        System.out.println("100,000: Nanoseconds " + timeMerHunThou);
        System.out.println("1,000,000: Milliseconds "+ timeMerMill/1000000);

        System.out.println("***********************************");




















    }







}
