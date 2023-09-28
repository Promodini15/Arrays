public class Solution {
static int findsecondlargest(int n,int []a){
    int largest=a[0];
        int secondlargest =0;
      for(int i=1;i<n;i++){
          if(a[i]>largest){
               secondlargest=largest;
              largest=a[i];
             
          }
          else if(a[i]<largest && a[i]>secondlargest){
              secondlargest=a[i];
          }
      }
      return secondlargest;
}
static int findsecondsmallest(int n,int []a){
    int smallest=a[0];
    int ssmal=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(a[i]<smallest){
            ssmal=smallest;
            smallest=a[i];
        }
        else if(a[i]!= smallest && a[i]<ssmal){
            ssmal=a[i];
        }
    }
    return ssmal;
}



    public static int[] getSecondOrderElements(int n, int []a) {
        int slargest= findsecondlargest(n,a);
        int ssmallest=findsecondsmallest(n, a);
      return new int[] {slargest,ssmallest};
    }
}
