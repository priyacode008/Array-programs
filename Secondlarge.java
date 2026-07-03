public class Secondlarge{
    public static void main(String [] args){

        int t,i,j,a[]={10,22,44,55,88};
    
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                t=a[i];
               if( a[i]>a[j]);
                a[i]=t;
            }
        }
        System.out.println("second largest no="+a[1]);
    }
}