package org.anup.structural.adapter.Bank;

import org.anup.structural.adapter.Bank.icicibank.ICICIBank;

// converts the interface of a class into another interface that a client wants.
// provide the interface according to client requirement while using the services of a class with a different interface.
public class ICICIAdapter implements BankAPI {
    private ICICIBank iciciBank = new ICICIBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
