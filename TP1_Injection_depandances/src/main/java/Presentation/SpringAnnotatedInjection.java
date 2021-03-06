package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class SpringAnnotatedInjection {


    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("Dao","Metier");

        IMetier metier = (IMetier) applicationContext.getBean("metierAnotatedConstructorInjection");

        System.out.println("\n Annotated Constructor Injection result  => "+ metier.calculate());
    }
}
