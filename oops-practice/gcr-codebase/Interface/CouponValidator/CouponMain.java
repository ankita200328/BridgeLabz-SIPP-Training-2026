package CouponValidator;

public class CouponMain {
    public oublic static void main(String [] args){
        String [] coupons= {
                "Save123",
                ""
        };

        ICouponValidator val = new ShoppingCart();
        for(String coupon : coupons){
            if(val.couponValidator(coupon)){
                System.out.println("valid");
            } else{
                System.out.println("not valid");
            }
        }

    }
}
