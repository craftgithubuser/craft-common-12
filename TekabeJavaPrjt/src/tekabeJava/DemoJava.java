package tekabeJava;

public class DemoJava {

	public static void main(String[] args) {
		
	int day=5;
	String dayname;
	switch(day)
	{
	case 1:
		dayname="Sunday";
		break;
	case 2:
		dayname="Monday";
		break;
	case 3:
		dayname="Tusday";
		break;
	case 4:
		dayname="Wedensday";
		break;
	case 5:
		dayname="Thursday";
		break;
	case 6:
		dayname="Friday";
		break;
		default :
		dayname="Saturday";
		break;
	}
		
	System.out.println(dayname);
	
	}
		
		
	/*
	 * int mark=93; String grade; String Remark;
	 * 
	 * if(mark>90) grade ="A"; else if(mark>80) grade="B"; else if(mark>70)
	 * grade="C"; else if(mark>60) grade ="D"; else if(mark<=60) grade = "F"; else
	 * grade="NG"; System.out.println(grade);
	 */
		
	/*
	 * if(mark>90) {grade="A"; Remark="Excellent!";} else if(mark>80) { grade ="B";
	 * Remark="very good!";} else if(mark>70) {grade ="C"; Remark="Good!";} else
	 * if(mark>60) {grade="D"; Remark="Fair!";} else if (mark<=60) {grade="F";
	 * Remark="Poor"; } else { grade="NG"; Remark=""; } System.out.println(grade +
	 * " Remark " + Remark);
	 */
		
			
			
	/*
	 * int num1; String oddoreven; num1=12; if(num1%2==0) oddoreven="Even"; else
	 * oddoreven="Odd"; System.out.println(oddoreven);
	 * 
	 * 
	 * num1=2; String numstatus; if(num1>0) numstatus="Positive"; else if(num1<0)
	 * numstatus="Negative"; else numstatus="Zero"; System.out.println(numstatus);
	 * 
	 * 
	 * String FName="Tekabe"; String LName="Fanta"; String GetFullName=FName + " " +
	 * LName; System.out.println(GetFullName);
	 */
		/*
		 * System.out.println(Add(12,13)); System.out.println(Multiply(12,12));
		 * System.out.println(Subtract(12,12)); Person p =new Person();
		 */
		/*
		 * p.FName ="Solomon"; p.LName = " Mulugeta"; p.Age = 41; p.Gender='M';
		 * p.GetFullName(); System.out.println(p.GetFullName());
		 * 
		 * 
		 * p =new Person(); p.FName ="Tekabe"; p.LName = " Desta"; p.Age = 41;
		 * p.Gender='M'; p.GetFullName(); System.out.println(p.GetFullName());
		 */
	
	
	
	// GreetMe("Natan");
	
 
	
	
	   static void GreetMe() { // if doesn't return any thing it is called void
 System.out.println("Hello Tekabe"); // if we want it to return we pass varible
	   }
	 	
	static void GreetMe (String name) {
		System.out.println(" Hello " + name);
	}
	static int Add(int n1,int n2) 
	{
		GreetMe("Add");
		return n1+n2;
	}
	
	static int Subtract(int n1,int n2) {
		GreetMe("Subtract");
		return n1-n2;
	}
	static int Multiply(int n1,int n2){
		GreetMe("Multiply");
		return n1*n2; }
	
}
