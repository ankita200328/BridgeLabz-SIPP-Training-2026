class InsufficientBalanceException  extends Exception{
    double balance;
    double WithdrawAmount;
    public InsufficientBalanceException(double balance,double WithdrawAmount){
        this.Balance=balance;
        this.WithdrwaAmount=withdrawAmount;
    }
    @Override
    public String getMessage(){
        return "Insufficient Balance!\n Balance Amount:-" +Balance+"\nWithdraw Amount:-" +withdrawAmount;
    }

}


