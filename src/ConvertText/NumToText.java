package ConvertText;

public class NumToText {
	private static final String[] UNITSDIGIT = {"", "Bir", "Ýki", "Üç", "Dört", "Beþ", "Altý", "Yedi", "Sekiz", "Dokuz"};
	private static final String[] TENSDIGIT = {"", "On", "Yirmi", "Otuz", "Kýrk", "Elli", "Altmýþ", "Yetmiþ", "Seksen", "Doksan"};
	
	public static String  ConvertNumToText(String input) {
		StringBuilder output = new StringBuilder();
		long number = Long.valueOf(input);
        int hundreds = (int)((number % 1000));
        int thousands = (int)((number / 1000) % 1000);
        int millions = (int)((number / 1000000) % 1000);
        int billions = (int)((number / 1000000000) % 1000);
        
        if (number == 0) {
            output.append("Sýfýr");
            return output.toString();
        }
 
        if (billions > 0) {
        	output.append(numControl(billions).toString() + "Milyar");
        }
        if (millions > 0) {
        	output.append(numControl(millions).toString() + "Milyon");
        }
 
        if (thousands > 0) {
        	output.append(numControl(thousands).toString() + "Bin");
        }
        if (hundreds > 0) {
        	output.append(numControl(hundreds).toString());
        }
        
        if (hundreds == 1) {
        	output.append(numControl(hundreds).toString() + "Bir");
        }
 
        return output.toString();
        
	}
	
    private static StringBuilder numControl(int num) {
        StringBuilder output = new StringBuilder();
        int hundreds = num / 100;
        int tens  = (num % 100) / 10;
        int units = (num % 10);
 
        switch (hundreds) {
            case 0: break;
            case 1: output.append("Yüz");break;
            default: output.append(UNITSDIGIT[hundreds]+"Yüz");
        }
        
 
        switch (tens) {
            case 0: break;
            default:
                if (units == 0) {
                	output.append(TENSDIGIT[tens]); return output;
                	}
                else {
                	output.append(TENSDIGIT[tens]); break;
                }
        }
        
        switch (units) {
            case 0: break;
            case 1: break;
            default: output.append(UNITSDIGIT[units]);
        }
 
        return output;
    }
	
}
