import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        int[] MyArray;
        String[] Array;
        MyArray = new int[10];
        Array = new String[10]; // array length cannot be changed
        int firstInt = MyArray[0]; //accessing
        int arrayLength = MyArray.length; //using length field

        // iterating arrays 
        for(int i = 0;i<Array.length; i++){
            Array[i] = "string no" + i;
        }
        for(int i = 0;i < Array.length;i++){
            System.out.println(Array[i]);
        }

        // with another type for array 
        int[] integers = new int[10];
        for(int  i = 0;i < integers.length;i++){
            integers[i] = (int) Math.pow(i, 2);
        }
        for(int i = 0;i< integers.length;i++){
            System.out.println(integers[i]);
        }

        //for each loop 
        for(int theint : integers){
            System.out.println(theint);
        }
        // multidimensional 

        int[][] anotherArray = new int[10][10] ; 
        anotherArray[1][0] = 10;


// using ''Array'' classsssssssssss --------------------------------------------------
        // with importing java.util.Arrays

        //copy arrays without this class
        int[] source = new int[10];
        int[] dest   = new int[10];

        for(int i=0; i < source.length; i++) {
            source[i] = i;
        }

        for(int i=0; i < source.length; i++) {
            dest[i] = source[i];
        }
        //array copyof method 

        int[] copyOfsource;
        copyOfsource = Arrays.copyOf(source,source.length);
        // 'copy of range' method
        int[] rangeCopy;
        rangeCopy = Arrays.copyOfRange(source,1,5);

        // converting array to string 

        int[] ints = new int[10];
        for(int i=0; i < ints.length; i++){
            ints[i] = 10 - i;
        }
        System.out.println(Arrays.toString(ints)); // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        // sorting arrays 
        Arrays.sort(ints); // in ascending order
        System.out.println(Arrays.toString(ints)); // sorted will printed

        // equality of arrays 
        //Arrays.equals(arr1 , arr2) that returns a boolean

        // searching for element in arrat with binarysearch method 
        int[] intss = {0,2,4,6,8,10};
        int index = Arrays.binarySearch(intss, 0, 4, 2);
        System.out.println(index);
    }

        // inserting an element into an array
    public void InsertArray(int[] arr,int index,int value){
        for(int i = arr.length - 1;i > index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }

    // removing from array 
    public void removeArray(int[] arr,int ind){
        for(int i = ind;i < arr.length - 1 ; i++){
            arr[i] = arr[i+1]; 
        }
    }

}
