// import java.util.Arrays;
class MinMax{
    static class Pair{
        int max;
        int min;
    }
    static Pair getminmax(int arr[], int n){
        Pair minmax= new Pair();
        int i;
        if(n%2==0){
            if(arr[0]>arr[1]){
                minmax.min=arr[1];
                minmax.max=arr[0];
            }
            else{
                minmax.min=arr[0];
                minmax.max=arr[1];
            }
            i=2;
        }
        else{
            minmax.min=arr[0];
            minmax.max=arr[0];
            i=1;
        }

        while(i<n-1){
            if(arr[i]>arr[i+1]){
                if(arr[i]>minmax.max)
                    minmax.max=arr[i];
                if(arr[i+1]<minmax.min)
                    minmax.min=arr[i+1];
            }
            else{
                if(arr[i+1]>minmax.max)
                    minmax.max=arr[i+1];
                if(arr[i]<minmax.min)
                    minmax.min=arr[i];
            }
            i+=2;
        }
        return minmax;

    }
    // static Pair getminmax(int arr[], int low, int high){
    //     Pair minmax= new Pair();
    //     Pair mml= new Pair();
    //     Pair mmr= new Pair();
    //     int mid;
    //     if(low==high){
    //         minmax.max=arr[low];
    //         minmax.min=arr[high];
    //         return minmax;
    //     }
    //     if (low+1==high){
    //         if(arr[low]>arr[high]){
    //             minmax.max=arr[low];
    //             minmax.min=arr[high];
    //         }
    //         else{
    //             minmax.max=arr[low];
    //             minmax.min=arr[high];
    //         }
    //         return minmax;
    //     }
    //     mid=(low+high)/2;
    //     mml=getminmax(arr, 0, mid);
    //     mmr=getminmax(arr, mid+1, high);
    //     if(mml.min>mmr.min)
    //         minmax.min=mmr.min;
    //     else
    //         minmax.min=mml.min;
    //     if(mml.max>mmr.max)
    //         minmax.max=mml.max;
    //     else
    //         minmax.max=mmr.max;
    //     return minmax;
    // }
    public static void main(String[] args) {
        int arr[]={5,7,2,9,1,3,6};
        int n=7;
        // for(int i :arr){
        //     n++;
        // }
        // sorting method
        // Arrays.sort(arr);
        // int min=arr[0],max=arr[n-1];

        // linear search
        // int min=arr[0],max=arr[0];
        // for(int i=1;i<n;i++){
        //     if(arr[i]<min)
        //         min=arr[i];
        //     else if(arr[i]>max)
        //         max=arr[i];
        //     else{}
        // }

            // Tournament method
        // Pair minmax=getminmax(arr, 0, n-1);

        //comparing in pair method
        Pair minmax=getminmax(arr, n);


        System.out.println("Minimum: "+minmax.min+"\nMaximum: "+minmax.max);
    }
}