package jan_27th;

public class ExceptionEx7 {
	static void validate(int age)throws Myexception
	
	{
		if(age<18)
			throw new Myexception("welcome to vote");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Eception occured:" +m);
		}
		

	}

}
