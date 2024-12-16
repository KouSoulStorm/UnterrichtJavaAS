package grundlagen.Rechner;

public class RechnerProgramme {

	public static void main(String[] args) {
		int zahl1 = 10;
		int zahl2 = 20;
		
		int Ergebnis = zahl1 + zahl2;
	System.out.println(" Addition von " + zahl1 + " und " + zahl2 + " ist " + Ergebnis);
	
		
		
		int ergebnis = zahl2 - zahl1; 
	
		System.out.println(" Subtraktion von " + zahl1 + " und " + zahl2 + " ist " +  ergebnis);
	
		
		int rgebnis = zahl2 * zahl1; 
		System.out.println(" Multi von " + zahl1 + " und " + zahl2 + " ist " + rgebnis);
		
	
		

	}
	public static void AddierenUndAusgeben (int zahl1, int zahl2) {
int ergebnis = zahl1 + zahl2;
System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
	}	
	
	public static void SubtraktionAusgabe (int zahl1, int zahl2) {
	int ergebnis = zahl2 - zahl1; 
	System.out.println(" Subtraktion von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
	}
	
	public static void MultiAusgabe (int zahl1, int zahl2) {
		int ergebnis = zahl2 * zahl1; 
		System.out.println(" Multi von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
		
	