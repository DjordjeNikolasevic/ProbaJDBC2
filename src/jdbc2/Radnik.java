/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

/**
 *
 * @author nd160074d
 */
public class Radnik {
    private int brLK;
    private String ime;
    private String prezime;
    private String brTel;
    private String grad;
    private String ulica;
    private int broj;
    private int zona;

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getBrLK() {
        return brLK;
    }

    public void setBrLK(int brLK) {
        this.brLK = brLK;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrTel() {
        return brTel;
    }

    public void setBrTel(String brTel) {
        this.brTel = brTel;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    @Override
    public String toString() {
        return "brLK=" + brLK + ", ime=" + ime + ", prezime=" + prezime + ", brTel=" + brTel + ", grad=" + grad + ", ulica=" + ulica + ", broj=" + broj + ", zona=" + zona + '\n';
    }

    
}
