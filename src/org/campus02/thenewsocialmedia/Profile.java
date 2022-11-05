package org.campus02.thenewsocialmedia;

public class Profile {
    private String eMail;
    private int age;
    private String fullName;
    private MayBe<String> creditCardNumber;
    private MayBe<Double> salary;

    private Profile bestFriend;

    public Profile(String eMail, int age, String fullName, String creditCardNumber, double salary) {
        this.eMail = eMail;
        this.age = age;
        this.fullName = fullName;
            this.creditCardNumber = new MayBe(creditCardNumber);
        this.salary = new MayBe<Double>(salary);
    }

    public void printPublicPage(AccessRole role){
        System.out.println("My profile");
        System.out.println("eMail = " + eMail);
        if(role == AccessRole.BestFriend || role == AccessRole.Self){
            System.out.println("age = " + age);
        }
        System.out.println("fullName = " + fullName);
        if (role == AccessRole.Platform || role == AccessRole.Self){
            System.out.println("creditCardNumber = " + creditCardNumber);
        }

        /*if (role == AccessRoles.Platform || role == AccessRole.Self){
             System.out.println("creditCardNumber = " + creditCardNumber);
         }*/

        creditCardNumber.deliverValue(role);

        System.out.println("salary = " + salary);
        System.out.println("bestFriend = " + bestFriend);
    }



    @Override
    public String toString() {
        return "Profile{" +
                "eMail='" + eMail + '\'' +
                ", age=" + age +
                ", fullName='" + fullName + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", salary=" + salary +
                ", bestFriend=" + bestFriend +
                '}';
    }

    public void setBestFriend(Profile bestFriend){
        this.bestFriend = bestFriend;
    }
}
