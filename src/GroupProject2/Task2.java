package GroupProject2;

public class Task2 {
        //We have to calculate the average of marks
        //obtained in three subjects by student A and by
        //student B. Create class 'Marks' with an abstract
        //method 'getPercentage' that will be returning
        //the average percentage of marks. Provide
        //implementation of abstract method in classes
        //'A' and 'B'. The constructor of student A takes the
        //marks in three subjects as its parameters and
        //the marks in four subjects as its parameters for
        //student B. Test your code
        public static void main(String[] args) {
            A obj = new A(98, 75, 88.75);
            System.out.println("The average of Student A's marks is " + obj.getPercentage());
            B obj2 = new B(75, 67, 88.5, 90);
            System.out.println("The average of Student B's marks is " + obj2.getPercentage());

        }
    }

    abstract class Marks {
        abstract double getPercentage();
    }

    class A extends Marks {
        double math;
        double science;
        double biology;

        public A(double math, double science, double biology) {
            this.math = math;
            this.science = science;
            this.biology = biology;
        }


        @Override
        double getPercentage() {
            double average;
            average = (math + science + biology) / 3;
            return average;
        }
    }

    class B extends Marks {
        double math;
        double science;
        double biology;
        double english;

        public B(double math, double science, double biology, double english) {
            this.math = math;
            this.science = science;
            this.biology = biology;
            this.english = english;
        }

        @Override
        double getPercentage() {
            double average;
            average = (math + science + biology + english) / 4;
            return average;
        }
    }



