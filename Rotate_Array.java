
https://leetcode.com/problems/rotate-array/submissions/

//TC:O(N)
//SC:O(1)



class Solution {
    
    
    
    public void rotate(int[] arr, int k) {
        
		// TODO Auto-generated method stub
		int n = arr.length;
		k = k % n;
		// last element
		Range_reverse(arr, n - k, n - 1);
		// 1st n-k element
		Range_reverse(arr, 0, n - k - 1);

		// 0 to n-1 element
		Range_reverse(arr, 0, n - 1);

	}

	public static void Range_reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}
    
}
