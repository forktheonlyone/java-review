public class time_test {
    public static void main(String[] args) {
        // 267930초를 일자, 시, 분, 초가 나오게 출력 하시오
        int sec = 267930 ;
        int min = sec / 60;
        int hour = min / 60;
        int day = hour / 24;

        sec %= 60;
        min %= 60;
        hour %= 24;


        System.out.println(day + "일" + hour + "시" + min + "분" + sec + "초");
    }
}