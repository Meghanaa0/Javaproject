class Evil{
       public static void main(String args[])
        {
          int a=45;
          int b=(int)(Math.pow(a,2)); 
         int rem=0,sum=0;
          while(b!=0){
             rem=b%10;
             sum=sum+rem;
             b/=10;
        }  
        if(sum==a)
         System.out.println("evil number");
        else
          System.out.println("not a evil number");
}
}
 