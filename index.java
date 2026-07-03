public class index{
    public static void main(String args[]){

        int i,n[]={10,20,30,40,50},index=-1,s=50;

        System.out.println("index value:");
        for(i=0;i<n.length;i++){
            if(n[i]==s){
                index=i;
            }
        }
        System.out.print("s="+index);

    }
}