package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
           
     private final HashMap<Furniture,Integer> furnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
          furnitures = new HashMap<Furniture,Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
            Integer count = 0;
            if(furniture.containsKey(type))
               {  count = furnitures.get(type);
                   }
             furnitures.put(type,count+furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method

         return new HashMap<Furniture,Integer>(furniture);
       
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
         if(!furniture.isEmpty())
           { return furnitures.entrySet().stream()
                 .map(s -> s.getKey().cost() * s.getValue())
                  .collect(Collectors.tolist()).stram().reduce(Float::sum)
                    .get();
                 }

        return 0.0f;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
         if(furnitures.containsKey(type))
            {return furnitures.get(type)
               }
        return 0;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
         if(furnitures.containsKey(type))
            {return furnitures.get(type) * type.cost();
               }
        return 0.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
         if(!furniture.isEmpty())
           { return furnitures.values().stream().reduce(Integer::sum).get();
            }
        return 0;
    }
}

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return -1.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return -1;
    }
}
