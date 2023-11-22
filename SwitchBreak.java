package introduccion;

public class SwitchBreak {

	public static void main(String [] arg) {
	
		int mes =4;
		
		String nombreMes = null;
		switch(mes) {
		case 1:
			nombreMes ="enero";
			break;
		case 2:
			nombreMes ="febreo";
			break;
		case 3:
			nombreMes ="marzo";
			break;
		case 4:
			nombreMes ="abril";
			break;
		case 5:
			nombreMes ="mayo";
			break;
		case 6:
			nombreMes ="junio";
			break;
		case 7:
			nombreMes ="julio";
			break;
		case 8:
			nombreMes ="agosto";
			break;
		}
		
		System.out.println(nombreMes);
		
	}
}
