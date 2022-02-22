package Entities;

public class Utils {
    public static int noMin(int[] v){
        int min=v[0];
        int k=0;
        for(int i=0;i<v.length;i++){
            if(v[i]<min) {
                min = v[i];
                k=1;
            }
            else if(v[i]==min)
                k++;
        }

        return k;
    }
}
