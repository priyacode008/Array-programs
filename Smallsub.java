public class Smallsub{
    public static void main(String args []){
        int a[]={10,22,33,25,32,54,64,1};

            int min=a.length,start=0,minstart=0,count=1,i,j;

            for(i=0;i<a.length-1;i++){
                if(a[i]<a[i+1]){
                    count++;
                }
                else{
                    if(count>1&&count<min){
                            min=count;
                            start=minstart;
                    }
                    start=i+1;
                    count=1;
                }
            }
            if(count>1&&count<min){
                min=count;
                start=minstart;
            }
            for(i=minstart;i<minstart+min;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}