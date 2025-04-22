package calculatorLv2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLv2 {
    public static void main(String[] args) {

        Calculator2 calculator2 = new Calculator2();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(3);
        //입력한 값을 스캐너가 받는다.

        while (true) {


            System.out.println("저는 계산기입니다!");
            System.out.println("계산에 필요한 첫 번째 숫자를 입력하세요.");
            int a = scanner.nextInt();
            System.out.println("사칙연산 기호를 입력하세요.");
            scanner.nextLine();

            char charAt = scanner.nextLine().charAt(0); //

            if ("+-*/".indexOf(charAt) == -1) {
               System.out.println("올바른 연산자를 입력해 주세요. (+, -, *, / 만 가능합니다)");
               continue;
            }
            System.out.println("계산에 필요한 두 번째 숫자를 입력하세요.");
            int b = scanner.nextInt();
            scanner.nextLine();




            int vopr = calculator2.validOperator(a,charAt,b); //


            System.out.println("결과 = " + vopr);
            arrayList.add ( vopr);

            System.out.println("계산을 끝내려면 exit 를 입력해주세요.");
            System.out.println("계산을 계속하려면 엔터를 쳐주세요.");
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }
        }

        arrayList.add(10);

    }


}




