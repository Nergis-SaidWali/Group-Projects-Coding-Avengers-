package GroupProject2;

public class Task1 {
        //Create an Interface 'Shape' with undefined
        //methods as calculateArea and
        //calculatePerimeter. Create 2 classes Circle &
        //Square that implements functionality defined in
        //the Shape Interface. Test your code.
        public static void main(String[] args) {
            Circle obj=new Circle();
            obj.calculateArea(5.5);
            obj.calculatePerimeter(8);

            Square obj2=new Square();
            obj2.calculateArea(7.5);
            obj2.calculatePerimeter(11);
        }
    }
    interface Shape{
        void calculateArea(double a);
        void calculatePerimeter(int b);
    }
    class Circle implements Shape{

        @Override
        public void calculateArea(double a) {
            System.out.println("The area of circle is "+Math.PI*a*a);
        }

        @Override
        public void calculatePerimeter(int b) {
            System.out.println("The perimeter of circle is "+2*Math.PI*b);
        }
    }
    class Square implements Shape{

        @Override
        public void calculateArea(double a) {
            System.out.println("The area of square is "+a*a);
        }

        @Override
        public void calculatePerimeter(int b) {
            System.out.println("The perimeter of square is "+4*b);
        }
    }




