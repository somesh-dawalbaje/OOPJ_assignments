import java.util.*;

class Demo{
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.equals(arr1, arr2));

        int k=9;

        int count=0;
        for (int j = 0; j < arr2.length; j++) {
            int sum=0;
          for (int i = j+1; i < arr2.length; i++) {
                sum=sum+arr2[j]+arr2[i];
                if(sum==k)
                    count++;
          }  
        
        }
        System.out.println(count);

        int i=0;
        int j=arr2.length-1;
        while (i<=j/2) {
            int temp=arr2[i];
            arr2[i]=arr2[j];
            arr2[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr2));  
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int l = 0; l < arr2.length; l++) {
            if(arr2[l]<min)
                min=arr2[l];
            if(arr2[l]>max)
                max=arr2[l];
        }
        System.out.println(min);
        System.out.println(max);

        int max2=0;
        for (int l = 0; l < arr2.length; l++) {
            if(arr2[l]>max2 && arr2[l]<max)
                max2=arr2[l];
        }
        System.out.println(max2);
        int max3=0;
        for (int l = 0; l < arr2.length; l++) {
            if(arr2[l]>max3 && arr2[l]<max2)
                max3=arr2[l];
        }
        System.out.println(max3);

        int[] arr3=new int[arr1.length+arr2.length];
        /*int l=0, m=0, n=0;
        
        while(l<arr1.length && m<arr2.length){
            arr3[n++]=arr1[l++];
            arr3[n++]=arr2[m++];
        }

        while (l<arr1.length) {
            arr3[n++]=arr1[l++];
        }

        while (m<arr2.length) {
            arr3[n++]=arr2[m++];
        }

        System.out.println(Arrays.toString(arr3)); */

        int p=0;
        int d=0,c=0;
        for(; d<arr1.length && c<arr2.length; d++,c++){
            arr3[p++]=arr1[d];
            arr3[p++]=arr2[c];
        }

        for (; d < arr1.length; d++) {
            arr3[p++]=arr1[d];
        }
            
        for (; c < arr2.length; c++) {
            arr3[p++]=arr2[c];
        }
        System.out.println(Arrays.toString(arr3));

        //for questions 1 to 7 assignment 7
        
    }
}