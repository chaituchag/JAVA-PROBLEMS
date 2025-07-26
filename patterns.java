// public class patterns {
//     public static void main(String[]args){
//         int n=5;
//         int m=5/2+1;
//         for (int i=1;i<=n;i++){                  \\\\\\2pat
//             for(int j=1;j<=n;j++){
//                 // System.out.println("*");
//                if(i==1||i==n||i==m||(j==n&i<=m)||(j==1&i>=m)){
//                 System.out.print("* ");

//                }
//                else{
//                 System.out.print("  ");
//                }
//             }

            
//             System.out.println();
//         }
//     }
    
// }

// public class patterns {
//     public static void main(String[]args){
//         int n=5;
//         int m=n/2+1;                           ///1 pat
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==n||j==m||(i==2&j==2)){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }

//             }
//             System.err.println( );

//         }
    
// }
// }

import java.util.Scanner;

public class patterns {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int roada=sc.nextInt();
        int roadb=sc.nextInt();
        int roadc=sc.nextInt();
        if(roada>roadb){
            System.out.println("Car1 goes into road B");
        }
        else if(roadb>roadc){
            System.out.println("Car1 goes into road C");
        }
        else if(roadc>roada){
            System.out.println("Car1 goes into road A");

        }
        else{
            System.out.println("No path exists");
        }

    }
}
        //    System.err.println("welcome to mec atm:");
//            int pin_num=1234;
//            float amount=5000f;
//            for (int atempt=3;atempt>0;){
//                int pin=sc.nextInt();
               
//                if(pin==pin_num){
//                    System.out.println("welcome user");
//                    System.out.println("1.credit\n2.debit\n3.check_balece\n4.change_pin");
//                    System.out.println("enter the choice:");
//                    int choice=sc.nextInt();
//                     switch (choice) {
//                         case 1:
//                         System.out.println("enter the amount:");
//                         int added=sc.nextInt();
//                         added+=amount;
//                         System.out.printf("amount added:",added);   
                        
//                     }
//                     break;
//                 }
//                 else{
//                     --atempt;
//                     if(atempt>0);
//                      System.out.println("invalid user"+""+atempt+((atempt>1)?"attempts left":"attempt left"));
//                 }
            
//             }
           

        
//     }

//  }
