
public class Evencount{
    public static void main(String [] args){
       
        int even=0,odd=0,i,n[]={1,2,3,4,5,6};

        for(i=0;i<n.length;i++){
            if(n[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("even count="+even);
        System.out.println("odd count="+odd);
    }
}