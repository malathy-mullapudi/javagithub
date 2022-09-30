package Basics;

public class TypeCasting {
	
   static int a = 3;
   int c= 4;
    
	public static void main(String[] args) {
		double d =50.00;
		TypeCasting tc = new TypeCasting();
		System.out.println(a);
		System.out.println(tc.c);
		System.out.println(d);
		long i = tc.c;
		System.out.println("TypeCasting i= "+i);
	long v= (long)d;
	System.out.println(v);
	int z = (int)d;
		System.out.println(z);

    
	}

}
