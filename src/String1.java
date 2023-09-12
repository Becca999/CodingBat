public class String1 {
    public String helloName(String name){
        return "Hello " + name + "!";
    }
    public String makeAbba(String a, String b){
        return a + b + b + a;
    }
    public String makeTags(String tag, String word){
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    public String makeOutWord(String out, String word){
        return out.substring(0, 2) + word + out.substring(2);
    }
    public String extraEnd(String str){
        String str1 = str.substring(str.length()-2);
        return str1 + str1 + str1;
    }
    public String firstTwo(String str){
        if(str.length() <= 2) return str;
        return str.substring(0, 2);
    }
    public String firstHalf(String str){
        int half = str.length()/2;
        return str.substring(0, half);
    }
    public String withoutEnd(String str){
        String str1 = "";
        for(int i = 1; i < str.length()-1; i++){
            str1 += str.charAt(i);
        }
        return str1;
    }
    public String comboString(String a, String b){
        int aLen = a.length();
        int bLen = b.length();
        if(aLen < bLen) return a + b + a;
        return b + a + b;
    }
    public String nonStart(String a, String b){
        return a.substring(1) + b.substring(1);
    }
    public String left2(String str){
        if(str.length() <= 2) return str;
        return str.substring(2) + str.substring(0, 2);
    }
    public String right2(String str){
        if(str.length() <= 2) return str;
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }
    public String theEnd(String str, boolean front){
        if(front) return "" + str.charAt(0);
        return "" + str.charAt(str.length()-1);
    }
    public String withoutEnd2(String str){
        String str1 = "";
        for(int i = 1; i < str.length()-1; i++){
            str1 += str.charAt(i);
        }
        return str1;
    }
    public String middleTwo(String str){
        int half = str.length()/2;
        return str.substring(half-1, half+1);
    }
    public boolean endsLy(String str){
        if(str.length() <= 1) return false;
        return str.endsWith("ly");
    }
    public String nTwice(String str, int n){
        return str.substring(0, n) + str.substring(str.length()-n);
    }
    public String twoChar(String str, int index){
        if(index > str.length()-2 || index < 0) return str.substring(0,2);
        return str.substring(index, index + 2);
    }
    public String middleThree(String str){
        int mid = str.length()/2;
        return str.substring(mid-1, mid+2);
    }
    public boolean hasBad(String str){
        if(str.startsWith("bad")){
            return true;
        }
        return str.length() >= 4 && str.startsWith("bad", 1);
    }
    public String atFirst(String str){
        if(str.isEmpty()) return "@@";
        if(str.length() == 1) return str + '@';
        return str.substring(0,2);
    }
    public String lastChars(String a, String b){
        String a1 = "";
        String b1 = "";
        if(a.isEmpty()){
            a1 += '@';
        }else{
            a1 += a.charAt(0);
        }
        if(b.isEmpty()){
            b1 += '@';
        }else{
            b1 += b.charAt(b.length()-1);
        }
        return a1 + b1;
    }
    public String conCat(String a, String b){
        if(a.isEmpty()) return b;
        if(b.isEmpty()) return a;
        String str1 = a;
        if(b.charAt(0) == str1.charAt(str1.length()-1)){
            str1 += b.substring(1);
        }else{
            str1 += b;
        }
        return str1;
    }
    public String lastTwo(String str){
        if(str.length() <= 1) return str;
        int len = str.length();
        return str.substring(0, len-2) + str.charAt(len-1) + str.charAt(len-2);
    }
    public String seeColor(String str){
        if(str.startsWith("red")) return "red";
        if(str.startsWith("blue")) return "blue";
        return "";
    }
    public boolean frontAgain(String str){
        if(str.length() <= 1) return false;
        if(str.length() == 2) return true;
        return str.startsWith(str.substring(str.length()-2));
    }
    public String minCat(String a, String b){
        int aLen = a.length();
        int bLen = b.length();
        String str1 = "";
        if(aLen > bLen){
            return a.substring(aLen - bLen) + b;
        }
        return a + b.substring(bLen - aLen);
    }
    public String extraFront(String str){
        if(str.length() <= 1) return str + str + str;
        String sub = str.substring(0,2);
        return sub + sub + sub;
    }
    public String without2(String str){
        if(str.length() <= 1) return str;
        String last2 = str.substring(str.length()-2);
        if(last2.equals(str.substring(0,2))) return str.substring(2);
        return str;
    }
    public String deFront(String str){
        String str1 = "";
        if(str.charAt(0) == 'a'){
            str1 += 'a';
        }
        if(str.charAt(1) == 'b'){
            str1 += 'b';
        }
        str1 += str.substring(2);
        return str1;
    }
    public String startWord(String str, String word){
        String subWord = word.substring(1);
        int wLen = word.length();
        int sLen = str.length();
        if(sLen >= wLen && str.substring(1, wLen).equals(subWord)){
            return str.substring(0, wLen);
        }
        return "";
    }
    public String withoutX(String str){
        if(str.length() <= 1) return "";
        String str1 = str.substring(1, str.length()-1);
        if(str.charAt(0) != 'x'){
            str1 = str.charAt(0) + str1;
        }
        if(str.charAt(str.length()-1) != 'x'){
            str1 += str.charAt(str.length()-1);
        }
        return str1;
    }
    public String withoutX2(String str){
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            if(i == 0 && str.charAt(i) == 'x'){
                continue;
            }
            if(i == 1 && str.charAt(i) == 'x'){
                continue;
            }
            str1 += str.charAt(i);
        }
        return str1;
    }
}

