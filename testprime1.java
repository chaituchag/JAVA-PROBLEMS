import java.util.Scanner;
public class testprime1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                int ori=i;
                int res=0;
                int place=1;
                while(ori>0){
                    int dig=ori%10;
                    if(dig==5){
                        dig=0;
                    }
                    res+=dig*place;
                    place*=10;
                    ori/=10;

                }
                System.out.println(res);
            }
        }

    }
}