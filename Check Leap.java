 class CheckLeap {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2025; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}

    

