interface DiscountRate {
    double getServiceDiscountRate(String type);
    double getProductDiscountRate(String type);
}

class Sale implements DiscountRate {
    private Customer customer;
    private double serviceDiscountRate;
    private double productDiscountRate;

    public Sale(Customer customer) {
        this.customer = customer;
        this.serviceDiscountRate = getServiceDiscountRate(customer.getType());
        this.productDiscountRate = getProductDiscountRate(customer.getType());
    }

    public double getServiceDiscountRate(String type) {
        return customer.getServiceDiscountRate(type);
    }

    public double getProductDiscountRate(String type) {
        return customer.getProductDiscountRate(type);
    }

    public double getServiceDiscount(double amount) {
        return amount * serviceDiscountRate;
    }

    public double getProductDiscount(double amount) {
        return amount * productDiscountRate;
    }
}

class Customer {
    private String type;

    public Customer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class PremiumCustomer extends Customer {
    public PremiumCustomer() {
        super("Premium");
    }

    @Override
    public double getServiceDiscountRate(String type) {
        return 0.20;
    }

    @Override
    public double getProductDiscountRate(String type) {
        return 0.10;
    }
}

class GoldCustomer extends Customer {
    public GoldCustomer() {
        super("Gold");
    }

    @Override
    public double getServiceDiscountRate(String type) {
        return 0.15;
    }

    @Override
    public double getProductDiscountRate(String type) {
        return 0.10;
    }
}

class SilverCustomer extends Customer {
    public SilverCustomer() {
        super("Silver");
    }

    @Override
    public double getServiceDiscountRate(String type) {
        return 0.10;
    }

    @Override
    public double getProductDiscountRate(String type) {
        return 0.10;
    }
}

class NormalCustomer extends Customer {
    public NormalCustomer() {
        super("Normal");
    }

    @Override
    public double getServiceDiscountRate(String type) {
        return 0.0;
    }

    @Override
    public double getProductDiscountRate(String type) {
        return 0.0;
    }
}
