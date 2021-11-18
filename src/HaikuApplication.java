import data.HaikuWriter;
import haikuanalysis.HaikuAnalysisEngine;
import haikuanalysis.HaikuPoem;
import ui.Menu;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class HaikuApplication {
    static Scanner scanner = new Scanner(System.in);

    private static Menu menu = new Menu();
    private HaikuAnalysisEngine checkerEngine = new HaikuAnalysisEngine();
    private HaikuWriter haikuWriter = new HaikuWriter();

    public static void main(String[] args) {
        HaikuApplication app = new HaikuApplication();
        app.menu.welcomeUser();
        app.menu.haikuRules();


        while (true) {

            System.out.println("insert 1 for create a haiku-poem");
            System.out.println("insert 2 quit");
            int inputFromUser = scanner.nextInt();
            if (inputFromUser == 1) {
                String nameOfTheUser = menu.nameOfTheUser();
                String firstLine = menu.firstLine();
                String secondLine = menu.secondLine();
                String thirdLine = menu.thirdLine();
                HaikuPoem haikuPoem = new HaikuPoem(nameOfTheUser, firstLine, secondLine, thirdLine);
                app.checkerEngine.isHaikuValid(haikuPoem);
            } else if (inputFromUser == 2) {
                System.out.println("ciao");
                break;
            }
        }
    }
}

