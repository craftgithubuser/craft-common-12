package encappackage;

public class ConstractorExample {

	double depth;
	double height;
	double width;
	 
	ConstractorExample() {
		         depth =20;
				 height=10;
		         width=22;
	}
	double volume() {
	return width*height*depth;
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
ConstractorExample m2 =new ConstractorExample();
	m2.depth=66;
	m2.height=22;
	m2.width=12;
	System.out.println(m2.depth);
	
}
}