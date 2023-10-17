package ra.presentation;

import ra.business.model.Catalog;
import ra.business.service.ICatalogService;
import ra.business.serviceimpl.CatalogService;
import ra.business.validate.Validate;

import java.util.Scanner;

public class ShopManagement {
    public static final ICatalogService catalogService = new CatalogService();
    public static ProductManagement productManagement = new ProductManagement();
    public static void main(String[] args) {

//        while (true){
//            System.out.println("==================SHOP================");
//            System.out.println("1. Quản lí danh mục");
//            System.out.println("2. Quản lí sản phẩm");
//        }
//        productManagement.run();
        System.out.println("Hãy nhập tên sản phẩm");
        String productName;
        while (true) {
            productName = new Scanner(System.in).nextLine();
            if (Validate.checkProductName(productName)){
                break;
            }
            System.err.println(Validate.ERROR_PRODUCT_NAME);
        }
        System.out.println("Nhập vào số lượng");
        int stock = Validate.getProductStock(new Scanner(System.in));

        // khởi tạo đối tượng qua constructorr
        Catalog catalog = new Catalog();
    }
}
