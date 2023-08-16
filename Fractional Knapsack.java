

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,new sortIt());
        
     
        double profit=0;int i=0;
        while(W!=0 && i<n){
            if(arr[i].weight<=W){
                profit+=arr[i].value;
                W-=arr[i].weight;
            }
            else{
                double k=(double)W/arr[i].weight;
              
                profit+=k*arr[i].value;
                W=0;
            }
            i++;
        }
        return profit;
    }
}

class sortIt implements Comparator<Item>{
     public int compare(Item a,Item b){
         double k= (double)b.value/b.weight - (double)a.value/a.weight;
         if(k>0.00001) return 1;
         else return -1;
     }
}
