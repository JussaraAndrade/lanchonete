package utils;

import java.util.concurrent.TimeUnit;

public class Utils {
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		}catch(InterruptedException e) {
			System.out.println("Erro ao pausar por " + segundos + " segundos.");
		}
	}
}
