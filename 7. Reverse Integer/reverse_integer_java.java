
class Solution {
    
 
    public int reverse(int x) {
        
        long result =0 ;
        int n = 0;
        String temp = Integer.toString(x);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) -'0';
        }
        
        
        if( newGuess[0] == -3){
            newGuess[0] = 0;
            n++;
        }
        

        for (int i = 0; i < temp.length(); i++)
            
        {

            result = (long)(result + newGuess[i] * Math.pow(10,(i)));
      
        }
        if(n == 1){
            
           result =  (result * -1)/10;
            
        }
        
        if(result >Integer.MAX_VALUE - 1 ||result <-Integer.MAX_VALUE  ){
            return 0;
        }
        System.out.println(Integer.MAX_VALUE);
        
        
        

return (int)result;

        
    
    }
}