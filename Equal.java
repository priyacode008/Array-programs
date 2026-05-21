import java.util.*;
class Equal{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int i,j,c=0,n;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("enter the array value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the b value");
        for(i=0;i<n;i++){
          b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
            if(a[i]==b[j]){
                c++;
            }
            }
        }
      if(c==n){
        System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}