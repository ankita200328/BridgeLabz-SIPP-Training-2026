package CouponValidator;

public class ShoppingCart implements ICouponValidator{
    @Override
    public boolean  couponValidator(String code){
        return ICouponValidator.isLength(code) &&
///               code.equalsIgnoreCase().startsWith("SAVE");
                code.toUpperCase().startsWith("SAVE");
    }


//    static boolean isLength(String code){
//
//    }
}
