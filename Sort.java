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

    public static void mergesort(int[] array3) {
      if (array3.length < 2) {
          return; 
      }
  
      int mid = array3.length / 2;
      int[] left = new int[mid];
      int[] right = new int[array3.length - mid];

      for (int i = 0; i < mid; i++) {
          left[i] = array3[i];
      }
      for (int i = mid; i < array3.length; i++) {
          right[i - mid] = array3[i];
      }
     
      mergesort(left);
      mergesort(right);
      merge(array3, left, right);
  }
  private static void merge(int[] array3, int[] left, int[] right) {
      int i = 0, j = 0, k = 0;
  
      while (i < left.length && j < right.length) {
          if (left[i] <= right[j]) {
              array3[k++] = left[i++];
          } else {
              array3[k++] = right[j++];
          }
      }
      while (i < left.length) {
          array3[k++] = left[i++];
      }
  
      while (j < right.length) {
          array3[k++] = right[j++];
      }
  }
  }
