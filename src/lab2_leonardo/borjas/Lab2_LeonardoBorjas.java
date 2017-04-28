/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_leonardo.borjas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo Borjas
 */
public class Lab2_LeonardoBorjas {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        ArrayList ruso = new ArrayList();
        ArrayList aleman = new ArrayList();
        ArrayList alumnos = new ArrayList();
        do {
            System.out.println("*****Turno de los Alemanes*****\n"
                    + "1. Reclutar soldados\n"
                    + "2. Modificar datos del soldado\n"
                    + "3. Dar de alta a un soldado\n"
                    + "4. Mostrar soldados activos\n"
                    + "5. Terminar turno");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ingrese el alias del soldado");
                    String alias = sc.next();
                    System.out.println("Ingrese la edad del soldado");
                    int edadA = sc.nextInt();
                    System.out.println("Ingrese la Casta del soldado");
                    String casta = sc.next();
                    System.out.println("Elija el arma del soldado\n"
                            + "1. Subfusil MP 40 (PdF=25)\n2. Ametralladora MG42 (PdF=32)"
                            + "\n3. Pistolas Walther P38 (PdF=11)");
                    int tipoarma = sc.nextInt();
                    aleman.add(new EjercitoAleman(alias, edadA, casta, tipoarma));
                    break;
                case 4:
                    for (Object t : aleman) {
                        if (t instanceof EjercitoAleman) {
                            System.out.println(aleman.indexOf(t) + " " + aleman);
                        }
                    }

            }

        } while (menu != 5);
    }

}
