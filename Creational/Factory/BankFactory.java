package Creational.Factory;

public class BankFactory {
    private BankFactory() {}

    public static Bank getBank(BankType bankType) {
        return switch (bankType) {
            case TPBANK -> new TPBank();
            case VIETCOMBANK -> new Vietcombank();
            default -> throw new RuntimeException("ERROR creating bank");
        };
    }
}


/*
in main method:

Bank bank = BankFactory.getBank(BankType.TPBANK);
System.out.println(bank.getBankName());



Eg: BeanFactory, SessionFactory
 */