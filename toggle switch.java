import java.io.*;
import java.util.*;

class sayu {
    public static void main(String[] args) {
       int tarray[]= {0,0,0,0,0};
       int len = tarray.length;

        for(int i = 1;i<=len;i++){
            System.out.println("Iteration #"+i+"\n");
            for(int j=i;j<=len;j=j+i){
                
                tarray[j-1] = tarray[j-1] == 0 ? 1: 0;
                System.out.println("Inner iteration #"+j+", Array is "+ Arrays.toString(tarray)+"\n");
                if(i==0) break;
            }   
        }
        System.out.println("Final array is "+Arrays.toString(tarray));
    }
}