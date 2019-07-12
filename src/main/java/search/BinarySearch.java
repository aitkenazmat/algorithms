package search;

public class BinarySearch {

    public static void main(String[] args) {

        int [] arr  = new int[1000000000];
        for (int i = 0; i <  1000000000 ; i++) {
            arr[i] = i+1;
        }

        int res = binarySearch(arr,20000002);

        System.out.println("res = " + res);
    }



    public static int binarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length -1;

        int i = 1;
        while (low<=high) {
            System.out.println("operation # " + i );
            i++;
            int mid = (low+high)/2;
            int guess = arr[mid];

            if (guess == item)
                return mid;

            if (guess>item)
                high = mid - 1;
            else
                low = mid+1;
        }

        return -1;
    }

    public static int linearSearch(int[] arr, int item){

        int o =1;
        for (int i = 0; i < arr.length; i++) {

            System.out.println("operation = " + o);
            o++;

            if (arr[i] == item) {
                return i;
            }
        }

        return -1;
    }
}
