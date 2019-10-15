/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan36;

/**
 *
 * @author lutfi
 */
class Tabungan {
    public double saldo_awal;
    public final double bunga = 0.08;
    
    public void tabung(double saldo_target){
        double total, saldo = saldo_awal;
        int bulan = 1;
        while(saldo<saldo_target){
            saldo += Math.floor(saldo*bunga);
            total = (int) saldo;
            System.out.printf("Saldo di bulan ke-"+bulan+" Rp. %,9.0f \n", saldo); 
            bulan++;
        }
    }
}
