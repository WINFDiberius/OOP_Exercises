package org.campus02.thenewsocialmedia;

public class MayBeCreditCardNumber {
    private String creditCardNumber;
    private AccessRole neededAccessRole;

    public MayBeCreditCardNumber(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
        this.neededAccessRole = AccessRole.ExternalUser;
    }

    public void deliverValue(AccessRole accessor){
        switch (accessor){
            case Platform:
            case Self:
                System.out.println(creditCardNumber);
                break;
            case BestFriend:
            case RegistererdCustomer:
            case ExternalUser:
                System.out.println("forbidden");
                break;
            default:
                System.out.println("not allowed");

        }
    }
}
