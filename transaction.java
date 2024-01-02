class Buynow
{
  static java.util.Scanner sc=new java.util.Scanner(System.in);
     static Buynow obj=new Buynow();
     double amount=0;
     void upi(String upi)
     {
         if(upi.length()==14)
         {
             int c=0;
             for(int i=0;i<upi.length();i++)
             {
                 char ch=upi.charAt(i);
                 if((ch>='0' && ch<='9') ||ch=='@' || (ch>='a' && ch<='z'))
                 {
                     c++;
                 }
                 else
                 {
                     System.out.println("Invalid UPI ID");
                     System.out.print("Re-enter UPI ID : ");
                     obj.upi(sc.next());
                 }
             }
         }
         else
         {
               System.out.println("Invalid UPI ID");
               System.out.print("Re-enter UPI ID : ");
               obj.upi(sc.next());
         }
     }
                
    static double avaliable_balance1=1500.36;
    public double BOB(double amount)
    {
          System.out.print("enter UPI PIN:");
          obj.PIN(sc.nextInt());
          return avaliable_balance1-amount;
    }
    void PIN(int UPI_PIN)
    {
          int c2=0;
          while(UPI_PIN>0)
          {
                UPI_PIN=UPI_PIN/10;
                c2++;
          }
          if(c2==6)
          {
                 if(avaliable_balance1>=amount)
                 {
                        avaliable_balance1=avaliable_balance1-amount;
                        System.out.println("Payment Successfull");
                 }
                 else
                 {
                       System.out.println("Insufficient Balance");
                       System.out.println("Please Check your Balance");
                 }
                                         
          }
          else
          {
                  System.out.println("Invalid UPI PIN");
                  System.out.print("Re-Enter UPI PIN:");
                  obj.PIN(sc.nextInt());
          }
    }
     //_____________________________________________________________________________
       

      void Debit(String num)
      {
         
         int n=num.length();
         if(n==16)
         {
            System.out.print("exp date:");
            String exp=sc.next();
            System.out.print("CVV Number:");
            obj.CVV(sc.nextInt());
            
         }
         else
         {
            System.out.println("Invalid Card Number");
            System.out.println("Please Re-Enter your card Number");
            obj.Debit(sc.next());
         }
       }

       void CVV(int cv)
       {
           int c1=0;
           while(cv>0)
           {
                cv=cv/10;
                c1++;
           }
           if(c1==3)
           {
                System.out.print("enter amount:");
                this.amount=amount;
                System.out.println("your avaliable Balance:"+obj.SBI(sc.nextDouble()));
           }
           else
           {
                System.out.println("Invalid CVV Number");
                System.out.print("Please Re-Enter your CVV Number:");
                obj.CVV(sc.nextInt());
           }
      }
      static double avaliable_balance=2000.23;
      public double SBI(double amount)
      { 
            if(avaliable_balance>=this.amount)
            {
                  avaliable_balance=avaliable_balance-amount;
                  System.out.println("Payment Successfull");
            }
            else
            {
                   System.out.println("Insufficient Balance");
                   System.out.println("Please Check your Balance");
             }
            return avaliable_balance-amount;
      }
                     
   
      
 
    void payment()
    {
        System.out.println("1.UPI ID");
        System.out.println("2.Net Banking");
        System.out.println("3.Cash on Delivery");
        System.out.println("Please Select your Payment Option");
        int n=sc.nextInt(); 
        if(n==1)
        { 
            System.out.print("Enter UPI ID:");
            obj.upi(sc.next());
            System.out.print(i.selectedBookPrice());
            System.out.println("avaliable Balance:"+obj.BOB(sc.nextDouble()));
        }
        else if(n==2)
        {
             System.out.print("Enter your card number:");
             obj.Debit(sc.next());
        }
        else if(n==3)
        {
             System.out.println("your Order Will be Deliverd Within Two days");
        } 
   }
}