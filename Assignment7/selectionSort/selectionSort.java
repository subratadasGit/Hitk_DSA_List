package Assignment7.selectionSort;

import java.util.Arrays;

class selection{


    void sort(int arr[],int n)
    {

        int i , j ;
        for ( i = 0; i < n; i++) {
       
                 int min = i ;

            for(j=i+1;j<n;j++){

            if(arr[j]<arr[min]){
                    min = j;     
            }

            int temp = arr[i];
                
            arr[i]=arr[min];

            arr[min]= temp;

            }
        }

    }
}

public class selectionSort {

    public static void main(String[] args) {

        int arr[]={13,46,24,52,20,9};
        int  n=arr.length;

        selection ss = new selection();

        ss.sort(arr, n);

        System.out.println(Arrays.toString(arr));


       
    
        
    }
    
}
