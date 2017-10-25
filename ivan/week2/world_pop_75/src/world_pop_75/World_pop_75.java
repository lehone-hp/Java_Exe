/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_pop_75;

/**
 *
 * @author Ergo3.0
 */
public class World_pop_75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double actualpopulation=7555503500.0,population=actualpopulation,growth=0 ;
        float growthrate=0.011f;
        System.out.printf("Year  | Population \t| growth \n");
        for(int i=2017;i<=(2017+75);i++){ 
            population=population+growth;
            System.out.printf("%d  | %.0f \t| %.0f\n",i,population,growth);
            growth=population*growthrate;
        }
    }
    
}
