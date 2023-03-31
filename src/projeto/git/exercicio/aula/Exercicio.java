package projeto.git.exercicio.aula;

import java.text.DateFormat;
import java.util.Date;

public class Exercicio {

	public static void main(String[] args) {

		DateFormat formatoFull = DateFormat.getDateInstance(DateFormat.FULL);

		Date data = new Date();

		int horas = data.getHours();
		int minutos = data.getMinutes();

		System.out.println("Hoje é " + formatoFull.format(data).replaceAll(",", "") + " e agora são " + horas
				+ " horas e " + minutos + " minutos.");

	}

}
