package Internal.framework.controller.interest.interestCalculators;


import Internal.framework.module.Account;
import Internal.framework.module.InterestCalculator;

public class CompanySavingInterestCalculator extends InterestCalculator {

    @Override
    public double calculateInterest(Account account) {

        System.out.println("xxx");
        return handleInterest(account)*50;
    }

}
