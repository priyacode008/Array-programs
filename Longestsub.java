public class Longestsub{
    public static void main(String args[]){
       int a[]={10,22,33,25,32,54,64,1};
       
       int count=1,max=1,start=0,maxstart=0,i,j;

       for(i=0;i<a.length-1;i++){

            if(a[i]<a[i+1]){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    start=maxstart;
                }
            
            start=i+1;
            count=1;
            }
       }
            if(count>max){
                max=count;
                start=maxstart;
            }
            for(i=maxstart;i<max+maxstart;i++){
                System.out.print(a[i]+" ");
            }
       }
}