package Three_Oops;

public class BoxPrice extends BoxWeight{

    float price;

    public BoxPrice(double l, double w, double h, double weight, float price) {
        super(l,w,h,weight);
        this.price = price;
    }
}
