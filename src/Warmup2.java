public class Warmup2 {
    public String stringTimes(String str, int n){
        String str1 = "";
        for(int i = 0; i < n; i++){
            str1 += str;
        }
        return str1;
    }
    public String frontTimes(String str, int n){
        String str1 = "";
        for(int i = 0; i < n; i++){
            if(str.length() < 3){
                str1 += str;
            }else{
                str1 += str.substring(0,3);
            }
        }
        return str1;
    }
    int countXX(String str){
        int count =0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                count++;
            }
        }
        return count;
    }
    boolean doubleX(String str){
        boolean x = false;
        boolean y = false;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x'){
                if(str.charAt(i+1) == 'x' && !y){
                    x = true;
                }
                y = true;
            }
        }
        return x;
    }
    public String stringBits(String str){
       String str1 = "";
       for(int i = 0; i < str.length(); i+=2){
           str1 += str.charAt(i);
       }
       return str1;
    }
    public String stringSplosion(String str){
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < i+1; j++){
                str1 += str.charAt(j);
            }
        }
        return str1;
    }
    public int last2(String str){
        if(str.length() < 3) return 0;
        String sub = str.substring(str.length()-2);
        int count = 0;
        for(int i = 0; i < str.length()-2; i++){
            if(sub.equals(str.substring(i, i+2))){
                count++;
            }
        }
        return count;
    }
    public int arrayCount9(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }
    public boolean arrayFront9(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9 && i < 4){
                return true;
            }
        }
        return false;
    }
    public boolean array123(int[] nums){
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }
    public int stringMatch(String a, String b){
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for(int i =0; i < len-1; i++){
            String subA = a.substring(i, i+2);
            String subB = b.substring(i, i+2);
            if(subA.equals(subB)){
                count++;
            }
        }
        return count;
    }
    public String stringX(String str){
        if(str.length() <= 2) return str;
        String str1 = "" + str.charAt(0);
        char c = str.charAt(str.length()-1);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != 'x'){
                str1 += str.charAt(i);
            }
        }
        if(c == 'x'){
            str1 += c;
        }
        return str1;
    }
    public String altPairs(String str){
        String str1 = "";
        for( int i = 0; i < str.length(); i += 4){
            if((i + 1) <= str.length()){
                str1 += str.substring(i, i+1);
            }
            if((i + 2) <= str.length()){
                str1 += str.substring(i+1, i+2);
            }
        }
        return str1;
    }
    public String stringYak(String str){
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            if((i+2) < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
                i += 2;
            }else{
                str1 += str.charAt(i);
            }
        }
        return str1;
    }
    public int array667(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 6){
                if(nums[i+1] == 6 || nums[i+1] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean noTriples(int[] nums){
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }
    public boolean has271(int[] nums){
        int val;
        for(int i = 0; i < nums.length-2; i++){
            val = nums[i];
            if(Math.abs((val - 1) - nums[i+2]) <= 2){
                return true;
            }
        }
        return false;
    }
}
