package ohtu;

import ohtu.verkkokauppa.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


@Component
public class Main {

    @Autowired
    public static void main(String[] args) {
        
        Viitegeneraattori viitegen = new Viitegeneraattori();
        Kirjanpito kirjanpito      = new Kirjanpito();
        Varasto varasto            = new Varasto(kirjanpito);
        Pankki pankki              = new Pankki(kirjanpito);
        Kauppa kauppa              = new Kauppa(varasto, pankki, viitegen);
/*
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Viitegeneraattori viitegen = ctx.getBean(Viitegeneraattori.class);
        Kirjanpito kirjanpito      = ctx.getBean(Kirjanpito.class);
        Varasto varasto            = ctx.getBean(Varasto.class);
        Pankki pankki              = ctx.getBean(Pankki.class);
        Kauppa kauppa              = ctx.getBean(Kauppa.class);
*/
        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
        for (String tapahtuma : kirjanpito.getTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }
}
