import java.util.*;

class ArrayDemo2{
    public static void main(String[] args) {
        int arr1[]=new int[]{5,14,35,90,139};
        int arr2[]=new int[]{88,67,35,14,-12};
        int arr3[]=new int[]{65,14,129,34,7};

        for(int i=0; i<arr2.length; i++){
            for (int j = i+1; j < arr2.length; j++) {
               if(arr2[j]<arr2[i])
                    swap(arr2,i,j);
                    
            }
        }

        System.out.println("Ascending order arr2: "+Arrays.toString(arr2));

        
        for(int i=0; i<arr1.length; i++){
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[j]>arr1[i])
                    swap(arr1, i, j);
            }
        }

        System.out.println("Descending order arr1: "+Arrays.toString(arr1));

        Random r=new Random();
        for(int i=0; i<arr3.length; i++){
            int randomIndex=r.nextInt(arr3.length);
            swap(arr3, i, randomIndex);
        }

        System.out.println("Random order arr3: "+Arrays.toString(arr3));
    }

    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}