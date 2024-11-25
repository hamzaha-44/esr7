/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contatoremodulonconpasso;

/**
 *
 * @author moham
 */
public class ContatoreModuloNConPasso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class ContatoreModuloNConPasso {
    private int valore;
    private int modulo;
    private int passo;

    public ContatoreModuloNConPasso(int modulo, int passo) {
        this.valore = 0;
        this.modulo = modulo;
        this.passo = passo;
    }

    public void incrementa() {
        valore = (valore + passo) % modulo;
    }

    public int getValore() {
        return valore;
    }
}