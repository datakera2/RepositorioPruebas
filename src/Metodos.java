import javax.swing.*;
import java.util.Scanner;

public class Metodos {

    private static int limite = 1;
    private static int gasto;
    private static int ingreso;
    private static int saldoGasto;
    private static int saldoIngreso;
    private static int[] gastosAño = new int[6];
    private static int[] ingresosAño = new int[6];

    public static void showMenu() {
        Scanner input = new Scanner(System.in);

        while (limite == 1) {
            System.out.println("Inserte el número para ejecutar una función");
            System.out.println("Presiona 1 para ejecutar la función de gasto");
            System.out.println("Presiona 2 para ejecutar la función de ingreso");

            int valorSwitch = Integer.valueOf(input.nextLine());

            switch (valorSwitch) {
                case 1:
                    funcionGasto();
                    break;
                case 2:
                    funcionIngreso();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println("¿Deseas realizar otra operación? Presiona 1 para sí, 0 para no.");
            limite = Integer.valueOf(input.nextLine());
        }
    }

    public static void funcionGasto() {

        Scanner inputFuncionGasto = new Scanner(System.in);
        while (limite == 1){

            System.out.println("Inserta un numero para elegir la funcion");
            System.out.println("Inserta el numero 1 para poner tus gastos en 1 año");
            System.out.println("Inserta el numero 2 para ver tus gastos");
            System.out.println("Inserta el numero 3 para ver la suma de gastos");
            int datoElegirGasto = Integer.valueOf(inputFuncionGasto.nextLine());

            switch (datoElegirGasto){

                case 1:
                    ponerGastosAño();
                    break;
                case 2:
                    verGastosAño();
                    break;
                case 3:
                    verTotalGasto();
                    break;
                default:
                    System.out.println("Insertaste un numero equivocado");
                    break;
            }
            System.out.println("Si quieres salir presiona 0, si quieres seguir presiona 1");
            limite = Integer.valueOf(inputFuncionGasto.nextLine());
        }
    }

    public static void funcionIngreso() {

        Scanner inputIngresoFuncion = new Scanner(System.in);

        while (limite == 1){


            System.out.println("Inserta un numero para elegir la funcion");
            System.out.println("Inserta el numero 1 para poner tus ingresos en 1 año");
            System.out.println("Inserta el numero 2 para ver tus ingresos");
            System.out.println("Inserta el numero 3 para ver la suma de ingresos");

            int numerofuncionIngreso = Integer.valueOf(inputIngresoFuncion.nextLine());

            switch (numerofuncionIngreso){

                case 1:
                    ponerIngresosAño();
                    break;
                case 2:
                    verIngresosAño();
                    break;
                case 3:
                    verTotalIngresosAño();
                    break;
            }

            System.out.println("Inserta el numero 0, si quieres salir, sino inserta 1");
            limite = Integer.valueOf(inputIngresoFuncion.nextLine());
        }
    }

    public static void ponerGastosAño() {

        Scanner inputNumeros = new Scanner(System.in);

        for (int ii = 0; ii < gastosAño.length;ii++){

            System.out.println("Inserta tu gasto:");
            gastosAño[ii] = Integer.valueOf(inputNumeros.nextLine());

        }

    }

    public static void verGastosAño(){

        for(int gastoMes : gastosAño){

            System.out.println(gastoMes);
        }
    }

    public static int totalGastoAño(){

        int total = 0;

        for (int ii = 0; ii < gastosAño.length; ii++){

            total = total + gastosAño[ii];
        }

        return total;
    }

    public static void verTotalGasto(){

        int elTotal = totalGastoAño();

    
        System.out.println("Tu total gastado en el año es" + " " + elTotal);

    }

    public static void ponerIngresosAño(){

        Scanner inputIngresosAño = new Scanner(System.in);
        for(int ii = 0; ii < ingresosAño.length; ii++) {

            System.out.println("Coloca tu ingreso");
            ingresosAño[ii] = Integer.valueOf(inputIngresosAño.nextLine());
        }
    }

    public static void verIngresosAño(){

        for(int ingreso: ingresosAño){

            System.out.println(ingreso);
        }

    }

    public static int saldoIngresosAño(){

        int total = 0;

        for (int ii = 0; ii < ingresosAño.length; ii++){

            total = total + ingresosAño[ii];
     
       }

        return total;

    }

    public static void verTotalIngresosAño(){

        int elTotal = saldoIngresosAño();

        System.out.println("Tus ingreso total del años es de" + " " + elTotal);

    }


}
