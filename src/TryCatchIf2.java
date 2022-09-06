
public class TryCatchIf2 {
	

	public static void main(String[] args) {
		try {
		int	age = 12/2;
		System.out.println(age);
		}
		catch(Exception e) {
		System.out.println(e);// no Exception hence it gets skipped
		}
		finally {
			System.out.println("finished");
		}

	}

}
