import java.util.*;
import java.util.stream.*;
class DiwaliBOGOOffer {
    public static Map<String, List<Integer>> applyBOGOOffer(List<Integer>proPrices){
        List<Integer> sortedProductPrices = proPrices.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> payableItem=new ArrayList<>();
        List<Integer> freeItem= new ArrayList<>();
        
        //process Item in pairs
        for(int i=0; i<sortedProductPrices.size(); i+=2){
            //This item that will bought
            payableItem.add(sortedProductPrices.get(i));
            
            //this item will be free
            if(i+1<sortedProductPrices.size()){
                freeItem.add(sortedProductPrices.get(i+1));
            }
        }
        
        //return the result
        Map<String, List<Integer>> finalOutput= new HashMap<>();
        finalOutput.put("payableItem", payableItem);
        finalOutput.put("freeItem",freeItem);
        return finalOutput;
    }
        
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //List of product prices
        List<Integer> productPrices= Arrays.asList(10,20,30,40,50,50,60);
        Map<String, List<Integer>> output=applyBOGOOffer(productPrices);
        System.out.println("Discount Item (free) : "+ output.get("freeItem"));
        System.out.println("Payables Items : "+ output.get("payableItem"));
        
    }
}