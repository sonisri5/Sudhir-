package Classwork;

public class house {
	 double room ;
	 int ward ;
	 int bed ;
	 String room_owner ;
	 static int blinds ;
	 
	 
	 public static void dis_2() {
	 System.out.println("blinds = " +blinds);	 
		 
	 }
	 
	 public int sum(int a , int b, int d) {
			int c = a + b + d;
			System.out.println("I am child ");
			return c;
		
		}
	public  void room_setup(double a, int b, String st ) {
		room = a ;
		ward = b ;
		room_owner = st ;
		
	}
	public int sum(int a , int b) {
		int c = a + b;
		System.out.println("I am parent ");
		return c;
		
	}
    public void dis() {
    	System.out.println("room = " +room);
    	System.out.println("ward = " +ward);
    	System.out.println("room_owner = " +room_owner);
    	
    	
    }
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		int ret ; 
		house h1 = new house();
		house h2 = new house();
		h1.blinds = 4 ;
		h1.dis_2(); 
		h2.dis_2();
		System.out.println("--------------------------------- ");
		h2.blinds = 6 ;
		h2.dis_2();
		h1.dis_2();
		
		
		h1.room_setup(2,4,"soni");
		  h1.dis();
		  
		  
		  System.out.println("--------------------------------- ");
		  h2.room_setup(2,4,"Sudhir");
		  h2.dis();
		  System.out.println("--------------------------------- ");
		  h1.room_setup(3,5,"Sanya");
		  h1.dis();
		  h1.room_setup(5.43,6,"Shristi");
		  h1.dis();
		  ret = h1.sum(6,16) ;
		  System.out.println("ret = " +ret);
		  ret = h1.sum(5,36) ;
		  System.out.println("2 ret = " +ret);
		  
	  		
	}
public void room_setup_2() {
	room = 4 ;
	ward = 5 ;
	room_owner = "soni" ;
	
 }
}