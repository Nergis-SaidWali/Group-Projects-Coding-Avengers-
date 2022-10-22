package GroupProject2;

public class Task3 {
        //Create a Class Car that would have the
        //following fields: carPrice and color and method
        //calculateSalePrice() which should be returning
        //a price of the car.
        //Create 2 sub classes: Sedan and Truck. The Truck
        //class has a field as weight and has its own
        //implementation of calculateSalePrice() method
        //in which returned price is calculated as
        //following: if weight>2000 then returned price
        //car should include 10% discount, otherwise 20%
        //discount.
        //The Sedan class has field as length and also
        //does it is own implementation of
        //calculateSalePrice(): if length of sedan is >20
        //feet then returned car price should include 5%
        //discount, otherwise 10% discount
        public static void main(String[] args) {
            Sedan obj=new Sedan(36600, "blue", 14.7);
            System.out.println(obj.calculateSalePrice(36600));
            Truck obj2=new Truck(180000, "red", 35000);
            System.out.println(obj2.calculateSalePrice(180000));
        }
    }
    class Car{
        double carPrice;
        String color;
        Car(double carPrice, String color){
            this.carPrice=carPrice;
            this.color=color;
        }

        double calculateSalePrice(int carPrice){
            return carPrice;
        }
    }
    class Sedan extends Car{
        double length;

        Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length=length;
        }

        double calculateSalePrice(double price){
            if(length>20){
                price = price - ((price / 100) * 5);
            }else {
                price = price - ((price / 100) * 10);
            }
            return price;
        }
    }
    class Truck extends Car {
        double weight;

        Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        double calculateSalePrice(double price) {
            if (weight > 2000) {
                price = price - ((price / 100) * 5);
            } else {
                price = price - ((price / 100) * 10);
            }
            return price;
        }
    }


