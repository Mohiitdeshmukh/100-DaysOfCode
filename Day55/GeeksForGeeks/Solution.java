class Solution {
    
    
    static class PriceIndex {
        int price;
        int index;

        public PriceIndex(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        PriorityQueue<PriceIndex> q = new PriorityQueue<>(Comparator
                .<PriceIndex, Integer>comparing(pi -> pi.price)
                .thenComparing(pi -> -pi.index));

        for (int i = 0; i < price.length; i++) {
            q.offer(new PriceIndex(price[i], i+1));
        }
        int ans=0;
        
        while(!q.isEmpty() && k>0){
            PriceIndex p= q.poll();
            int a=p.index * p.price;
            if(a<k){
                k-=a;
                ans+=p.index;
            }
            else if(k==a){
                k-=a;
                ans+=p.index;
                break;
            }
            else{
                int r=k/ p.price;
                ans+=r;
                k-=p.price*r;
                
            }
            
            
        }
        
        
        return ans;
        
        
        
        
    }
}
   
