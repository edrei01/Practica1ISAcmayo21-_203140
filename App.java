import java.util.Scanner;

public class App {
    int hora = 0;
    int minuto = 0;
    int segundo = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menu = 0;

        do {

            System.out.println("\t menu de opciones");
            System.out.println("1.Ingresar hora 1");
            System.out.println("2.ingresar hora 2");
            System.out.println("3.ingresar hora 3");
            System.out.println("Seleccione la opcion que desee");
            menu = in.nextInt();

        } while (menu > 3);

        switch (menu) {
            case 1:
                App hora1 = new App();
                hora1.hora = 10;
                if (hora1.hora <= 24) {
                    System.out.println("la hora que ingresaste es->" + hora1.hora);

                } else {
                    System.out.println("solo asta la hora 24");
                }

                hora1.minuto = 45;
                if (hora1.minuto <= 59) {
                    System.out.println("los minutos ingresados son-> " + hora1.minuto);
                } else {
                    System.out.println("Solo asta el minuto 59");
                }

                hora1.segundo = 30;
                if (hora1.segundo <= 59) {
                    System.out.println("los segundos ingresados son-> " + hora1.segundo);
                } else {
                    System.out.println("solo asta el segundo 59");
                }

                break;

            case 2:
                App hora2 = new App();
                hora2.hora = 10;
                if (hora2.hora <= 24) {
                    System.out.println("la hora que ingresaste es->" + hora2.hora);

                } else {
                    System.out.println("solo asta la hora 24");
                }

                hora2.minuto = 45;
                if (hora2.minuto <= 59) {
                    System.out.println("los minutos ingresados son-> " + hora2.minuto);
                } else {
                    System.out.println("Solo asta el minuto 59");
                }

                hora2.segundo = 30;
                if (hora2.segundo <= 59) {
                    System.out.println("los segundos ingresados son-> " + hora2.segundo);
                } else {
                    System.out.println("solo asta el segundo 59");
                }

                break;

            case 3:
                App hora3 = new App();
                hora3.hora = 10;
                if (hora3.hora <= 24) {
                    System.out.println("la hora que ingresaste es->" + hora3.hora);

                } else {
                    System.out.println("solo asta la hora 24");
                }

                hora3.minuto = 45;
                if (hora3.minuto <= 59) {
                    System.out.println("los minutos ingresados son-> " + hora3.minuto);
                } else {
                    System.out.println("Solo asta el minuto 59");
                }

                hora3.segundo = 30;
                if (hora3.segundo <= 59) {
                    System.out.println("los segundos ingresados son-> " + hora3.segundo);
                } else {
                    System.out.println("solo asta el segundo 59");
                }

                break;

        }

    }
}
