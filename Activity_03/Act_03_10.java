public class Act_03_10 {
    public static void main(String[] args) {
        // first one
        for(int i=1; i<=5; i++) {  
   
            for(int j=1; j<=i; j++) {   
                System.out.print(i);   
            }   
            System.out.println();  
        } 
        System.out.println();
        //second one
        for(int i=1; i<=5; i++) {  
   
            for(int j=1; j<=i; j++) {   
                System.out.print(j);   
            }   
            System.out.println();  
        } 
        System.out.println();
        //third one
        for(int i=1; i<=5; i++) {  
   
            for(int j=1; j<=i; j++) {   
                System.out.print("*");   
            }   
            System.out.println();  
        } 
        System.out.println(); 
        //fourth one
        for (int i=4; i>=0 ; i--) { 
            
            for (int j=0; j<=i; j++) {  

                System.out.print("*");  
            }  
  
            System.out.println();  
        }  
        System.out.println(); 
        //fifth one
        for (int z=1; z<=5; z++) {  

            for (int x=4; x>=z; x--) {  
  
                System.out.print(" ");  
            }    
            for (int y=1; y<=(2*z-1); y++ ) {   
            
                System.out.print("*");   
            }   
 
        System.out.println();   
}   
    
      

    }
    
}
