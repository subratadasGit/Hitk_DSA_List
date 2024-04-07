 package Assignment7.Insertionsort;


 class Insertion{

    void sort(int arr[], int n){

     


        for(int i = 0 ; i <= n-1 ; i++){

            int j = i ;
            while (j>0 && arr[j-1]>
            arr[j]){


                int temp = arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;

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

 public class insertionSort {




    public static void main(String[] args) {

        int arr[]={ 14 , 9 , 15 , 12 , 6 , 8 ,13};
        int n = arr.length;

        Insertion in = new Insertion();
        in.sort(arr, n);
        in.print(arr);

        
        
    }
    
}