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
        int menu = 0, tipoarma = 0, opcion = 1, poder = 0, gane = 0;
        String arma = "";
        ArrayList ruso = new ArrayList();
        ArrayList aleman = new ArrayList();
        ArrayList alumnos = new ArrayList();
        ArrayList muertos = new ArrayList();

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
                                + "5. Terminar turno\n"
                                + "6. Simulacion de batalla");
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
                            case 2:
                                System.out.println("Que numero de soldado desea modificar");
                                int espacio = sc.nextInt();
                                if (ruso.get(espacio) instanceof EjercitoRuso) {
                                    System.out.println("Ingrese el nombre del soldado");
                                    nombre = sc.next();
                                    System.out.println("Ingrese el ID del soldado");
                                    id = sc.nextInt();
                                    System.out.println("Ingrese la edad del soldado");
                                    edadR = sc.nextInt();
                                    System.out.println("Ingrese el rango del soldado");
                                    rango = sc.next();
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
                                    ((EjercitoRuso) ruso.get(espacio)).setNombre(nombre);
                                    ((EjercitoRuso) ruso.get(espacio)).setEdad(edadR);
                                    ((EjercitoRuso) ruso.get(espacio)).setId(id);
                                    ((EjercitoRuso) ruso.get(espacio)).setRango(rango);
                                    switch (tipoarma) {
                                        case 1:
                                            arma = "AK-47";
                                            poder = 27;
                                            break;
                                        case 2:
                                            arma = "Revolver Navant";
                                            poder = 13;
                                            break;
                                        case 3:
                                            arma = "RPG-7";
                                            poder = 57;
                                            break;
                                    }
                                    ((EjercitoRuso) ruso.get(espacio)).setTipoarma(arma);
                                    ((EjercitoRuso) ruso.get(espacio)).setPoder(poder);
                                }
                                break;
                            case 3:
                                System.out.println("Que numero de soldado desea dar de alta");
                                int alta = sc.nextInt();
                                if (ruso.get(alta) instanceof EjercitoRuso) {
                                    ruso.remove(alta);
                                }
                                break;
                            case 4:
                                for (Object t : ruso) {
                                    if (t instanceof EjercitoRuso) {
                                        System.out.println(ruso.indexOf(t) + " " + ruso);
                                    }
                                }
                                break;
                            case 5:
                                opcion = 2;
                                break;
                            case 6:
                                opcion = 4;
                                break;

                        }

                    } while (menu <= 4);

                    break;
//--------------------------------------------------------------------------------------
                case 2:
                    opcion = 3;
                    do {
                        System.out.println("*****Turno de los Alemanes*****\n"
                                + "1. Reclutar soldados\n"
                                + "2. Modificar datos del soldado\n"
                                + "3. Dar de alta a un soldado\n"
                                + "4. Mostrar soldados activos\n"
                                + "5. Terminar turno\n"
                                + "6. Simulacion de Batalla");
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
                            case 2:
                                System.out.println("Que numero de soldado desea modificar");
                                int espacio = sc.nextInt();
                                if (ruso.get(espacio) instanceof EjercitoRuso) {
                                    System.out.println("Ingrese el alias del soldado");
                                    alias = sc.next();
                                    System.out.println("Ingrese la edad del soldado");
                                    edadA = sc.nextInt();
                                    System.out.println("Ingrese la Casta del soldado");
                                    casta = sc.next();
                                    do {
                                        System.out.println("Elija el arma del soldado\n"
                                                + "1. Subfusil MP 40 (PdF=25)\n2. Ametralladora MG42 (PdF=32)"
                                                + "\n3. Pistolas Walther P38 (PdF=11)");
                                        tipoarma = sc.nextInt();
                                    } while (tipoarma < 1 && tipoarma > 3);

                                    ((EjercitoAleman) aleman.get(espacio)).setAlias(alias);
                                    ((EjercitoAleman) aleman.get(espacio)).setEdad(edadA);
                                    ((EjercitoAleman) aleman.get(espacio)).setCasta(casta);
                                    switch (tipoarma) {
                                        case 1:
                                            arma = "Subfusil MP 40";
                                            poder = 25;
                                            break;
                                        case 2:
                                            arma = "Ametralladora MG42";
                                            poder = 32;
                                            break;
                                        case 3:
                                            arma = "Pistolas Walther P38";
                                            poder = 11;
                                            break;

                                    }
                                    ((EjercitoAleman) aleman.get(espacio)).setTipoarma(arma);
                                    ((EjercitoAleman) aleman.get(espacio)).setPoder(poder);
                                }
                                break;
                            case 3:
                                System.out.println("Que numero de soldado desea dar de alta");
                                int alta = sc.nextInt();
                                if (aleman.get(alta) instanceof EjercitoAleman) {
                                    aleman.remove(alta);
                                }
                                break;
                            case 4:
                                for (Object t : aleman) {
                                    if (t instanceof EjercitoAleman) {
                                        System.out.println(aleman.indexOf(t) + " " + aleman);
                                    }
                                }
                                break;
                            case 5:
                                break;
                            case 6:
                                opcion = 4;
                                break;
                        }

                    } while (menu <= 4);

                    break;
