import java.util.*;
class Secondsmall{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,i,n,j;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the Array value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                t=a[i];
                if(a[i]<a[i])
                    a[i]=t;
            }
        }
        System.out.println("second small no="+a[1]);
    }
} 