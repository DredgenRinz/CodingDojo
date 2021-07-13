package com.vargas.bank;
import java.lang.Math;

public class BankAccount{
    private String accountNumber = "";
    private double currentAccBal = 0;
    private double savingsAccBal = 0;

    static int accountsCreated = 0;
    static  double totalBalance = 0;

    public BankAccount(){
        this.accountNumber = createAccNum();
        accountsCreated++;
    }

    private String createAccNum(){
        String temp = "";

        for(int i = 0; i < 10; i++){
            temp += (int) Math.random() * 10;
        }
        return temp;
    }

    public double getCurrentbal(){
        return this.currentAccBal;
    }
    public double getSavingsBal(){
        return this.savingsAccBal;
    }
    public void depotCurrent(double money){
        this.currentAccBal += money;
        totalBalance += money;
    }
    public void depotSavings(double money){
        this.savingsAccBal += money;
        totalBalance += money;
    }
    public boolean withdrawCurrent(double get){
        if(get < this.currentAccBal){
            this.currentAccBal -= get;
            return true;
        }
        return false;   
    }
    public boolean withdrawSavings(double get){
        if(get < this.currentAccBal){
            this.savingsAccBal -= get;
            return true;
        }
        return false;   
    }

    public void showBalance(){
        System.out.println("Cuenta número: " + this.accountNumber);
        System.out.println("Saldo cuenta Corriente: " + this.currentAccBal);
        System.out.println("Saldo Cuenta de ahorro: " + this.savingsAccBal);
    }
}