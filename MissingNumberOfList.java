import java.util.ArrayList;

public class MissingNumberOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		
		int N = al.size();
		
		int result = missingNumber(al, N);
				
		System.out.println("Missing number of Unsorted List is: "+result);

	}
	
	public static int missingNumber(ArrayList<Integer> arrayList, int n) {
		
		int N = n+1;
		
		//sum of elemnents within the range (1, N)
		int totalSumOfList = N * (N+1) / 2;
		
		int sumOfList = 0;
		
		for(int i : arrayList)
			sumOfList += i;
		
		int missingNumber = totalSumOfList - sumOfList;
		
		return missingNumber;
		
	}

}
