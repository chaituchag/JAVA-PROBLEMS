// import java.util.Scanner;
// public class calc {
//      public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      int a=sc.nextInt();
//      int count=1;
//      for (int i=1;i<a;i++){
//           if(a%i==0){
//                count=count+i;
//           }
//      }
//     if(count==2){
//           System.out.println("prime");
//      }
//      else {
//           System.out.println("not prime");
//      }
// }
// }

// prime number program

// import java.util.Scanner;
// public class prime {
// public static void prime(int a){
//     int count=0;
//         for(int i=1;i<=a;i++){
//             if(a%i==0){
//                 count=count+1;
//             }
//         }
//         if(count==2){
//             System.out.println("prime num");
//         }
//         else{
//             System.out.println("not prime");
//         }    
        
    

// }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.err.println("enter the number :");
//         int a=sc.nextInt();
//         prime(a);
//         sc.close();

//     }   
// }

//  fibinocci series program
// import java.util.Scanner;
// public class prime{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the choice");
//         int a=sc.nextInt();
//         int b=0,c=1;
//         System.out.print(+b+" "+c);
//         for (int i=2;i<a;i++){
//             int d=b+c;
//             b=c;
//             c=d;
//             System.out.print(" "+d);


//         }
//     }
// }
// import java.util.Scanner;
// public class prime{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String w=sc.nextLine();
//         char ram[]=w.toCharArray();
//         for(int i=0;i<ram.length/2;i++){
//             char temp=ram[i];
//             ram[i]=ram[ram.length-1-i];
//             ram[ram.length-1-i]=temp;


//         }
//         String rev=new String(ram);
//         System.out.println(""+rev);
//     }  
// }

// reverse digit program

// import java.util.Scanner;
// public class prime{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int s=sc.nextInt();
//         int rev=0;
//         while(s!=0){
//             int ev=s%10;
//             rev=rev*10+ev;
//             s=s/10;
//             // rev=s/10;
//         }

        
    
//         System.out.println(""+rev);
//     }
// }



// polindrome program

// import java.util.Scanner;
// public class prime{
//     public static void main(String[]srags){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int original=num;
//         int rev=0;
//         while(num!=0){
//            int ev=num%10;
//             rev=rev*10+ev;
//             num=num/10;
//         }
//         System.err.println(""+rev);
//         if(original==rev){
//             System.out.println("poli");
//         }
//         else{
//             System.out.println("not poli");
//         }
        
//     }
// }

//polindreome String

// import java .util.Scanner;
// public class prime{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//             String s=sc.nextLine();
//             
//             String rev="";
//             for(int i=s.length()-1;i>=0;i--){
//                 rev=rev+s.charAt(i);
//             }
//             System.out.println(""+rev);
//             if(s.equals(rev)){
//                 System.out.println("poli");
//             }
//             else{
//                 System.out.println("not poli");
//             }
        
//     }
    
// }

// Arm strong number program
// import java.util.Scanner;
// public class prime {
//     public static void arm(int a){
//         int original=a;
//         int count=0;
//         while(a!=0){
//            int nt=a%10;
//             count=count+nt*nt*nt;
//             a=a/10;
//         }
//         if(count==original){
//             System.out.println("arm");
//         }
//         else{
//             System.out.println("not arm");
//         }

//     }

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int a=sc.nextInt();
//         arm(a);



//     }
// }

// import java.util.Scanner;
// public class prime{
//     public static void arm(int a){
//         int original=a;
//         int count=0;
//         while(a!=0){
//             int cut=a%10;
//             count=count+cut*cut*cut;
//             a=a/10;


//         }
//         if(count==original){
//             System.out.println("arm strong num");
//         }
//         else{
//             System.out.println("not arm strong num");
//         }

    
// }    
//     public static void main (String[]args){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number");
//     int a=sc.nextInt();
//     arm(a);
// }
// }

//  owel program

// import java.util.Scanner;
// public class prime{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String a=sc.nextLine();
//         int count=0;
//         for (int i=0;i<a.length();i++){
//             char c=a.charAt(i);
//             if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
//                 count+=1;

//                 System.out.println(""+c);
//             }

//         }
//         System.out.println(""+count);
//        }
// }

// find largest number in array
import java.util.Scanner;
public class prime{}
