package org.campus02.thenewsocialmedia;

public class SocialNetworkApp {
    public static void main(String[] args) {

        Profile susi = new Profile("susi.sorglos@test.com",29,"Susi Sorglos","561213051235040",3900);

        susi.printPublicPage(AccessRole.Self);

        Profile max = new Profile("max.mustermann@test.com",31,"Max Mustermann","23413935939591395",2880);

        max.printPublicPage(AccessRole.BestFriend);

        susi.setBestFriend(max);

        susi.printPublicPage(AccessRole.BestFriend);

        susi.printPublicPage(AccessRole.RegistererdCustomer);
    }

}
