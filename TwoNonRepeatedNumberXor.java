
public class TwoNonRepeatedNumberXor {
	public static void main(String [] args) {
		int arr[]= {1,5,8,6,5,1,6,2};
		int count;
		int result =0;
		for(int i=0; i<arr.length; i++) {
			count =0 ;
			for(int j=0; j<arr.length;j++) {
				if((arr[i]^arr[j])==0 && i!=j) {
					count++;
				}
			}
			if(count==0) {
			System.out.print(arr[i]+" ");
			result++;
			}
		}
		if(result ==0) {
			System.out.println("NO non repeated number are present");
		}
	}

}
