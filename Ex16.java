class test1

{
	static int x;
	void display()
		{
					x++;
					System.out.println(x);
		}
	
}
public class Ex16 {
public static void main(String[] args) {
	// TODO Auto-generated method stub


	test1 obj1 = new test1();
	obj1.display();
	test1 obj2 = new test1();
	obj2.display();

}
}

