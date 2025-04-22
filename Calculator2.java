package calculatorLv2;

public class Calculator2 {


        public int validOperator(int a, char operator, int b) {
              //결과값의 타입//메서드 이름 //매개변수들
            int result = 0;  //값을 넣어주려고 선언한것
            switch (operator) {
                case '+':
                    result = sum(a, b);
                    break;
                case '-':
                    result = sub(a, b);
                    break;
                case '*':
                    result = mul(a, b);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("0으로 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        throw new IllegalArgumentException("0으로 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                    }
                    result = div(a, b);

                default:
                    System.out.println("올바른 연산자를 입력해 주세요.");
                //    continue;

            }
                return result;

        }


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
        public int div(int a, int b) {
            int result = a / b;
            return result;
        }

}