//------------------------------------------------------------------------------------
                case 3:
                    opcion = 1;
                    do {
                        System.out.println("*****Turno de los Alumnos de PrograII*****\n"
                                + "1. Reclutar soldados\n"
                                + "2. Modificar datos del soldado\n"
                                + "3. Dar de alta a un soldado\n"
                                + "4. Mostrar soldados activos\n"
                                + "5. Terminar turno\n"
                                + "6. Simulacion de batalla");
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
                                if (edadAl >= 16) {
                                    alumnos.add(new EjercitoAlumnos(apodo, cuenta, edadAl, grado, tipoarma));
                                } else {
                                    System.out.println("Debe ser mayor de 16 años");
                                }

                                break;
                            case 2:
                                System.out.println("Que numero de soldado desea modificar");
                                int espacio = sc.nextInt();
                                if (alumnos.get(espacio) instanceof EjercitoAlumnos) {
                                    System.out.println("Ingrese el apodo del soldado");
                                    apodo = sc.next();
                                    System.out.println("Ingrese el numero de cuenta del soldado");
                                    cuenta = sc.nextInt();
                                    System.out.println("Ingrese la edad del soldado");
                                    edadAl = sc.nextInt();
                                    System.out.println("Ingrese el Grado Academico del soldado");
                                    grado = sc.next();
                                    do {
                                        System.out.println("Elija el arma del soldado\n"
                                                + "1. Discos Duros (PdF=23)\n2. Controles de Wii (PdF=47)"
                                                + "\n3. Laptops (PdF=76)");
                                        tipoarma = sc.nextInt();
                                    } while (tipoarma < 1 && tipoarma > 3);
                                    ((EjercitoAlumnos) alumnos.get(espacio)).setApodo(apodo);
                                    ((EjercitoAlumnos) alumnos.get(espacio)).setCuenta(cuenta);
                                    ((EjercitoAlumnos) alumnos.get(espacio)).setEdad(edadAl);
                                    switch (tipoarma) {
                                        case 1:
                                            arma = "Discos Duro";
                                            poder = 23;
                                        case 2:
                                            arma = "Controles de Wii";
                                            poder = 47;
                                        case 3:
                                            arma = "Laptops";
                                            poder = 76;

                                    }
                                    ((EjercitoAlumnos) alumnos.get(espacio)).setTipoarma(arma);
                                    ((EjercitoAlumnos) alumnos.get(espacio)).setPoder(poder);
                                }
                                break;
                            case 3:
                                System.out.println("Que numero de soldado desea dar de alta");
                                int alta = sc.nextInt();
                                if (alumnos.get(alta) instanceof EjercitoAlumnos) {
                                    alumnos.remove(alta);
                                }
                                break;
                            case 4:
                                for (Object t : alumnos) {
                                    if (t instanceof EjercitoAlumnos) {
                                        System.out.println(alumnos.indexOf(t) + " " + alumnos);
                                    }
                                }
                                break;
                            case 5:
                                break;
                            case 6:
                                opcion = 4;
                                break;
                        }
                    } while (menu <= 4);

                    break;
