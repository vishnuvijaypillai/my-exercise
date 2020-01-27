import java.io.FileInputStream;

class fileMgmt
{
	void fileRead() throws IOException
	{
		FileInputStream fis =null;
		fis=new FileInputStream("B:/mydile.txt");
		int k;
		while((k=fis.read())!= -1)
		{
			System.out.println((char)k);
		}
		fis.close();
}
}
package jan_27th;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
