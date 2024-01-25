class Prime{
      public static void main(String args[]){
        int a=2,b=11,c=0;
         while(a<b){
              
              if(b%a==0){
                    c++;
              }
            a++;
           }
         if(c==0)
             System.out.println("Prime");
         else
            System.out.println("Not prime");
     }
}
              
             