/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_leonardo.borjas;

/**
 *
 * @author Leonardo Borjas
 */
public class EjercitoAlumnos {
    private String apodo;
    private int cuenta;
    private int edad;
    private String grado;
    private int resistencia;
    private String tipoarma;
    private int poder;
    EjercitoAlumnos(){
        
    }
    EjercitoAlumnos(String apodo, int cuenta, int edad, String grado, int arma){
        this.apodo=apodo;
        this.cuenta=cuenta;
        this.edad=edad;
        this.resistencia=edad*8;
        this.grado=grado;
        switch(arma){
            case 1: 
                this.tipoarma="Discos Duros";
                this.poder=23;
                break;
            case 2:
                this.tipoarma="Controles de Wii";
                this.poder=47;
                break;
            case 3:
                this.tipoarma="Laptops";
                this.poder=76;
                break;
        }
    }

    public int getPoder() {
        return poder;
    }

    public String getApodo() {
        return apodo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrado() {
        return grado;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "EjercitoAlumnos{" + "Apodo=" + apodo + ", cuenta=" + cuenta +
                ", Edad=" + edad + ", Grado=" + grado + ", resistencia=" +
                resistencia + ", Tipo de Arma=" + tipoarma + '}';
    }
    
}
