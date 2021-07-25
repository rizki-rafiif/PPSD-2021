/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.rizkirafiif.Jawaban.KonversiBiner;
public class ConverterBinnertoDecimal {
    Node tos;
    
    boolean isEmpty() 
    {
        return (tos == null);
    }
    
    void push(Object data) 
    {
        tos = new Node(data, tos);
    }
    
    String pop() 
    {
        Node temp;
        temp = tos;
        tos = tos.next;
        return temp.data.toString();
    }

    void ubah (String input)
    {
        Double a = 0.0;
        ConverterBinnertoDecimal obj = new ConverterBinnertoDecimal();
        for (int i = 0; i < input.length(); i++){
            obj.push(input.charAt(i));
        }
        for (double i = 0; i<input.length(); i++){
            String panggil = obj.pop().toString();
            double b = Double.parseDouble(panggil);
            double kali = b*Math.pow(2.0, i);
            a += kali;
        }
        int hasil = a.intValue();
        System.out.println("Hasil dalam desimal : "+hasil);
    }
    
    boolean checking(String input)
    {
        boolean found = true;
        for(int i = 0; i < input.length(); i++)
        {
           if(input.charAt(i) != '0' && input.charAt(i) != '1')
           {
                found = false;
                break;
           }
        }
        return found;
    }
}


