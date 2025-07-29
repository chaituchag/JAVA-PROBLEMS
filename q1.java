// sum of even numbers in array

// import java.util.Scanner;
// public class q1 {

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//          int sum=0;
//           for(int i=0;i<n;i++){
//             if(arr[i]%2==0){
//                 sum=sum+arr[i];

//             }
//             System.out.println(sum);
//         }

//     }
// }


// sum of array numbers
// import java.util.Scanner;
// public class q1{
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int arr[]=new int[num];
//         for(int i=0;i<num;i++){
//             arr[i]=sc.nextInt();
//         }
//             int sum=0;
//             for(int i=0;i<=arr.length;i++ ){
//                 sum=sum+i;
//             }System.out.println(sum);
            
//     }
// }

//find max element

// import java.util.Scanner;
// public class q1{
//     public static void main(String[]srags){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int arr[]=new int[num];
//         for(int i=0;i<num;i++){
//             arr[i]=sc.nextInt();

//         }
//         int max=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }System.out.println(max);
//     }
// }
// import java.util.Scanner;
// public class q1{
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         for(int i=2;i<=num;i++){
//             int count=0;
//             for(int j=1;j<=i;j++){
//                 if(i%j==0){
//                     count=count+1;
//                 }
//             }
//             if(count==2){
//                 int ori=i;
//                 int res=0;
//                 int place=1;
//                 while(ori>0){
//                     int dig=ori%10;
//                     if(dig==5){
//                         dig=0;
//                     }
//                     res+=dig*place;
//                     place*=10;
//                     ori/=10;
//                 }
//                 System.out.println(res+"");

//                }

//         }
                            
                
                
              
            
        
//     }
// }
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
// import java.util.*;
// public  class q1{
//     public static void main(String[] args) {
//         TreeSet<Integer>li=new TreeSet<>(Comparator.reverseOrder());
//         li.add(2);
//         li.add(4);
//         li.add(5);
//         li.add(7);
//         li.add(3);
//         for(int i:li){
//             System.out.println(i+" ");
//         }
//         System.out.println(li);
//         System.out.println(li.remove(4));
//         System.out.println(li.pollFirst());
//         System.out.println(li.pollLast());
//         System.out.println(li);
        
//     }
// }
// import java.util.*;
// public class q1{
//     public static void main(String[]args){
//         PriorityQueue<Integer>koo=new PriorityQueue<>();
//         koo.add(6);
//         koo.add(1);
//         koo.add(2);
//         koo.add(4);
//         System.out.println(koo);

//     }
// }
