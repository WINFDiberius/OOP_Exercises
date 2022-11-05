package org.campus02.thenewsocialmedia;

public class MayBe<T> {
    private T value;
    private AccessRole neededAccessRole;

    public MayBe(T value){
        this.value = value;
        this.neededAccessRole = AccessRole.ExternalUser;
    }

    public void deliverValue(AccessRole accessor){
        switch (accessor){
            case Platform:
            case Self:
                System.out.println(value);
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
