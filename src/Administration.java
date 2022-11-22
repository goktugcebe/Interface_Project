public class Administration {

       double profit(double[] a){

           double sum=0;
           for(int i=0;i<a.length;i++){
               sum+=a[i];
           }
           return sum;
       }
}