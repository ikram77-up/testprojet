package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
// crrer moi un objet de cette classe
@Repository("dao")
public class DaoImpl implements IDao{

	@Override
	public double getData() {
		/**
		 * je me connecte a la base de donnees 
		 */
		double data =98;
		return data;
	}
	public void init () {
		System.out.println("instanciation de Dao Implementation");
	}

}
