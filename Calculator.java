package calculator;

public class Calculator {
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
