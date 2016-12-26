package order;

import enums.FlowerFactory;
import factory.BirthdayBucket;
import factory.FuneralBucket;
import factory.WeddingBucket;


public class OrderFactory {
    public Order getBucket(FlowerFactory bucket){
        Order order = new Order();
        if(bucket == FlowerFactory.FUNERAL){
            order.addItem(new FuneralBucket());

        }
        else if (bucket == FlowerFactory.WEDDING){
            order.addItem(new WeddingBucket());
        }
        else {
            order.addItem(new BirthdayBucket());
        }
        return order;
    }


    public static void main(String[] args) {
        OrderFactory factory = new OrderFactory();
        System.out.println(factory.getBucket(FlowerFactory.BIRTHDAY).toString());
    }
}
