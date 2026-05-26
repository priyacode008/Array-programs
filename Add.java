import java.util.*;
class Add{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n,v=0;
        System.out.println("enter the value");
        n=sc.nextInt();
        System.out.println("the matrix format:");
        for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
                v++;
                System.out.print(v);
            }
            System.out.println(" ");
        }
    }
}