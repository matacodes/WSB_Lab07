
public class Zadanie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			for (int i = 0; true; i++) {
				System.out.println("args[" + i + "] is '" + args[i] + "'");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.err.println("Quiting...");
		}
	}
}