//-----------------------------------------------------------------------------------------------
                case 4:
                    //1-2
                    if (ruso.isEmpty() || aleman.isEmpty()) {
                    } else {
                        for (int i = 0; i < ruso.size(); i++) {
                            if (ruso.get(i) instanceof EjercitoRuso) {
                                int vidaenemiga = ((EjercitoAleman) aleman.get(i)).getResistencia();
                                int ataque = ((EjercitoRuso) ruso.get(i)).getPoder();
                                int restante = vidaenemiga - ataque;
                                if (restante <= 0) {
                                    muertos.add(((EjercitoAleman) aleman.get(i)).getAlias() + "-Ejercito Aleman");
                                    aleman.remove(i);
                                }
                            }
                        }
                    }
                    
                    //1-3
                    if (ruso.isEmpty() || alumnos.isEmpty()) {
                    } else {
                        for (int i = 0; i < ruso.size(); i++) {
                            if (ruso.get(i) instanceof EjercitoRuso) {
                                int vidaenemiga = ((EjercitoAlumnos) alumnos.get(i)).getResistencia();
                                int ataque = ((EjercitoRuso) ruso.get(i)).getPoder();
                                int restante = vidaenemiga - ataque;
                                if (restante <= 0) {
                                    muertos.add(((EjercitoAlumnos) alumnos.get(i)).getApodo() + "-Ejercito Alumnos de PrograII");
                                    alumnos.remove(i);
                                }
                            }
                        }
                    }
                    
                    //2-3
                    if (aleman.isEmpty() || alumnos.isEmpty()) {
                    } else {
                        for (int i = 0; i < ruso.size(); i++) {
                            if (aleman.get(i) instanceof EjercitoRuso) {
                                int vidaenemiga = ((EjercitoAlumnos) alumnos.get(i)).getResistencia();
                                int ataque = ((EjercitoAleman) aleman.get(i)).getPoder();
                                int restante = vidaenemiga - ataque;
                                if (restante <= 0) {
                                    muertos.add(((EjercitoAlumnos) alumnos.get(i)).getApodo() + "-Ejercito Alumnos de PrograII");
                                    alumnos.remove(i);
                                }
                            }
                        }
                    }
                    //2-1
                    if (aleman.isEmpty() || ruso.isEmpty()) {
                    } else {
                        for (int i = 0; i < aleman.size(); i++) {
                            if (aleman.get(i) instanceof EjercitoAleman) {
                                int vidaenemiga = ((EjercitoRuso) ruso.get(i)).getResistencia();
                                int ataque = ((EjercitoAleman) aleman.get(i)).getPoder();
                                int restante = vidaenemiga - ataque;
                                if (restante <= 0) {
                                    muertos.add(((EjercitoRuso) aleman.get(i)).getNombre() + "-Ejercito Ruso");
                                    aleman.remove(i);
                                }
                            }
                        }
                    }
                    
                    //3-1
                    if (ruso.isEmpty() || alumnos.isEmpty()) {
                    } else {
                        for (int i = 0; i < alumnos.size(); i++) {
                            if (alumnos.get(i) instanceof EjercitoAlumnos) {
                                int vidaenemiga = ((EjercitoRuso) ruso.get(i)).getResistencia();
                                int ataque = ((EjercitoAlumnos) alumnos.get(i)).getPoder();
                                int restante = vidaenemiga - ataque;
                                if (restante <= 0) {
                                    muertos.add(((EjercitoRuso) ruso.get(i)).getNombre() + "-Ejercito Ruso");
                                    ruso.remove(i);
                                }
                            }
                        }
                    }
                    //3-2
                    if (alumnos.isEmpty() || aleman.isEmpty()) {
                    } else {
                        for (int i = 0; i < alumnos.size(); i++) {
                            if (alumnos.get(i) instanceof EjercitoAlumnos) {
                                int vidaenemiga = ((EjercitoAleman) aleman.get(i)).getResistencia();
                                int ataque = ((EjercitoAlumnos) alumnos.get(i)).getPoder();
                                int restante = vidaenemiga - ataque;
                                if (restante <= 0) {
                                    muertos.add(((EjercitoAleman) aleman.get(i)).getAlias() + "-Ejercito Aleman");
                                    aleman.remove(i);
                                }
                            }
                        }
                    }
                    
                    
                    opcion = 1;
                    if (aleman.isEmpty() && alumnos.isEmpty() && ruso.isEmpty()) {
                        opcion = 5;
                        gane = 0;
                    } else {
                        if (aleman.isEmpty() && alumnos.isEmpty()) {
                            opcion = 5;
                            gane = 1;
                        }
                        if (ruso.isEmpty() && alumnos.isEmpty()) {
                            opcion = 5;
                            gane = 2;
                        }
                        if (aleman.isEmpty() && ruso.isEmpty()) {
                            opcion = 5;
                            gane = 3;
                        }
                    }
                    break;

//-----------------------------------------------------------------------------------------------                   
            }
        } while (opcion != 5);
        switch (gane) {
            case 1:
                System.out.println("Ganan los Rusos");
                break;
            case 2:
                System.out.println("Ganan los Alemanes");
                break;
            case 3:
                System.out.println("Ganan los Alumnos de PrograII");
                break;
            default:
                System.out.println("Empate");
                break;
        }
        System.out.println("*****MUERTOS EN COMBATE******");
        System.out.println(muertos);
    }

}
