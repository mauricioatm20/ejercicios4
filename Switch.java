package introduccion;

public class Switch {
	public static void main(String[]arg) {
		int mes = 1;
		int cantDias =0;
		
		
		//cantidad de dias = cantidad de dias +28
		
		switch(mes){
		case 1:
			cantDias += 31;
		case 2:
			cantDias += 28;
		case 3:
			cantDias += 30;
		case 4:
			cantDias += 31; 
		case 5:
			cantDias += 30;
		case 6:
			cantDias += 31;
		case 7:
			cantDias += 31;
		case 8:
			cantDias += 30; 
		case 9:
			cantDias += 31; 
		case 10:
			cantDias += 30; 
		case 11:
			cantDias += 31; 
		}
		System.out.println(cantDias);
	}
}
