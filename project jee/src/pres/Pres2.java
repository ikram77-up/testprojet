package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;



public class Pres2 {

	public static void main(String[] args) throws Exception {
		/**
		 * DaoImpl daoi = new DaoImpl();
		MetierImpl metier = new MetierImpl();
		// injection des dependences par instanciation Statique
		metier.setDao(daoi);
		System.out.println(metier.calcul());
		en moment de compilation je connais pas le nom de ;a classe 
		mais en moment de execution on connais la classe a partir 
		d'un fichier qui va recuperer le nom de la classe  
		mantenant on va instancier  en maniere dynamique 
		charger le bytecode de la classe en memoire
		gestion des exeptions avec Try Catch c'est un probleme thecnique c'est un aspi
		 */
		
			Scanner scanner =new Scanner(new File("Config.txt"));
			String daoClassName = scanner.nextLine();
			//System.out.println(daoClassName);
			Class cDao=Class.forName(daoClassName);
			IDao  dao=(IDao) cDao.newInstance();
			
			String metierClassName = scanner.nextLine();
			Class cMetier =Class.forName(metierClassName);
			IMetier metier =(IMetier) cMetier.newInstance();
			
			Method m =cMetier.getMethod("setDao", IDao.class);
			m.invoke(metier, dao);
			System.out.println(metier.calcul());
			
			//System.out.println(dao.getData());// je connais pas classe mais je connais que l'interface 
			
		
	}

}
