import java.util.*;

class ArrayOperations{
    private int n;

    Scanner scanner=new Scanner(System.in);
    public ArrayOperations(int n){
        this.n=n;
    }

    public void acceptArray(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print("Enter array elements: ");
            arr[i]=scanner.nextInt();
        }
    }

    public void printArray(int arr[]){
        System.out.println("Your array: "+Arrays.toString(arr));
    }

    public void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public int sumOfArray(int arr[], int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public void avgOfArray(int arr[], int n){
        int sum=sumOfArray(arr, n);
        double avg=sum/(n);

        System.out.println("Average of array elements: "+avg);
    }

    public int maxElement(int arr[], int n){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }

        return max;
    }

    public int minElement(int arr[], int n){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
                min=arr[i];
        }

        return min;
    }

    public void sortArray(int arr[], int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                    swap(arr, i, j);
            }
        }

        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        ArrayOperations obj = new ArrayOperations(n);
        obj.acceptArray(arr, n);
        obj.printArray(arr);
        System.out.println("Sum of array elements is: "+obj.sumOfArray(arr, n));
        obj.avgOfArray(arr, n);
        System.out.println("Maximum element of array is: "+obj.maxElement(arr, n));
        System.out.println("Minimum element of array is: "+obj.minElement(arr, n));
        obj.sortArray(arr, n);
    }

}

