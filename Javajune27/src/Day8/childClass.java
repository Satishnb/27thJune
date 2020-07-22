package Day8;

public class childClass extends abstractclass {
	public void method1() {
		int a=5;
		int b=7;
		int sum = a+b;
		System.out.println("Result of abstarct method is: "+ sum);
		
	}
	public static void main(String[] args) {
		childClass m1= new childClass();
		m1.method1();
		
	}

}
