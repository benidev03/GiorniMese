import java.util.Scanner;

public class GiorniMese {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Inserire il nome del mese:");
		String mese = sc.nextLine();
		
		if(mese.equalsIgnoreCase("Gennaio") ||
				mese.equalsIgnoreCase("Marzo") || 
				mese.equalsIgnoreCase("Maggio") || 
				mese.equalsIgnoreCase("Luglio") || 
				mese.equalsIgnoreCase("Agosto") || 
				mese.equalsIgnoreCase("Ottobre") || 
				mese.equalsIgnoreCase("Dicembre")) {
			
			System.out.println("Hai inserito un mese a 31 gironi");
			
		}else if(mese.equalsIgnoreCase("Settembre") || 
				mese.equalsIgnoreCase("Aprile") || 
				mese.equalsIgnoreCase("Novembre") || 
				mese.equalsIgnoreCase("Giugno")) {
			
			System.out.println("Hai inserito un mese a 30 gironi");
			
		}else if(mese.equalsIgnoreCase("Febbraio")){
			
			System.out.println("Hai inserito un mese a 28 gironi");
			
		}else {
			
			System.out.println("il Mese inserito è inesistente");
		}
			
		
		sc.close();
		
	}
}
