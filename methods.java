// import java.util.*;
// public class methods {
//     public static void main(String[]args){
//         // ArrayList<Integer>al=new ArrayList<Integer>();
//         // al.add(5);
//         // al.add(6);
//         // al.add(7);
//         // al.add(8);
//         // al.add(9);
//         // al.indexOf(3);
//         // // System.out.println(al);
//         // System.out.println(al.get(4));
//         // Iterator i=al.iterator();
//         // while(i.hasNext()){

//         //     System.out.println(i.next());
//         // }
//         Stack<Integer> s=new Stack();
//         s.push(56);
//         s.push(5);
//         s.push(6);
//         s.push(456);
//         System.out.println(s.pop());
//         System.out.println(s);
//     }
   
// }

// import java.util.*;
// public class methods {

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         // int num=sc.nextInt();
//          LinkedList<Integer>lis=new LinkedList<Integer>();
//          while(true){
//             int a=sc.nextInt();
//             if(a==-1)
//              break;
//              lis.add(a);
//          }
//          int n=sc.nextInt();
//         //  lis.add(2);
//         //  lis.add(3);
//         //  lis.add(6);
//         //  lis.add(7);
//         //  lis.add(5);
//         //  lis.add(5);
//          System.out.println(lis.contains(n));
//         }

// }

import java.util.*;
public class methods{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer>lis=new LinkedList<>();
        
            int num=sc.nextInt();
            for(int i=1;i<num;i++){
                int n=sc.nextInt();

                
                if(n%2==0){
                    lis.remove(n);
                    lis.add(n);
                    System.out.println(lis);
            }

            }
            // if(num%2==0){
            //     lis.remove(num);
            //     System.out.println(num);
            // }
            // else{
            // }
        

    }
}