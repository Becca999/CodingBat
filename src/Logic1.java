public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend){
        return (isWeekend && cigars >= 40) || (cigars <= 60 && cigars >= 40);
    }
    public int dateFashion(int you, int date){
        if(you <= 2 || date <= 2) return 0;
        if(you >= 8 || date >= 8) return 2;
        return 1;
    }
    public boolean squirrelPlay(int temp, boolean isSummer){
        if(isSummer && temp <= 100 && temp >= 60) return true;
        return temp <= 90 && temp >= 60;
    }
    public int caughtSpeeding(int speed, boolean isBirthday){
        if(isBirthday){
            if(speed <= 65) return 0;
            if(speed >= 86) return 2;
            return 1;
        }
        if(speed <= 60) return 0;
        if(speed >= 81) return 2;
        return 1;
    }
    public int sortaSum(int a, int b){
        int sum = a + b;
        if(sum <= 19 && sum >= 10) return 20;
        return sum;
    }
    public String alarmClock(int day, boolean vacation){
        if (vacation){
            if(day == 6 || day == 0){
                return "off";
            }
            return "10:00";
        }
        if(day == 6 || day == 0) return "10:00";
        return "7:00";
    }
    public boolean love6(int a, int b){
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }
    public boolean in1To10(int n, boolean outsideMode){
        if(outsideMode) return n <= 1 || n >= 10;
        return n <= 10 && n >= 1;
    }
    public boolean specialEvent(int n){
        return n % 11 == 0 || n % 11 == 1;
    }
    public boolean more20(int n){
        return n % 20 == 1 || n % 20 == 2;
    }
    public boolean old35(int n){
        if(n % 3 == 0 && n % 5 == 0) return false;
        return n % 3 == 0 || n % 5 == 0;
    }
    public boolean less20(int n){
        return n % 20 == 18 || n % 20 == 19;
    }
    public boolean nearTen(int num){
        return num % 10 <= 2 || num % 10 >= 8;
    }
    public int teenSum(int a, int b){
        if(a <= 19 && a >= 13) return 19;
        if(b <= 19 && b >= 13) return 19;
        return a + b;
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isAsleep) return false;
        return isMom || !isMorning;
    }
    public int teaParty(int tea, int candy){
        if(tea < 5 || candy < 5) return 0;
        if(tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;
    }
    public String fizzString(String str){
        String str1 = "";
        if(str.startsWith("f")){
            str1 += "Fizz";
        }
        if(str.endsWith("b")){
            str1 += "Buzz";
        }
        if(str1.isEmpty()) return str;
        return str1;
    }
    public String fizzString2(int n){
        boolean three = n % 3 == 0;
        boolean five = n % 5 == 0;
        if(three && five) return "FizzBuzz!";
        if(three) return "Fizz!";
        if(five) return "Buzz!";
        return n + "!";
    }
    public boolean twoAsOne(int a, int b, int c){
        int sumAB = a + b;
        int sumAC = a + c;
        int sumBC = b = c;
        return sumAB == c || sumAC == b || sumBC == a;
    }
    public boolean inOrder(int a, int b, int c, boolean bOk){
        if(bOk) return c > b;
        return b > a && c > b;
    }
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
        if(equalOk) return a <= b && b <= c;
        return a < b && b < c;
    }
    public boolean lastDigigt(int a, int b, int c){
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;
        return aLast == bLast || aLast == cLast || bLast == cLast;
    }
    public boolean lessBy10(int a, int b, int c){
        boolean aB = Math.abs(a -b) >= 10;
        boolean bC = Math.abs(b - c) >= 10;
        boolean aC = Math.abs(a - c) >= 10;
        return aB || bC || aC;
    }
    public int wihtoutDoubles(int die1, int die2, boolean noDoubles){
        if(noDoubles && die1 == die2) {
            if (die1 == 6 || die2 == 6) {
                die1 = 1;
            } else {
                die1 += 1;
            }
        }
        return die1 + die2;
    }
    public int maxMod5(int a, int b){
        if(a == b) return 0;
        int aRem = a % 5;
        int bRem = b % 5;
        if(aRem == bRem) return Math.min(a, b);
        return Math.max(a, b);
    }
    public int redTicket(int a, int b, int c){
        if(a == 2 && b == 2 && c == 2) return 10;
        if(a == b && b == c) return 5;
        if(a != b && a != c) return 1;
        return 0;
    }
    public int greenTicket(int a, int b, int c){
        if (a == b && b == c) return 20;
        if(a == b || b == c || a == c) return 10;
        return 0;
    }
    public int blueTicket(int a, int b, int c){
        int aB = a + b;
        int bC = b + c;
        int aC = a + c;
        if(aB == 10 || bC == 10 || aC == 10) return 10;
        if(aB == (bC + 10) || aB == (aC + 10)) return 5;
        return 0;
    }
    public boolean shareDigit(int a, int b){
        int aRight = a % 10;
        int aLeft = a / 10;
        int bRight = b % 10;
        int bLeft = b/ 10;
        return aRight == bRight || aRight == bLeft || aLeft == bRight || aLeft == bLeft;
    }
    public int sumLimit(int a, int b){
        int sum = a + b;
        int sumLen = String.valueOf(sum).length();
        int aLen = String.valueOf(a).length();
        if(sumLen > aLen) return a;
        return sum;
    }
}
