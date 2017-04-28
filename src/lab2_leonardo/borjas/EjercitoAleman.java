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
public class EjercitoAleman {
    private String alias;
    private int edad;
    private String casta;
    private int resistencia;
    private String tipoarma;
    private int poder;
    
    public EjercitoAleman(){
        
    }
    public EjercitoAleman(String alias, int edad, String casta, int arma){
        this.alias=alias;
        this.edad=edad;
        this.casta=casta;
        this.resistencia=edad*8;
        switch(arma){
            case 1:
                this.tipoarma="Subfusil MP 40";
                this.poder=25;
                break;
            case 2:
                this.tipoarma="Ametralladora MG42";
                this.poder=32;
                break;
            case 3:
                this.tipoarma="Pistolas Walther P38";
                this.poder=11;
                break;
        }
    }

    public int getPoder() {
        return poder;
    }

    public String getAlias() {
        return alias;
    }

    public int getEdad() {
        return edad;
    }

    public String getCasta() {
        return casta;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasta(String casta) {
        this.casta = casta;
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
        return "EjercitoAleman{" + "alias=" + alias + ", Edad=" + edad +
                ", casta=" + casta + ", resistencia=" + resistencia + ", "
                + "Tipo de Arma=" + tipoarma + '}';
    }
    
    
    
}
