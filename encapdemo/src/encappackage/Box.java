package encappackage;

public class Box  {

	double width;
	double height;
	double depth;
	
		Box() {
			width=5;
			height=10;
			depth=3;
		}
		
		double volume(){
			return width*height*depth;
			}
		
		
		
		public static void main(String[] args) {		
//			 TODO Auto-generated method stub
			
		Box m1=new Box();
	m1.volume();
	m1.width=5;
	m1.depth=10;
	m1.height=3;
		
		System.out.println(m1.volume());
		System.out.println(m1.width);
		
		
}	
}	
		
		
		
		
		
		
		
		
		


		
	


