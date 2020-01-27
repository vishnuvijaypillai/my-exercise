package jan_27th;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arthimetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException exception thrown:"+e);
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs"+e);
		}
		

	}

}
