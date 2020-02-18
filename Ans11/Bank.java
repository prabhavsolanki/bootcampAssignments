package assignment.Ans11;

//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,print details of every banks

public class Bank {
    Double rateOfInterest;
    String bankName;
    int numberOfAccounts;

    void getDetails(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Number of Accounts: " + numberOfAccounts);
    }
}

class SBI extends Bank {
    SBI(Double rateOfInterest, String bankName, int numberOfAccounts) {
        this.rateOfInterest = rateOfInterest;
        this.bankName = bankName;
        this.numberOfAccounts = numberOfAccounts;
    }
}

class BOI extends Bank {
    BOI(Double rateOfInterest, String bankName, int numberOfAccounts) {
        this.rateOfInterest = rateOfInterest;
        this.bankName = bankName;
        this.numberOfAccounts = numberOfAccounts;
    }
}

class ICICI extends Bank {
    ICICI(Double rateOfInterest, String bankName, int numberOfAccounts) {
        this.rateOfInterest = rateOfInterest;
        this.bankName = bankName;
        this.numberOfAccounts = numberOfAccounts;
    }
}

class driver {
    public static void main(String[] args) {
        SBI sbi = new SBI(6.25, "State Bank Of India", 83256);
        System.out.println("\nSBI bank details: ");
        sbi.getDetails();
        BOI boi = new BOI(6.50, "Bank Of India", 43856);
        System.out.println("\nBOI bank details: ");
        boi.getDetails();
        ICICI icici = new ICICI(7.10, "Industrial Credit and Investment Corporation of India", 800478);
        System.out.println("\nICICI bank details: ");
        icici.getDetails();
    }
}
