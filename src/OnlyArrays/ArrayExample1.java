package OnlyArrays;
//Find the minimum value
public class ArrayExample1 
{

static  int a[] = {2,3,4,8,9,4,1,7};

public static void main(String[] args) {
ArrayExample1 mx= new ArrayExample1();
mx.max();
{
	  int  min = a[0];
	  for(int i=1; i<a.length; i++)
	  {
		 if(min>a[i]) 
		 {
			min = a[i]; 
			 
		 }
	  }
	 System.out.println("minimum element is:"+ min); 
}
}

public void max() 
{
        int  max = a[0];
        for(int i =0;i<a.length; i++)
        {
        	if(max<a[i])
        	{
        		max=a[i];
        	}
        	
        System.out.println("maximum number is:" +max);
        }
   }
}

