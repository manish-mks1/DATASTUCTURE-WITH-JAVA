public class reverseArray {
    //recursive method
    static void reverseArrayR(int arr[], int s, int e){
        if(s>=e)
        return;
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverseArrayR(arr, s+1, e-1);
    }
    //iterative method
    static void reverseArray(int arr[], int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,7,2,9,1,3,6};
        int n=7;
        printArray(arr,n);
        reverseArrayR(arr,0,n-1);
        printArray(arr,n);
    }
}
