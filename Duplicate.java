 
public class Duplicate{
    public static void main(String args []){
      
        int i,j,n[]={1,2,3,3,4,5};
       
        System.out.println("duplicate number=");
        for(i=0;i<n.length;i++){
            for(j=i+1;j<n.length;j++){
                if(n[i]==n[j])
                    System.out.println(n[i]);
            }
        }
    }
}