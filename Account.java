public class Account extends BaseAccount{

    public static Account create(int IN,int OUT){
        if(IN<0){
            throw new IllegalArgumentException("Пересмотрите ваши действия ");
           
        }
        if (OUT>IN){
            throw new IllegalArgumentException("Ошибка:не достаточнро средств ");
           
        }
        return new Account(IN,OUT);

        // public Account(int IN,int OUT){
            
        // }
    }

    public Account(int IN, int OUT) {
        super(IN, OUT);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void printInfo() {
       System.out.println(this);
        
    }

   

   

    
    
  
    
   

    
    
}
