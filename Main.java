import java.util.*;
class Main {
  public static void main(String[] args) {
    
    //declare and intialize 3 arrays
    int [] arr1 = {5, 2, 7, 1, 9};
    int [] arr2 = {6, 0, 3, 8, 4};
    int [] arr3 = {7, 1, 9, 5, 0, 3, 6, 2};

  //call the different sort methods
  //Implement the Sort methods in the Sort class
    Sort.selectionsort(arr1);
    Sort.insertsort(arr2);
    Sort.mergesort(arr3);

  //print the sorted arrays to console
    System.out.println("Sorted arr1:" + Arrays.toString(arr1));
    System.out.println("Sorted arr2:" + Arrays.toString(arr2));
    System.out.println("Sorted arr3:" + Arrays.toString(arr3));
  }
}
