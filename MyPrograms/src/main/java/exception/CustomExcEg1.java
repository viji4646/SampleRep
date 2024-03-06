package exception;

public class CustomExcEg1 {
public void licence(int age) throws LicenseException  {
		if(age<18) {
			throw new LicenseException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenseException {
		CustomExcEg1 a=new CustomExcEg1();
		a.licence(10);

	}

}
