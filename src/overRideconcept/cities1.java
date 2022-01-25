package overRideconcept;

public class cities1 extends Cities {
		@Override
		public void add() {
			System.out.println(a/b);
		}
		@Override
		public void substract() {
			System.out.println(a*b);
				
		}
		public static void main(String[] args) {
			cities1 c1=new cities1();
			
			Cities c=new Cities();
			c1.add();
			c1.substract();
			c.add();
			c.substract();
		}
		
		
		
}
