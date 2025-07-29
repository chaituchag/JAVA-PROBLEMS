// find sub array use sliding window

//  import java.util.Scanner;
//  public class q1{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int arr[]=new int [num];
//         for(int i=0;i<num;i++){
//              arr[i]=sc.nextInt();
//         }
//         int target=sc.nextInt();
//         int start=0;
//         int sum=0;
//         for(int i=0;i<num;i++){
//             sum+=arr[i];
//             while(sum>target && start<=i){
//                 sum-=arr[start];
//                 start++;
//             }
//             if(sum==target){

//                 System.out.println(start+" "+i);
//                 return;
//             }
//         }
//         System.out.println("no sub");

//     }
//  }


// maximum sum of k consequtive elements
import java.util.Scanner;
public class q2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        if(k>num){
            System.out.println("k greter than array size");
        return;

        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        for(int i=k;i<num;i++){
            sum-=arr[i-k]+arr[i];
        
            if(sum>maxsum){
               maxsum=sum;
            }
        }
        System.out.println(k+" "+maxsum);
    }
    
}
