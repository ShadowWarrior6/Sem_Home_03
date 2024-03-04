/**
 * Программа должна позволять пользователю вводить начальный баланс счета, сумму депозита и сумму снятия средств. При этом она
 *  должна обрабатывать следующие исключительные ситуации:

Попытка создать счет с отрицательным начальным балансом должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
Попытка внести депозит с отрицательной суммой должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
Попытка снять средства, сумма которых превышает текущий баланс, должна вызывать исключение InsufficientFundsException с сообщением 
о недостаточных средствах и текущим балансом.

Продемонстрируйте работу вашего приложения:
Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.
 */

public  abstract class  BaseAccount{
   // protected int Start;

    public int IN;

    public int OUT;

   


      

        public BaseAccount(int IN, int OUT){
            this.IN=IN;
            this.OUT=OUT;
            
        }

        // public int getStart() {
        //     return Start;
        // }
    
    
        // public void setStart(int Start) {
        //     this.Start = Start;
        // }


    public int getIN() {
        return IN;
    }

    public void setIN(int iN) {
        IN = iN;
    }

    public int getOUT() {
        return OUT;
    }

    public void setOUT(int oUT) {
        OUT = oUT;
    }


    // public void Start(int Start){
    //     if (Start<0){
    //         throw new IllegalArgumentException("Отрицательный баланс не может быть создан ");
    //     }
    //     else{
    //         System.out.println(Start);
    //     }
    //     this.Start=Start;
       
    // }

    // public void InCashe(int IN){
    //     if (IN<0){
    //         throw new IllegalArgumentException("Пересмотрите ваши действия ");
    //     }
       
    //     this.IN=IN;
    // }
    
    // public void OutCash(int OUT){
    //     if(OUT>IN){
    //         throw new IllegalArgumentException("Ошибка:не достаточнро средств ");

    //     }
    //     this.OUT=OUT;
    // }
    public abstract void printInfo();


   

    



}