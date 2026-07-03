
class Equal{
    public static void main(String arg[]){
    
        int i,j,c=0;
         int a[]={3,4,5,6,7};
         int b[]={4,3,6,5,7};
       
        for(i=0;i<a.length;i++){
            for(j=0;j<b.length;j++){
            if(a[i]==b[j]){
                c++;
            }
            }
        }
      if(c==a.length){
        System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}