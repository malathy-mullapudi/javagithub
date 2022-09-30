package OnlyArrays;


public class TestAnonymousArray {
	
	static void printArray(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		printArray(new int [] {1,22,43,21});
	}

}
