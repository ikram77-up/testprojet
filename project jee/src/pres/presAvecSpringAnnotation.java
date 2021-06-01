package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class presAvecSpringAnnotation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("extension","metier");
		IMetier metier =(IMetier) ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}

}
