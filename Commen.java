import java.util.*;
class Commen{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n,m;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the arry value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter tha array size");
        m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("enter the b value");
        for(i=0;i<m;i++){
         b[i]=sc.nextInt();
        }
        System.out.println("commen element=");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
           if(a[i]==b[j])
            System.out.println(a[i]);
            }
        }
    }
}