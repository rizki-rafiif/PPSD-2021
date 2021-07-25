/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.rizkirafiif.Jawaban.KonversiBiner;
import java.util.Scanner;
public class Method_main {
    void judul(){
        System.out.println("---Fungsi Converter Binner ke desimal---\n"
                + "\tDisusun oleh : \n"
                + "\tFaisal Dharma Adhinata\n"
                + "\tM0511021\n"
                + "----------------------------------------\n\n");
    }
    public static void main(String args[]) {
        String masuk, pilih;
        ConverterBinnertoDecimal obj = new ConverterBinnertoDecimal();
        Method_main obj2 = new Method_main();
        obj2.judul();
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan bilangan (binner) : ");
            masuk = input.next();
            if(obj.checking(masuk))
            {
                obj.ubah(masuk);   
            }
            else
            {
                System.out.println("Ma.af, hanya untuk bilangan binner !");
            }
            System.out.print("Lakukan lagi ? Y(ya) / else (tidak) : ");
            pilih = input.next();
        }while (pilih.equals("y")||pilih.equals("Y"));
        System.out.println("\n\nTerima Kasih telah berkunjung...");
}
}
