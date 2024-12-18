class Solution {
    public int[] finalPrices(int[] prices) {

        for(int i=0;i<prices.length;i++){

            prices[i]= findPrice(prices,i);
            
        }

        return prices;
    }
    
    
    private int findPrice(int[] arr, int index){

        for(int i=index+1;i<arr.length;i++){
            
            if(arr[index]>=arr[i]){
                arr[index] -= arr[i];
                return arr[index];
            }
        }
        
        return arr[index];
    }
}