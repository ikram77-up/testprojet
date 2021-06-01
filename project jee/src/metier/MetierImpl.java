package metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;
@Service("metier")
public class MetierImpl implements IMetier{
	
	/**
	 * utilisation de couplage faible
	 */
	@Autowired
	private IDao dao=null;
	
	@Override
	public double calcul() {
		double d =dao.getData(); 
		/**
		 * appel de la methode getData de interface IDao
		 * ici on utilisons le polymorphisme 
		 */
		double res =d*25;
		return res;
	}
	/**
	 * dao attribut prive donc il faut faire une methode Set 
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("injection des dependences");
	}
	public void init () {
		System.out.println("instanciation de Dao metierImplementation");
	}

}
