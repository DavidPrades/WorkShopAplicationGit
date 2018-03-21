
public class Principal {

	public static void main(String[] args) {
		showWelcome();
		
		doOperationAdd();
	}

	/**
	 * @return TODO
	 * 
	 */
	private static int doOperationAdd() {
		int a=1;
		int b=2;
		return a+b;
		//System.out.println("El resultado de la suma es "+result);
	}

	/**
	 * 
	 */
	private static void showWelcome() {
		System.out.println("*************************************");
		System.out.println("Bienvenido al supermercado El caminas");
		System.out.println("*************************************");
	}

}
