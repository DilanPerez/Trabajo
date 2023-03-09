
package Modelo;

public class Superheroe {
   private String nom_heroe;
  private int Salud;

  public Superheroe(String nom_heroe, int Salud){
      this.nom_heroe = nom_heroe;
      this.Salud=Salud; 
    } 
  public Superheroe(){}

    public String getNom_heroe() {
        return nom_heroe;
    }

    public void setNom_heroe(String nom_heroe) {
        this.nom_heroe = nom_heroe;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }
  
  
} 
  
