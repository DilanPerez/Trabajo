
package Modelo;

public class Partida {
    private int Val_resultado;
    private Superheroe Atacante;       
    private Superheroe Victima;
    private Escudo escudo;
    private Arma arma;
    
 public Partida(int Val_resultado, Superheroe Atacante, Superheroe Victima, Escudo escudo, Arma arma){
     this.Val_resultado=Val_resultado;
     this.Atacante=  Atacante;
     this.Victima=Victima;
     this.escudo=escudo;
     this.arma=arma;
 }
 public Partida (){}

    public int getVal_resultado() {
        return Val_resultado;
    }

    public void setVal_resultado(int Val_resultado) {
        this.Val_resultado = Val_resultado;
    }

    public Superheroe getAtacante() {
        return Atacante;
    }

    public void setAtacante(Superheroe Atacante) {
        this.Atacante = Atacante;
    }

    public Superheroe getVictima() {
        return Victima;
    }

    public void setVictima(Superheroe Victima) {
        this.Victima = Victima;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
  
}
