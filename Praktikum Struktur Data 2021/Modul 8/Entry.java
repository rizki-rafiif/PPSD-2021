package com.gracia.modul8.praktikum;

public class Entry <K, V>{
//    Deklarasi variable
    K key;
    V val;

//    Getter & Setter
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

//    Menentukan lokasi penyimpanan dari pasangan key dan value
    public int hashCode(){
        int prime = 13;
        int mul = 11;
        if(key != null){
            int hashCode = prime * mul + key.hashCode();
            return hashCode;
        }
        return 0;
    }

//    Method untuk membandingkan kesamaan nilai pada object
    public boolean equals(Object o){
//        Jika object yang dibandingkan bernilai sama
        if(this == o){
            return true;
        }
//        Jika object yang dibandingkan kosong atau tidak sama
        if(o == null || this.getClass().getName() != o.getClass().getName()){
            return false;
        }
        Entry e = (Entry)o;
//        Jika key yang dibadingkan sama
        if(this.key == e.key){
            return true;
        }
        return false;
    }
}
