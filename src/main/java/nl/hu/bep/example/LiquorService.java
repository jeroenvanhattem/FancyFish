package nl.hu.bep.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LiquorService {
    public List getAvailableBrands(LiquorType type) {

        List brands = new ArrayList();
        if (type.equals(LiquorType.WINE)) {
            brands.add("Adrianna Vineyard");
            brands.add("J. P. Chenet");
        } else if(type.equals(LiquorType.WHISKEY)) {
            brands.add("Glenfiddich");
            brands.add("Johnie Walker");
        } else if (type.equals(LiquorType.BEER)) {
            brands.add("Corona");
        } else {
            brands.add("No brand available");
        }

        return brands;
    }
}
