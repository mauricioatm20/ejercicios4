package factorial;

public class binario {

	public static String toBinary(int num) {
		if (num <2) 
			return " " + num;
		return toBinary(num/2) + (num%2);
		
		
	}
	
	public static String toHexa(int num) {
		if(num < 16)
			return digitoHexa(num);
		return toHexa(num/16) + digitoHexa(num);
		
	}
		
	public static String digitoHexa(int d) {
		if (d <10)
			return " " + d;
		return " " + (char)('A'+(d-10));
		}

	
	
	public static void main(String[] args) {
		
		for (int i =0; i<50; i++) {
			System.out.print(i + ":\t");
			System.out.print(Integer.toBinaryString(i)+ ":\t");
			
			
			System.out.print(Integer.toHexString(i)+":\t");
			System.out.println(digitoHexa(i));
		}
	}

}
