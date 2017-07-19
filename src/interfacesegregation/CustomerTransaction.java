package interfacesegregation;

import java.util.Date;
import java.util.List;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String productBreakDown() {
        String reportListing = null;
        for (Product product: products) {
            reportListing += product.getProductName();
        }
        return reportListing;
    }

    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepare...");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charged the customer");
    }
 }
