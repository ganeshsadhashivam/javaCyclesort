import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        CyclicSwap(arr);

        System.out.println(Arrays.toString(arr));
    }
    //3    5   2   1    4
    //0    1   2   3    4
    static void CyclicSwap(int[] arr){


        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }



//       // for(int i=0;i<arr.length;i++){arr[i] != i &&
//        int j = arr.length-1;
//        int i=0;
//        int k=0;
//           while( i<= j) {
//
//               if (i != arr[k] && ( arr[k] != i+1)){
//                   i++;
//
//           }
//               else{
//                   int temp = arr[i];
//                   arr[i] = arr[k];
//                   arr[k] = temp;
//                   k++;
//
//               }
//
//            }
//      //  }
//
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}