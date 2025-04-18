package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        //입력한 값을 스캐너가 받는다.



        System.out.println("저는 계산기입니다!");
        System.out.println("계산에 필요한 첫 번째 숫자를 입력하세요.");
        int a = scanner.nextInt();
        System.out.println("사칙연산 기호를 입력하세요.");
        scanner.nextLine();
        String operator = scanner.nextLine();
        System.out.println("계산에 필요한 두 번째 숫자를 입력하세요.");
        int b = scanner.nextInt();


        int result = switch (operator) {
            case "+" -> calculator.sum(a, b);
            case "-" -> calculator.sub(a, b);
            case "*" -> calculator.mul(a, b);
            case "/" -> calculator.div(a, b);
            default -> 0;
        };


        System.out.println("결과 = " +result);
    }
}

//에러처리,반복문,for while문 자바로 검색..if 깃 이그노어



class Calculator {
    //////
    /// 계산기 ..
    /// n + n ,n-n 이런식으로 작동..?
    ///
    /// exit을 사용
    /// 결과값을 기록 하는 컬렉션
    /// 컬렉션의 가장 먼저 저장된 데이터 삭데하는기능
    ///
    // 1.속성


    //2. 생성자



    //3. 기능

//0 금지 코드


    //더하기
    public int sum(int a, int b) { //a,b를 주면 sum라는 메소드가 작동되고 결과값으로 int타입의 값을 리턴해줌
        int result = a + b;
        return result;
    }
    //빼기
    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }
    //곱하기
    public int mul(int a, int b) {
        int result = a * b;
        return result;

    }
    //나누기
    public int div(int a,int b){
        int result = a / b;
        return result;
    }

}
