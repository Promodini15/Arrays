public class Main
{
    static boolean checksort(int a[]){
        for(int i=1;i<5;i++){
		    if(a[i]>=a[i-1]){
		        
		    }
		   else{
		       return false;
		   }
    }
     return true;
    }
	public static void main(String[] args) {
		int a[]={1,2,3,3,4};
		if(checksort(a)){
		    System.out.print("sorted");
		}
		else{
		    System.out.print("not sorted");
		}
		
		
		}
	}

