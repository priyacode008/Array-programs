import java.util.*;
class Find{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,s;
    System.out.println("enter the array size");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array value");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("searching value");
    s=sc.nextInt();
    for(i=0;i<n;i++){
        if(a[i]==s){
            c++;
            break;
    }
}
    if(c==1)
        System.out.println("found");
    else
        System.out.println("n0t found");
    
    }
}