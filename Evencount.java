import java.util.*;
class Evencount{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i,n,even=0,odd=0;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("even count="+even);
        System.out.println("odd count="+odd);
    }
}