package GitTest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class GitTest1 {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		Calendar hoje = Calendar.getInstance();
		int mes = hoje.get(Calendar.MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int min = hoje.get(Calendar.MINUTE);
		mes++;
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		Date data = new Date();
		System.out.println("Hoje é" + df4.format(data) + " & " + hora + "H " + min + "min");

	}

}
