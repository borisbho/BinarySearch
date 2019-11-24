package binarySearch;

public class Driver {

	public static void main(String[] args) {
		
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearchR(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
		
		
        BinarySearch obi = new BinarySearch(); 
        int arr1[] = { 2, 3, 4, 10, 40 }; 
   
        int x1 = 10; 
        int result1 = obi.binarySearchI(arr1, x1); 
        if (result1 == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result1); 
    } 
	

}
