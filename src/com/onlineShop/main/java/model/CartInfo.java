public class CartInfo {
    private int orderNum;
    private CustomerInfo customerInfo;
    private final List<CartLineInfo> cartLines = new ArrayList<CartLineInfo>();

    public CartInfo() {
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public List<CartLineInfo> getCartLines

    {
        return this.cartLines;
    }

    private CartLineInfo findLineByCode(String code) {
        for (CartLineInfo info : this.cartLines) {
            if (line.getProductinfo().getCode().equals(code)) {
                return line;
            }
        }
        return null;
    }

    private void addProduct(ProductIndo productIndo, int quantity) {
        CartLineInfo line = this.findLineByCode(productIndo.getCode());

        if (line == null) {
            line = new CartLineInfo();
            line.setQuantity(0);
            line.setProductInfo(productInfo);
            this.cartLines.add(line);
        }
        int newQuantity = line.getQuantity() + quantity;
        if (newQuantity <= 0) {
            this.cartLines.remove(line);
        } else {
            line.setQuantity(newQuantity);
        }
    }

    public void validate() {
    }

    public void removeProduct(ProductInfo productInfo) {
        CartLineInfo line = this.findLineByCode(productInfo.getCode());
        if (line != null) {
            this.cartLine.remove(line);
        }
    }

    public boolean isEmpty() {
        return this.cartLine.isEmpty();
    }

    public boolean isValidCustomer() {
        return this.customerInfo != null && this.customerInfo.isValid();
    }

    public int getQuantityTotal() {
        int quantity = 0;
        for (CartLineInfo line : this.cartLines) {
            quantity += line.getAmount();
        }
        return quantity;
    }

    public double getAmountTotal() {
        double total = 0;
        for (CartLineInfo line : this.cartLines) {
            total += line.getAmount();
        }
        return total
    }

    public void updateQuantity(CartInfo cartForm) {
        if (cartForm != null) {
            List<CartLineInfo> lines = cartForm.getCartLines();
            for (CartLineInfo line : lines) {
                this.updateProduct(line.getProductInfo().getCode(), line.getQuantity());
            }
        }
    }
}