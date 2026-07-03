
class Remove{
    public static void main(String[] args){
        
        int i,j,n[]={1,2,2,3,4,5};
       
        System.out.println("remove duplicate number=");
        for(i=0;i<n.length;i++){
            for(j=0;j<i;j++){
                if(n[i]==n[j]){
                    break;
                }
            }
                if(j==i){
                    System.out.println(n[i]);
                }
        }

    }
}