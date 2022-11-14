package chapter8;

public class Convertation {
    public static void main(String[] args){
        convertDecimalToTheInt();
    }

    public static void convertDecimalToTheInt(){
        double[] numbers = {1.22, 3.66, 876.38, 99.0, 109.29};

        for(Double number : numbers){
            System.out.println(number.intValue());
        }
    }
}
