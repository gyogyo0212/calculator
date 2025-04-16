package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        //입력한 값을 스캐너가 받는다.



        System.out.println("저는 계산기입니다!");
        System.out.println("필요한 계산을 입력하세요!");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.nextLine();

        int result = 0;

        if (operator.equals("+")) {
            result = calculator.sum(a, b);
        }else if (operator.equals("-")) {
            result = calculator.sub(a,b);
        }else if(operator.equals("*")) {
            result = calculator.mul(a,b);
        }else if(operator.equals("/")) {
            result = calculator.div(a,b);
        }



        System.out.println("결과 = " +result);
    }
}

//에러처리,반복문,for while문 자바로 검색..if 깃 이그노어