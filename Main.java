class Main {
    public static void main(String[] args) {
        // my_favorite_number = 42;
        // my_favorite_color = "blue";
        // 선언 + 대입 -> 초기화
        int myFavoriteNumber = 42;
        String myFavoriteColor = "blue";
        // 값을 변경
        // int myFavoriteNumber = 52;
        // 정의가 되었던 변수를 다시 타입을 주려고 시도했기 때문에 에러
        myFavoriteNumber = 52; // 다시 값을 주는 건 문제가 X
        System.out.println("My favorite number is " + myFavoriteNumber);
        System.out.println("My favorite color is " + myFavoriteColor);
    }
}
// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello World!");
//     System.out.println("Hello Playdata!");
//     System.out.println("Hello Java!");
//     System.out.println("Hello Python!");
//   }
// }