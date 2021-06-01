package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class presAvecSpringXML {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		IMetier metier =(IMetier) ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}

}
