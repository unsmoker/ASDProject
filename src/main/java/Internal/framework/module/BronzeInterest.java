package Internal.framework.module;

public class BronzeInterest extends InterestCalculator {


    @Override
    public double calculateInterest(Account account) {

        return handleInterest(account)* 0.3;
    }

}
