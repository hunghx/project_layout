package ra.business.validate;

import java.util.Scanner;

public class Validate {
    public static final String ERROR_PRODUCT_NAME ="không hợp lê vui lòng thử lại";
    public static final String NUMBER_FORMAT_ERROR ="nhập không đúng định dạng";
    public static final String NUMBER_POSITIVE ="Bạn phải nhập 1 số nguyên dương";
    public static  boolean checkProductName(String productName){
        return !productName.trim().isEmpty();
    }
    public static int getProductStock(Scanner sc){
        while (true){
            try{
                int  stock = Integer.parseInt(sc.nextLine());
                if(stock>=0){
                    return stock;
                }
                System.err.println(NUMBER_POSITIVE);
            }catch (NumberFormatException e){
                System.err.println(NUMBER_FORMAT_ERROR);
            }
        }
    }
}
