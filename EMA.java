public class EMA {
 
	public static void main(String args[]) {
 
		EMA object = new EMA();
		object.waitMethod();
 
	}
 
	private synchronized void waitMethod() {
 
		while (true) {
			System.out.println("always running program ==> " + Calendar.getInstance().getTime());
			try {
				this.wait(2000);
			} catch (InterruptedException e) {
 
				e.printStackTrace();
			}
		}
 
	}
}
