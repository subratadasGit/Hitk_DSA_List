package Assignment7.BubbleSort;

import java.util.Arrays;

class Bubble{

    void sort(int arr[]){
        int  n=arr.length;

        for (int i = n-1; i>=0; i--) {
            
            for(int j=0;j<=i-1;j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1]= temp;
                }
            }
        }

    }    
            void print(int arr[]){
            int  n=arr.length;

            for ( int i = 0; i < n; i++) {
                
                System.out.println(arr[i]);
            }


    }
}

public class BubbleSort {
    
public static void main(String[] args) {

    int arr[]={13,46,24,52,20,9};

    Bubble BS = new Bubble();

    BS.sort(arr);

    BS.print(arr);
    
}

}
