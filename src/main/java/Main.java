import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static Logger logger;

    public static void main(String[] args) {

        logger = LogManager.getLogger(Main.class);

        System.out.println("Hányszor akarsz logolni?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //final Level VIOLATION = Level.forName("VIOLATION", 150); // szint a karantén szabályok megsértésének naplózásához
        //final Level REQUEST = Level.forName("REQUEST", 350); // szint kérelmek naplózásához
        final Level VIOLATION = Level.getLevel("VIOLATION");
        final Level REQUEST = Level.getLevel("REQUEST");


        for (int i = 1; i <= n; i++) {
            logger.log(VIOLATION, "Zöld erdőben jártam,");
            logger.info("Kék ibolyát láttam,");
            logger.warn("El akart hervadni,");
            logger.log(REQUEST, "Szabad-e locsolni?");
            try {
                Thread.sleep(10); // egy kis késleltetés
            } catch (InterruptedException e) {}
        }
    }

}
