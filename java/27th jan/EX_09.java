package jan_27th;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class EX_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		FileOutputStream fout;
		PrintStream p;
		try {
			fout=new FileOutputStream("D:\\Hobbit\\books.csv");
			p=new PrintStream(fout);
			p.println("101,c,E.Balaguruswamy, BPB, 110");
			p.println("102, C++, Kanikar, Tech mcgraw hill, 200");
			p.println("103, Java made easy, Karthik, Vijaya, 300");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}

	}

	}


