/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coffee;

import java.util.*;

/**
 *
 * @author DELL
 */
public class CoffeeExpert {

    public List getBrands(String color) {
        List<String> brands;
        brands = new ArrayList<String>();
        if (color.equalsIgnoreCase("Black")) {
            brands.add("Expresso");
        } //    else if (color.equals("Brown")){
        //        brands.add("capuccino");
        //    }
        else {
            brands.add("Latte");
        }
        return (brands);
    }
}
