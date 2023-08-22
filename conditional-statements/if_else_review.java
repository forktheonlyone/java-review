public class if_else_review{
    public static void main(String[] args) {

        // num1값 20 양수 출력
        int num1 = 20;

        if (num1 > 0) {
            System.out.println("양수");
        }
        else {
            System.out.println("음수");
        }

        // num2 = 10 홀짝 출력
        int num2 = 10;
        if (num2 % 2 == 1) {
            System.out.println("홀수");
        }
        else {
            System.out.println("짝수");
        }

        // num3 = 0이고 음수도 양수도 아닌걸 출력하려면
        int num3 = 0;
        if (num3 > 0) {
            System.out.println("양수");
        }
        else if (num3 == 0) {
            System.out.println("0");
        }
        else {
            System.out.println("음수");
        }

        int score = 59; // 내 점수

        if (score == 100) { // 100점 만점중 100점
            System.out.println("S급"); // 100점 맞으면 S급임
        }
        else if (score >= 80) { // 80 ~ 99의 값을 기대 해볼수 있음
            System.out.println("A급"); // 80점
        }
        else if (score >= 60) { // 61 ~ 79의 값을 기대 해볼수 있음
            System.out.println("B급");
        }
        else { // 60 이하의 값
            System.out.println("꽝");
        }
    }
}