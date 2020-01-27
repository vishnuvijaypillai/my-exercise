package jan_27th;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[] = new int[2];
			System.out.println("acces element three: "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception thrown:"+e);
		}
		System.out.println("out of block");

	}

}
