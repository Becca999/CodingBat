public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
    public int sumDouble(int a, int b){
        if(a==b) return (a+b)*2;
        return a+b;
    }
    public int diff21(int n){
        if(n > 21) return 2*(Math.abs(n-21));
        return Math.abs(n-21);
    }
    public boolean parrotTrouble(boolean talking, int hour){
        if((hour < 7 || hour > 20) && talking) return true;
        return false;
    }
    public boolean makes10(int a, int b){
        return (a== 10 || b==10) || ((a+b)==10);
    }
    public boolean nearHundred(int n){
        return ((Math.abs(n-100) <= 10) || (Math.abs(n-200) <= 10));
    }
    public boolean posNeg(int a, int b, boolean negative){
        if(negative){
            return (a < 0 && b <0);
        }
        return ((a < 0 && b > 0) || (a > 0 && b <0));
    }
    public String noString(String str){
        if(str.startsWith("not")) return str;
        return "not " + str;
    }
    public String missingChar(String str, int n){
        String str1 = "";
        for(int i =0; i < str.length(); i++){
            if(i != n){
                str1 += str.charAt(i);
            }
        }
        return str1;
    }
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
    }
    public String front3(String str){
        if(str.length() <= 3) return str + str +str;
        String sub = str.substring(0,3);
        return sub + sub + sub;
    }
    public String backAround(String str){
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
    public boolean or35(int n){
        return n%3 == 0 || n%5 == 0;
    }
    public String front22(String str){
        if(str.length() <= 2) return str + str + str;
        return str.substring(0,2) + str + str.substring(0,2);
    }
    public boolean startHi(String str){
        if(str.length() < 2) return false;
        return str.substring(0,2).equals("hi");
    }
    public boolean icyHot(int temp1, int temp2){
        return (temp1 < 0 && temp2 >100) || (temp1 > 100 && temp2 < 0);
    }
    public boolean in1020(int a, int b){
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
    public boolean hasTeen(int a, int b, int c){
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
    public boolean loneTeen(int a, int b){
        boolean x = (a >= 13 && a <= 19);
        boolean z = (b >= 13 && b <= 19);
        return (!x && z) || (x && !z);
    }
    public String delDel(String str){
        if(str.length() <= 3) return str;
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            if( i == 1 && str.substring(i, i +3).equals("del")) {
                i += 2;
                continue;
            }else{
                str1 += str.charAt(i);
            }
        }
        return str1;
    }
    public boolean mixStart(String str){
        if(str.length() < 3) return false;
        if(str.substring(1, 3).equals("ix")) return true;
        return false;
    }
    public String startOz(String str){
        String str1 = "";
        if(str.length() > 0 && str.charAt(0) == 'o'){
            str1 += 'o';
        }
        if(str.length() >= 2 && str.charAt(1) == 'z'){
            str1 += 'z';
        }
        return str1;
    }
    public int intMax(int a, int b, int c){
        int x = Math.max(a, b);
        return Math.max(c, x);
    }
    public int close10(int a, int b){
        int a1 = Math.abs(10 - a);
        int b1 = Math.abs(10 - b);
        if(a1 < b1) return a;
        if(a1 > b1) return b;
        return 0;
    }
    public boolean in3050(int a, int b){
        boolean a1 = (a >= 30 && a <= 40);
        boolean b1 = (b >= 30 && b <= 40);
        boolean a2 = (a >= 40 && a <= 50);
        boolean b2 = (b >= 40 && b <= 50);
        return (a1 && b1) || (a2 && b2);
    }
    public int max1020(int a, int b){
        int a1 = 0;
        int b1 = 0;
        if(a >= 10 && a <= 20){
            a1 =a;
        }
        if(b >= 10 && b <= 20){
            b1 = b;
        }
        return Math.max(a1, b1);
    }
    public boolean stringE(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                count++;
            }
        }
        return (count >= 1) && (count <= 3);
    }
    public boolean lastDigit(int a, int b){
        return (a % 10) == (b % 10);
    }
    public String endUp(String str){
        if(str.length() <= 3) return str.toUpperCase();
        String front = str.substring(0, str.length()-3);
        String back = str.substring(str.length()-3, str.length());
        return front + back.toUpperCase();
    }
    public String everyNth(String str, int n){
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            if(1 % n == 0){
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

}






