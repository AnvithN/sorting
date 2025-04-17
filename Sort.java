public class Sort
  {
    public static void selectionsort(int[] array1)
    {
      for(int i = 0; i < array1.length; i++) {
         for(int j = 0; j < array1.length ; j++) {
            if(array1[j] > array1[i]) {
               int move = array1[j];
               array1[j] = array1[i];
               array1[i] = move;
            }
         }
      }
      }
    
    public static void insertsort(int[] array2)
    {
        boolean swap;
      do {
        swap = false;
         for(int i = 0; i < array2.length - 1; i++) {
            if(array2[i] > array2[i + 1]) {
               int temp = array2[i + 1];
               array2[i + 1] = array2[i];
               array2[i] = temp;
               swap = true;
            }
         }
      } while(swap);
    }

    public static void mergesort(int[] array3)
    {
      int[] arr1 = new int[array3.length/2];
    }

    
  }
