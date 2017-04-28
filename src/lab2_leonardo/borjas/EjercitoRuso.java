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
public class EjercitoRuso {
    private String nombre;
    private int id;
    private int edad;
    private String rango;
    private int resistencia;
    private String tipoarma;
    private int poder;
    
    
    public EjercitoRuso(){
        
    }
    public EjercitoRuso(String nombre, int id, int edad, String rango, int arma){
        this.nombre=nombre;
        this.id=id;
        this.edad=edad;
        this.rango=rango;
        this.resistencia=edad*8;
        switch(arma){
            case 1:
                this.tipoarma="AK-47";
                this.poder=27;
                break;
            case 2:
                this.tipoarma="Revolver Navant";
                this.poder=13;
                break;
            case 3:
                this.tipoarma="RPG-7";
                this.poder=57;
                break;
        }
        
    }

    public int getPoder() {
        return poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getRango() {
        return rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRango(String rango) {
        this.rango = rango;
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
        return "Soldado Ruso{" + "nombre=" + nombre + ", ID=" + id + ", edad=" +
                edad + ", rango=" + rango + ", resistencia=" + resistencia + ", "
                + "Tipo de Arma=" + tipoarma + '}';
    }
    
}
