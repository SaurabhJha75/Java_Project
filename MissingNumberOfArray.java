
public class MissingNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,4,6,8,9,10,7,3};
		int n = arr.length;
		int result = missingNumber(arr, n);
		
		System.out.println("Missing number of given array is: "+result);

	}
	
	public static int missingNumber(int arr[], int n) {
		
		int N = n + 1;
		
		int totalSumOfArray = N * (N+1) / 2;
		
		int arraySum = 0;
		
		for(int i=0;i<n;i++) {
			arraySum += arr[i];
		}
		
		int missingNumber = totalSumOfArray - arraySum;
		
		return missingNumber;
	}

}
