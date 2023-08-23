public class todayreview0823 {
    public static void main(String[] args) {
        // 20 양수 출력
        int num1 = 20;

        if(num1 > 0)
        {
            System.out.println("양수입니다.");
        }
        else
        {
            System.out.println("음수입니다.");
        }

        // 19 홀짝 출력
        int num2 = 19;

        if (num2%2 == 0)
        {
            System.out.println("짝수");
        }
        else
        {
            System.out.println("홀수");
        }

        // 150초 분 초로 나타내기
        int sec = 150;
        int min = sec / 60;

        sec %= 60;
        // sec을 60과 나눈후 그 나머지값을 sec에 대입함
        // 대입 = 덮어쓰기
        System.out.println(min + "분" + sec + "초");

        //267930초를 일 시 분 초로 나타내기
        int sec1 = 267930;
        int min1 = sec1 / 60;
        int hor1 = min1 / 60;
        int day1 = hor1 / 24;

        sec1 %= 60;
        min1 %= 60;
        hor1 %= 24;

        System.out.println(day1 + "일 " + hor1 + "시 " + min1 + "분 " + sec1 + "초 ");

        //===========================================================
        // 오늘자 복습
        // 구구단을 2단부터 9단까지 출력 하시오.

        for (int i = 2 ; i <= 9 ; i++) // i단
        {
            System.out.println(i + "단"); // i단 출력
            for (int j = 1 ; j <=9 ; j++) // i x "j" 단 코드
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            } // i단이 출력됩니다. / i x j = ij
        }

        // switch문
        // 1월일때 1월이라고 출력되게 하시오.
        int month = 1;

        switch(month)
        {
            case 1:
                System.out.println(month + "월");
                break;
            case 2:
                System.out.println(month + "월");
                break;
            case 3:
                System.out.println(month + "월");
                break;
            case 4:
                System.out.println(month + "월");
                break;
            case 5:
                System.out.println(month + "월");
                break;
            case 6:
                System.out.println(month + "월");
                break;
            case 7:
                System.out.println(month + "월");
                break;
            case 8:
                System.out.println(month + "월");
                break;
            case 9:
                System.out.println(month + "월");
                break;
            case 10:
                System.out.println(month + "월");
                break;
            case 11:
                System.out.println(month + "월");
                break;
            case 12:
                System.out.println(month + "월");
                break;
            default:
                System.out.println("오류");
        }
/*
        //서점
        //판타지,부동산
        //로맨스,에세이
        //경매,중매

        int fan = 0;
        int house = 0;

        switch(house)
        {
            case 0:
                switch(fan)
                {
                    case 0:
                        System.out.println("로맨스");
                        break;
                    case 1:
                        System.out.println("용의 전설");
                        break;
                }
                break;
            case 1:
                switch(house)
                {
                    case 0:
                        System.out.println("경매");
                        break;
                    case 1:
                        System.out.println("중개");
                        break;
                }
                break;
        } // 실패
        */
        // 상황에 따라 적시적소 리액션이 나오는걸 출력하시오.
        // 현재 상황 행복함
        int angry = 1;
        int sad = 2;
        int happy = 3;
        int funny = 4;

        if(angry == 0)
        {
            System.out.println("달래주기");
        }
        else if(sad == 0)
        {
            System.out.println("같이울기");
        }
        else if(happy == 3)
        {
            System.out.println("더행복하게해줌");
        }
        else if(funny == 0)
        {
            System.out.println("같이웃기");
        }
        else
        {
            System.out.println("여자의 마음은 모르겠다 ..");
        }


    }
}
