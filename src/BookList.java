import java.util.ArrayList;
import java.util.List;

public class BookList {
    List<Book> mBookList = new ArrayList<>();

    public BookList() {
        this.mBookList.add(new Book("ISBN1234", "쉽게 배우는 JSP 웹프로그래밍", 3,
                "송미영", "단계별로 구현하여 배우는 JSP 프로그래밍", "IT전문서",
                "2018/10/08",10));
        this.mBookList.add(new Book("ISBN1235", "안드로이드 프로그래밍", 3, "우재남",
                "실습단계별 명확한 멘토링!", "IT전문서", "2022/01/22",10));

        this.mBookList.add(new Book("ISBN1236", "스크래치", 3, "고광일",
                "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터 입문", "2019/06/10",10));
        this.mBookList.add(new Book("ISBN1237", "Do it! 점프 투 파이썬", 3,
                "박응용", "초보자를 위한 파이썬 입문서", "프로그래밍", "2019/06/10",10));

        this.mBookList.add(new Book("ISBN1238", "모두의 자바", 3,
                "이승환", "처음 시작하는 자바 프로그래밍", "프로그래밍", "2019/02/01",10));

        this.mBookList.add(new Book("ISBN1239", "혼자 공부하는 C 언어", 3,
                "윤성우", "왕초보도 쉽게 배우는 C 언어 입문서", "프로그래밍", "2021/03/05",10));

        this.mBookList.add(new Book("ISBN1240", "클린 코드", 3,
                "로버트 C. 마틴", "좋은 코드를 작성하기 위한 원칙과 패턴", "소프트웨어 공학", "2013/12/24",10));

        this.mBookList.add(new Book("ISBN1241", "이펙티브 자바", 3,
                "조슈아 블로크", "자바 프로그래밍 베스트 프랙티스", "프로그래밍", "2018/10/10",10));

        this.mBookList.add(new Book("ISBN1242", "자바의 정석", 3,
                "남궁성", "국민 자바 입문서", "프로그래밍", "2016/12/10",10));

        this.mBookList.add(new Book("ISBN1243", "HTML+CSS+자바스크립트 웹 표준의 정석", 3,
                "윤인성", "웹 개발 필수 기술 완벽 가이드", "웹 개발", "2018/03/01",10));

        this.mBookList.add(new Book("ISBN1244", "Do it! 안드로이드 앱 프로그래밍", 3,
                "정재곤", "실전 예제로 배우는 앱 개발", "모바일 개발", "2021/07/20",10));

        this.mBookList.add(new Book("ISBN1245", "스프링 부트와 AWS로 혼자 구현하는 웹 서비스", 3,
                "이동욱", "스프링 실전 프로젝트", "백엔드 개발", "2020/09/01",10));

        this.mBookList.add(new Book("ISBN1246", "Do it! 자료구조와 함께 배우는 알고리즘 입문", 3,
                "천인국", "쉽게 배우는 알고리즘 기본기", "자료구조", "2021/02/10",10));

        this.mBookList.add(new Book("ISBN1247", "객체지향의 사실과 오해", 3,
                "조영호", "객체지향 개념을 근본부터 설명", "소프트웨어 공학", "2015/06/01",10));

        this.mBookList.add(new Book("ISBN1248", "리액트를 다루는 기술", 3,
                "김민준", "리액트 개발의 모든 것", "프론트엔드", "2020/08/01",10));

        this.mBookList.add(new Book("ISBN1249", "그림으로 배우는 HTTP & Network", 3,
                "우에노 센", "HTTP와 네트워크 기초 입문", "네트워크", "2017/07/01",10));

        this.mBookList.add(new Book("ISBN1250", "실용주의 프로그래머", 3,
                "앤드류 헌트, 데이비드 토머스", "현업 개발자를 위한 생존 전략", "개발 일반", "2020/01/03",10));

        this.mBookList.add(new Book("ISBN1251", "코틀린 인 액션", 3,
                "드미트리 제메레프", "코틀린으로 배우는 현대 자바", "프로그래밍", "2019/09/15",10));

        this.mBookList.add(new Book("ISBN1252", "러닝 SQL", 3,
                "앨런 비먼", "SQL 입문과 실전 사용법", "데이터베이스", "2018/11/20",10));

        this.mBookList.add(new Book("ISBN1253", "유니티 게임 프로그래밍", 3,
                "정종필", "게임 개발에 필요한 유니티 입문", "게임 개발", "2021/04/14",10));

        this.mBookList.add(new Book("ISBN1254", "코딩 인터뷰 완전 분석", 3,
                "게일 맥도웰", "면접을 위한 알고리즘 문제 풀이", "자료구조/알고리즘", "2019/01/25",10));

        this.mBookList.add(new Book("ISBN1255", "모던 자바스크립트 Deep Dive", 3,
                "이웅모", "자바스크립트 내부 동작 원리 해부", "프론트엔드", "2020/09/25",10));

        this.mBookList.add(new Book("ISBN1256", "인공지능 시대, 인간을 다시 묻다", 3,
                "김재인", "AI 시대 철학과 인간성에 대한 고찰", "인문·철학", "2019/12/01",10 ));

    }



    public List<Book> getBooks() {
        return mBookList;
    }
}
