
public class MainClass {
	/**
	 * Memeber Variables
	 */
	int i;
	float f;
	
	/**
	 * First Contructor(Default Constructor)
	 */
	public MainClass()
	{
		i = 10;
		f = 10.10f;			
	}
	
	/**
	 * Second Constructor:- takes one value
	 * @param k
	 */
	public MainClass(int k)
	{
		i = k;
	}
	
	/**
	 * Third Constructor :- takes 2 values
	 * @param i
	 * @param f
	 */
	public MainClass(int i, float f)
	{
		this.i = i;
		this.f = f;
	}
	
	
	
	/**
	 * Main method as starting point for the app 
	 * @param args
	 */
	public static void main(String[] args) {
		
		MainClass mc = new MainClass();// object created via default constructor
		System.out.println("i= " + mc.i);
		System.out.println("f= "+ mc.f);
		
		MainClass mc1 = new MainClass(100000);//object created via the second constructor
		System.out.println("i= " + mc1.i);
		
		
		MainClass mc2 = new MainClass(6,6.6f);// object created via the third constructor
		System.out.println("i= "+ mc2.i);
		System.out.println("f= "+ mc2.f);
	}
}


