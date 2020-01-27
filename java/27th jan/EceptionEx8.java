package jan_27th;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class EceptionEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try {
			fout = new FileOutputStream("D:\\myfile.txt");
			p = new PrintStream(fout);
			p.println("hello world line 1");
			p.println("hello world line 2");
			p.println("hello world line 3");
			p.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("error in file");
		}

	}

}
