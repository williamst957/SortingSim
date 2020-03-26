package Assignmetn1Final;

public class Sorts {

    public void SelectionSort(int[] arr){


        for (int x=0;x<arr.length;x++){

            int locSmall=x;
            for (int y=x+1;y<arr.length;y++){
                if (arr[y]<arr[locSmall]){
                    locSmall=y;
                }
            }

            int temp= arr[x];
            arr[x]=arr[locSmall];
            arr[locSmall]=temp;
        }



    }


    public void InsertionSort(int[] arr){

        for (int x = 1; x<arr.length;x++){

            int temp = arr[x];
            int pos = x-1;

            while(pos >= 0 && arr[pos]>temp){

                arr[pos + 1] = arr[pos];

                pos--;


            }

            arr[pos + 1] = temp;
        }
    }


    /*public void mergeSort(int [] arr, int length){

        if (length < 2){
            return;
        }

        int mid = length/2;

        int left[] = new int[mid];

        int right[] = new int[length - mid];

        for (int x = 0; x < mid; x++){

            left[x] = arr[x];
        }

        for (int x = mid; x < length; x++ ){

            right[x - mid] = arr[x];
        }

        int [] result = new int[arr.length];

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        result = merge(arr, left, right, mid, mid - arr.length);

        arr = result;



    }

    public static int[] merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    } */


    public void mergeSort(int [] arr){

        if (arr.length < 2){

            return;
        }

        int length = arr.length;

        int midpoint = arr.length/2;

        int [] left = new int[midpoint];

        int [] right = new int[arr.length - midpoint];



        for (int i = 0; i < midpoint; i++){

            left[i] = arr[i];

        }

        for (int j = 0; j < right.length; j++){

            right[j] = arr[midpoint+j];
        }

        int [] result = new int [arr.length];

        mergeSort(left);
        mergeSort(right);

        result = merge(left, right);

        for (int x = 0; x < arr.length; x++){

            arr[x] = result[x];
        }




    }

    public int[] merge(int [] left, int [] right){

        int [] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length){

            if (leftPointer < left.length && rightPointer < right.length){

                if (left[leftPointer] < right[rightPointer]){

                    result[resultPointer] = left[leftPointer];

                    resultPointer++;
                    leftPointer++;
                } else {

                    result[resultPointer] = right[rightPointer];

                    resultPointer++;
                    rightPointer++;
                }
            } else if (leftPointer < left.length){

                result[resultPointer] = left[leftPointer];

                resultPointer++;
                leftPointer++;

            } else if (rightPointer < right.length){

                result[resultPointer] = right[rightPointer];

                resultPointer++;
                rightPointer++;

            }
        }

        return result;




    }

    public void quickSort(int arr[], int begin, int end) {


        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }





}
