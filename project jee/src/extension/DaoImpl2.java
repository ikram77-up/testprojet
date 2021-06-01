package extension;

import org.springframework.stereotype.Component;

import dao.IDao;
@Component
public class DaoImpl2 implements IDao{
/**
	 * ici on va faire la maintenance
	 */
	@Override
	public double getData() {
		/**
		 * Version web service
		 */
		System.out.println("Version Web Service");
		double data = 12;
		return data;
	}
	

	
}
