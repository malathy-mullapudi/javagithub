package OnlyArrays;

public class CopyArray {

	public static void main(String[] args) {
	
	int arr1[] = new int[] {22,23,31,28};
	int arr2[] = new int[arr1.length];
	System.out.println("Elements from array1:");
	for(int i = 0;i<arr1.length; i++) {
		System.out.print( arr1[i]+" ");
		
		arr2[i]=arr1[i];
	}
	System.out.println();
	
	System.out.println("Elements from array2:");
	for(int i=0; i<arr2.length; i++) {
		System.out.print(arr2[i]+" ");
	}

	}

}
