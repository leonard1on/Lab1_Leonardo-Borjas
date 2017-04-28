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
        int menu = 0, tipoarma = 0, opcion = 1;
        ArrayList ruso = new ArrayList();
        ArrayList aleman = new ArrayList();
        ArrayList alumnos = new ArrayList();
//------------------------------------------------------------------------------
        do {
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("*****Turno de los Rusos*****\n"
                                + "1. Reclutar soldados\n"
                                + "2. Modificar datos del soldado\n"
                                + "3. Dar de alta a un soldado\n"
                                + "4. Mostrar soldados activos\n"
                                + "5. Terminar turno");
                        menu = sc.nextInt();
                        switch (menu) {
                            case 1:
                                System.out.println("Ingrese el nombre del soldado");
                                String nombre = sc.next();
                                System.out.println("Ingrese el ID del soldado");
                                int id = sc.nextInt();
                                System.out.println("Ingrese la edad del soldado");
                                int edadR = sc.nextInt();
                                System.out.println("Ingrese el rango del soldado");
                                String rango = sc.next();
                                if (edadR > 25) {
                                    do {
                                        System.out.println("Elija el arma del soldado\n"
                                                + "1. AK-47 (PdF=27)\n2. Revolver Navant (PdF=13)"
                                                + "\n3. RPG-7 (PdF=57)");
                                        tipoarma = sc.nextInt();
                                    } while (tipoarma < 1 && tipoarma > 3);
                                } else {
                                    do {
                                        System.out.println("Elija el arma del soldado\n"
                                                + "1. AK-47 (PdF=27)\n2. Revolver Navant (PdF=13)");
                                        tipoarma = sc.nextInt();
                                    } while (tipoarma < 1 && tipoarma > 2);
                                }

                                if (edadR >= 18) {
                                    ruso.add(new EjercitoRuso(nombre, id, edadR, rango, tipoarma));
                                } else {
                                    System.out.println("Debe ser mayor de edad para entrar al ejercito\n");
                                }
                                break;
                            case 4:
                                for (Object t : ruso) {
                                    if (t instanceof EjercitoRuso) {
                                        System.out.println(ruso.indexOf(t) + " " + ruso);
                                    }
                                }

                        }

                    } while (menu != 5);
                    opcion=2;
                    break;
//--------------------------------------------------------------------------------------
                case 2:
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
                                do {
                                    System.out.println("Elija el arma del soldado\n"
                                            + "1. Subfusil MP 40 (PdF=25)\n2. Ametralladora MG42 (PdF=32)"
                                            + "\n3. Pistolas Walther P38 (PdF=11)");
                                    tipoarma = sc.nextInt();
                                } while (tipoarma < 1 && tipoarma > 3);

                                aleman.add(new EjercitoAleman(alias, edadA, casta, tipoarma));
                                break;
                            case 4:
                                for (Object t : aleman) {
                                    if (t instanceof EjercitoAleman) {
                                        System.out.println(aleman.indexOf(t) + " " + aleman);
                                    }
                                }
                                break;
                        }

                    } while (menu != 5);
                    opcion=3;
                    break;
//------------------------------------------------------------------------------------
                case 3:
                    do {
                        System.out.println("*****Turno de los Alumnos de PrograII*****\n"
                                + "1. Reclutar soldados\n"
                                + "2. Modificar datos del soldado\n"
                                + "3. Dar de alta a un soldado\n"
                                + "4. Mostrar soldados activos\n"
                                + "5. Terminar turno");
                        menu = sc.nextInt();
                        switch (menu) {
                            case 1:
                                System.out.println("Ingrese el apodo del soldado");
                                String apodo = sc.next();
                                System.out.println("Ingrese el numero de cuenta del soldado");
                                int cuenta = sc.nextInt();
                                System.out.println("Ingrese la edad del soldado");
                                int edadAl = sc.nextInt();
                                System.out.println("Ingrese el Grado Academico del soldado");
                                String grado = sc.next();
                                do {
                                    System.out.println("Elija el arma del soldado\n"
                                            + "1. Discos Duros (PdF=23)\n2. Controles de Wii (PdF=47)"
                                            + "\n3. Laptops (PdF=76)");
                                    tipoarma = sc.nextInt();
                                } while (tipoarma < 1 && tipoarma > 3);

                                alumnos.add(new EjercitoAlumnos(apodo, cuenta, edadAl, grado, tipoarma));
                                break;
                            case 4:
                                for (Object t : alumnos) {
                                    if (t instanceof EjercitoAlumnos) {
                                        System.out.println(alumnos.indexOf(t) + " " + alumnos);
                                    }
                                }
                                break;
                        }
                    } while (menu != 5);
                    opcion=4;
                    break;
//-----------------------------------------------------------------------------------------------
                case 4:
                    break;

//-----------------------------------------------------------------------------------------------                   
            }
        } while (opcion != 5);
    }

}
