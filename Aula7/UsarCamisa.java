package Aula7;

public class UsarCamisa {

	public static void main(String[] args) {
		Camisa insider = new Camisa();
		
		System.out.println(insider.getClass()  + " ");
		System.out.println(insider.getClass().getSimpleName());
		System.out.println(insider.hashCode()
				);
	}

}
