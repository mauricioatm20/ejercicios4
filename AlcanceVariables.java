package introduccion;

public class AlcanceVariables {
	
	static int clase =0;
	public static void main(String[] args) {
		int metodo = 0;
		System.out.println(clase);
		System.out.println(metodo);
	
		{
			int cuerpo = 0;
			System.out.println(clase);
			System.out.println(metodo);
			System.out.println(cuerpo);
		}
		
	}
}
