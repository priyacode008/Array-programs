import java.util.*;
class Rever{
    public static void main (String args []){
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("revers array=");
        for(i=n-1;i>=0;i--){
           System.out.println(a[i]);
    }
}
}