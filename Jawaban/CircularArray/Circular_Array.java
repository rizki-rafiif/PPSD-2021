package gg.rizkirafiif.Jawaban.CircularArray;
public class Circular_Array 
{
    private final int size = 10;
    private Data content[] = new Data[size];
    private int depan = 0, belakang = 0;

    boolean isEmpty(){
        if (belakang == depan && belakang == 0 && content[9] == null)
            return true;
        else
            return false;
    }

    boolean isFull(){
       if (belakang == depan && content[9] != null)
           return true;
       else
           return false;
    }

    void enqueue(Data input){
        int temp = depan;
        if (!isFull()){
            belakang = (belakang+1)%content.length;
            if (belakang == 0){
                content[9] = input;
            }
            if (isEmpty()){
                depan = temp;
            } 
            else if (!isEmpty() && belakang !=0){
                content[(belakang-1)%content.length] = input;
            }
        }
        else{
            System.out.println("Queue penuh !");
        }
    }
    
    Data dequeue(){
        Data input;
        if(!isEmpty()){
            input = content[depan];
            depan = (depan+1)%content.length;
        }
        else{
            input = null;
        }
        return input;
    }
    
    void makeEmpty(){
        if(isEmpty()){
            System.out.println("Queue kosong !");
        }
        else{
            depan = belakang = 0;
            content[9]=null;
            System.out.println("Data queue berhasil dikosongkan !");
        }
    }
    
    void show(){
        if(!isEmpty()){
            if (depan !=0 && belakang <= depan){
                for (int i = depan; i <= 9; i++){
                    System.out.println("NIM\t: "+content[i].nim+"\nNama\t: "+content[i].nama+"\nAlamat\t: "+content[i].alamat+"\n");
                }
                for (int i = 0; i < belakang; i++){
                    System.out.println("NIM\t: "+content[i].nim+"\nNama\t: "+content[i].nama+"\nAlamat\t: "+content[i].alamat+"\n");
                }
            }
            else if (depan == 0 && isFull()){
                for (int i = 0; i <= 9; i++){
                    System.out.println("NIM\t: "+content[i].nim+"\nNama\t: "+content[i].nama+"\nAlamat\t: "+content[i].alamat+"\n");
                }
            }
            else{
                for (int i = depan; i < belakang; i++){
                    System.out.println("NIM\t: "+content[i].nim+"\nNama\t: "+content[i].nama+"\nAlamat\t: "+content[i].alamat+"\n");
                }
            }
        }
        else{
            System.out.println("Queue kosong !");
        }
    }
}
