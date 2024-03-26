
    public class Circle{
        static double radius=3;
        public static final double PI = 3.1415926;
        //final指示常量，常量名一般大写，只能被赋值一次。
        //public表示其他类的方法也可以使用这个常量。
        //static final设置类常量。
        public static double circum(double radius){
            return 2*PI*radius;
        }
        public static void main(String[] args){
            double circum = circum(radius);
            System.out.println(circum);
        }

    }