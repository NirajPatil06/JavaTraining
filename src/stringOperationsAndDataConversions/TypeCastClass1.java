package stringOperationsAndDataConversions;

public class TypeCastClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int [] arr = {1,4,9};
		    for(int i=0;i<arr.length-1;i++){
		        for(int j=arr[i]+1;j<arr[i+1];j++){
		            System.out.println("Missing number is : "+ j);
		        }
		    }
	}

}
