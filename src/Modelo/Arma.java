
package Modelo;
 
public class Arma {
   private String nom_arma;
   private int dano_arma;
   
   public Arma (String nom_arma, int dano_arma){
       this.nom_arma=nom_arma;
       this.dano_arma=dano_arma;
   }
   public Arma(){}

    public String getNom_arma() {
        return nom_arma;
    }

    public void setNom_arma(String nom_arma) {
        this.nom_arma = nom_arma;
    }

    public int getDano_arma() {
        return dano_arma;
    }

    public void setDano_arma(int dano_arma) {
        this.dano_arma = dano_arma;
    }
   
}
