import java.util.*;
class Remove{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("remove duplicate number=");
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(a[i]==a[j]){
                    break;
                }
            }
                if(j==i){
                    System.out.println(a[i]);
                }
        }

    }
}