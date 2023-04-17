import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 생일 입력받기
        System.out.print("생일을 입력하세요 (YYYY-MM-DD): ");
        String birthdayStr = scanner.nextLine();

        // 생일 문자열을 LocalDate 객체로 변환
        LocalDate birthday = LocalDate.parse(birthdayStr);

        // 칭호 생성기를 사용하여 칭호 생성
        String title = generateTitle(birthday);

        // 생성된 칭호 출력
        System.out.println("생성된 칭호: " + title);
    }

    // 생일을 바탕으로 칭호 생성하는 메서드
    public static String generateTitle(LocalDate birthday) {
        // 나이 계산하기
        Period period = Period.between(birthday, LocalDate.now());
        int age = period.getYears();

        // 분리자 가져오기
        String separator = getSeparator(birthday);

        // 칭호 생성하기
        String title = age + "살에 " + getKeyword() + " " + separator + " " + generateName();

        return title;
    }

    // 생일에 따라 적절한 분리자 반환하는 메서드
    public static String getSeparator(LocalDate birthday) {
        int month = birthday.getMonthValue();
        int day = birthday.getDayOfMonth();

        if (month % 2 == 0) { // 짝수 달
            if (day % 2 == 0) {
                return "-";
            } else {
                return ".";
            }
        } else { // 홀수 달
            if (day % 2 == 0) {
                return "/";
            } else {
                return "|";
            }
        }
    }

    // 공통 키워드를 랜덤하게 선택하는 메서드
    public static String getKeyword() {
        String[] keywords = {"곰을 잡은", "드래곤 처치", "늑대와 노래한", "요정과 친구한", "거미 퇴치", "전사의 길", "마법사의 새벽"};
        Random rand = new Random();
        return keywords[rand.nextInt(keywords.length)];
    }

    // 한글 이름 생성기
  public static String generateName() {
      String[] firstNames = {"수지", "태현", "은지", "현식", "서연", "준영", "혜린", "찬우", "유진", "건우", "지현", "승호", "예은", "성민", "은서", "지호", "다영", "태윤", "하늘", "현주"};
      String[] lastNames = {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "황", "문", "진", "송", "이", "고", "남", "배", "백", "오", "서", "홍", "나", "문"};
  
    // 랜덤으로 이름 생성하기
    Random rand = new Random();
    String firstName = firstNames[rand.nextInt(firstNames.length)];
    String lastName = lastNames[rand.nextInt(lastNames.length)];
    return lastName + firstName;
}
}