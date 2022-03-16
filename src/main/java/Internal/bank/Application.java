package Internal.bank;

import Internal.bank.ui.BankApplicationForm;
import Internal.framework.ui.ApplicationFrm;

public class Application {
    public static void main(String[] args) {
        BankServiceAplication application = new BankServiceAplication();
        ApplicationFrm form = new BankApplicationForm();
        application.run(application, form);
    }

}
