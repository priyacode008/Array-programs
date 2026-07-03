
public  class Secondsmall{
    public static void main(String[] args){
      
        int t,i,a[]={55,12,10,33,28},j;
        
        
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                t=a[i];
                if(a[i]<a[i])
                    a[i]=t;
            }
        }
        System.out.println("second small no="+a[1]);
    }
} 