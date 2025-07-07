package br.com.appDispositivos;

import java.util.ArrayList;
import java.util.List;
import br.com.appDispositivos.model.*;

public class Main {

	public static void main(String[] args) {

		List<Dispositivo> dispositivos = new ArrayList<>();

		dispositivos.add(new Dispositivo("Dispositivo qualquer"));
		dispositivos.add(new SmartPhone("Android", "Xrr8"));
		dispositivos.add(new Notebook("Windowns", 1900));

		for (Dispositivo dis : dispositivos) {
			System.out.println(dis);
		}
	}

}
