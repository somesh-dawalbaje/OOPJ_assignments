class ArrayDemo{
    public static void main(String[] args) {
        int arr[]=new int[]{5,14,35,89,140};
        
        int k=3;
        if(arr.length<k){
            System.out.println("array length is less.");
        }

        for (int i = 0; i <= arr.length-k; i++) {
            int sum=0;
            for(int j=i; j<i+k; j++){
                sum=sum+arr[j];
            }
            int avg=sum/k;
            System.out.print(avg+" ");
        }
        System.out.println();

    }
}