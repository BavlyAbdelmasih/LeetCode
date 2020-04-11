import java.util.*; 

class Solution {
    public int romanToInt(String s){
        
                    int total = 0 ;

        for(int x=0 ; x < s.length(); x++){
            int result =romanValue(s.charAt(x));
            
            if(x+1 < s.length() ){
                int bresult =romanValue(s.charAt(x+1));

                
                if(result >= bresult ){
                    
                    
                    total = total + result ; 
                }
                else{
                    
                    total = total - result ; 

                }
            }else{
                    total = total + result ; 

            }  
        
    }
        
        return total;
    
    }    
    
    int romanValue(char s){
        
        if(s == 'I'){
         
            return 1 ;
        }else if(s == 'V'){
         
            return 5 ;
        }else if(s == 'X'){
         
            return 10 ;
        }else if(s == 'L'){
         
            return 50 ;
        }else if(s == 'C'){
         
            return 100 ;
        }else if(s == 'D'){
         
            return 500;
        }else if(s == 'M'){
         
            return 1000 ;
        }else{
            
            return 0 ;
        }
    }
}


