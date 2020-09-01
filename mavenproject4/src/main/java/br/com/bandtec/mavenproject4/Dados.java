
package br.com.bandtec.mavenproject4;

import java.util.concurrent.ThreadLocalRandom;

public class Dados {
    Double med = 0.0;
    Double min = 0.100;
    Double max = 0.0;
    Double vlr = 0.0;
    
    public void gerar(Integer m, Integer click){
        Double num = ThreadLocalRandom.current().nextDouble(0, m);
        this.med = num/click;
        
        if(num > this.max){
            this.max  = num;
        }else if(num < this.min){
            this.min = num;
        }
        
        this.vlr = num * 10;
    }
   
}
