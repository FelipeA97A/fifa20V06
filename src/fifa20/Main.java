package fifa20;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDController controlador = new BDController();
		ArrayList<Liga> ligas = controlador.dameLigas();
		System.out.println(ligas.size() + " A ");
		for (int i = 0; i < ligas.size(); i++) {
			ArrayList<Equipo> equipos = controlador.dameEquiposLiga(ligas.get(i).getCod_liga());
			for (int j = 0; j < equipos.size(); j++) {
				System.out.println(equipos.get(i).getCod_equipo());
			}
			System.out.println("Nueva Liga");
		}

	}

}
