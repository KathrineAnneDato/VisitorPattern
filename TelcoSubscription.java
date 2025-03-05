public interface TelcoSubscription {

    String accept(UsagePromo promo, double price);
    String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
    String getTelcoName();
    int getDataAllowance(); 
    double getPromoPrice();
    boolean getUnliCallText();

}