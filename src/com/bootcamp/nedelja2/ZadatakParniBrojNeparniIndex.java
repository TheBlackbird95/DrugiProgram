package com.bootcamp.nedelja2;

public class ZadatakParniBrojNeparniIndex {
    public static void main(String[] args) {
        int[] niz = {2,1,3,4,5,7,8,10,0,0};
        for (int i = 0; i< niz.length; i++){
            if (i%2==1 && niz[i]%2==0 && niz[i]!=0){
                System.out.println(niz[i]);
            }
        }
    }
}
