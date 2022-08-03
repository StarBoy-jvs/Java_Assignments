

public class patternAssignment {
    
    
   

   public static void FirstPattern(int n){
    for(int i=1;i<n;i++){
        for(int j =1;j<n;j++){
            System.out.print(i);
        }
        System.out.println(" ");

    }
   }

   public static void secondPattern(int n){

    for(int i=0;i<n;i++){
        for(int j =0;j<n;j++){
            if(i==0 || i==n-1 || j==0 || j== n-1 || i<=(n/2)-j || j>=((n-1)/2)+i)
           
                System.out.print('*');
            else
                System.out.print(" ");
        }
        System.out.println(" ");

    }

   }
   public static void fourthPattern(int n){

    for(int i=0;i<n;i++){
        for(int j =0;j<n;j++){
            // if(i==0 || i==n-1 || j==0 || j== n-1 || i<=(n/2)-j || j>=((n-1)/2)+i)
            if(i==0 || i==n-1 || j==0 || i>=(n/2)+j || j<=((n-1)/2)-i)
                System.out.print('*');
            else
                System.out.print(" ");
        }
        System.out.println(" ");

    }

   }


   public static void thirdPattern(int n){

    for(int i=0;i<n;i++){
        for(int j =0;j<n;j++){
            if(i==n-1  || i-j>=6 || i+j>=19)
           
                System.out.print('*');
            else
                System.out.print(" ");
        }
        System.out.println(" ");

    }

   }   

    public static void main(String[] args){
        FirstPattern(5);
        System.out.println("");
        secondPattern(14);
        System.out.println("");
        thirdPattern(14);
        System.out.println("");
        fourthPattern(14);

}
}
