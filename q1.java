// sum of even numbers in array

import java.util.Scanner;
public class q1 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         int sum=0;
          for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];

            }
            System.out.println(sum);
        }

    }
}


