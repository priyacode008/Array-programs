public class moveszero{
    public static void main(String args []){
        int a[]={1,0,2,0,3,0,4,0,5};
        int t,left=0;

        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                t=a[left];
                a[left]=a[i];
                a[i]=t;
                left++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}