abstract class A{
	public abstract void f1( ) ;
}

class B extends A{
	public void f1()throws RuntimeException {
		try {
            System.out.println("B.f1");
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}

/*class C extends A{
	@Override
	public void f1() {
		System.out.println("C.f1");
	}
}*/

class Program {
	public static void main(String[] args) {
		A b = new B();
		try {
			b.f1();
		}catch(RuntimeException e) {
			Throwable cause=e.getCause();
			System.out.println(cause);
		}
	}
}
