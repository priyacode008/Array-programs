import java.util.*;
class Secondlarge{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int t,i,j,n;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                t=a[i];
               if( a[i]>a[j]);
                a[i]=t;
            }
        }
        System.out.println("second largest no="+a[1]);
    }
}