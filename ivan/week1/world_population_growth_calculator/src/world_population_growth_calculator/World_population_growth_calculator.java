/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_population_growth_calculator;

/**
 *
 * @author Ergo3.0
 */
public class World_population_growth_calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double actualpopulation=7555503500.0,population=actualpopulation,growth=0 ;
        float growthrate=0.011f;
        System.out.printf("Year  | Population \n");
        for(int i=2017;i<=(2017+5);i++){ 
            population=population+growth;
            System.out.printf("%d  | %.0f\n",i,population);
            growth=population*growthrate;
        }
        
    }
    
}
