public class Logic2 {
    public boolean makeBricks(int small, int big, int goal){
        if(big * 5 + small < goal) return false;
        return goal % 5 <= small;
    }
    public int loneSum(int a, int b, int c){
        int sum = 0;
        if(a != b && a != c) sum += a;
        if(b != a && b!= c) sum += b;
        if(c != a && c != b) sum += c;
        return sum;
    }
    public int luckySum(int a, int b, int c){
        int sum = 0;
        if(a != 13) sum += a;
        if(b != 13 && a != 13) sum += b;
        if(c != 13 && b != 13 && a != 13) sum += c;
        return sum;
    }
    public int noTeenSum(int a, int b, int c){
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    public int fixTeen(int n){
        if(n >= 13 && n <= 19 && n != 15 && n != 16) return 0;
        return n;
    }
    public int roundSum(int a, int b, int c){
        return round10(a) + round10(b) + round10(c);
    }
    public int round10(int sum){
        int sum1 = sum % 10;
        if(sum1 < 5) return sum - sum1;
        return sum + Math.abs(sum1 - 10);
    }
    public boolean closeFar(int a, int b, int c){
        boolean b1 = Math.abs(a - b) <= 1;
        boolean c1 = Math.abs(a - c) <= 1;
        boolean c2 = Math.abs(b - c) <= 1;
        return (b1 && !c1 && !c2) || (!b1 && c1 && !c2);
    }
    public boolean evenlySpaced(int a, int b, int c){
        return a - b == b - c || a - c == c - b || a - b == c - a;
    }
    public int makeChocolate(int small, int big, int goal){
        if(goal % 5 <= small && goal / 5 <= big) return goal%5;
        if(goal / 5 > big && small >= goal - big * 5) return goal - big * 5;
        return -1;
    }
}
