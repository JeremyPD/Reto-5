package utp.misiontic2022.c2.p66.reto4.modelo.vo;

public class Requerimiento_3 {

    private String bancoVinculado;
    private int costoLideres;
 
    public Requerimiento_3(String bancoVinculado, int costoLideres) {
        this.bancoVinculado = bancoVinculado;
        this.costoLideres = costoLideres;
    }
 
    public String getBancoVinculado() {
        return bancoVinculado;
    }
 
    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }
 
    public int getCostoLideres() {
        return costoLideres;
    }
 
    public void setCostoLideres(int costoLideres) {
        this.costoLideres = costoLideres;
    }

    public String getbancoVinculado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getcostoLideres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}