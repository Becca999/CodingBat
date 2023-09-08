public class Main {
    public static void main(String[] args) {

        boolean t = true;
        boolean f = false;
        int x = 2;
        int y = 5;
        String str = "not";
        Warmup1 wm1 = new Warmup1();

        //WARMUP-1
        //sleepIn
        System.out.println(wm1.sleepIn(t,f));
        //monkeyTrouble
        System.out.println(wm1.monkeyTrouble(t,f));
        //sumDouble
        System.out.println(wm1.sumDouble(x, y));
        //diff21
        System.out.println(wm1.diff21(x));
        //parrotTrouble
        System.out.println(wm1.parrotTrouble(t, x));
        //makes10
        System.out.println(wm1.makes10(x, y));
        //nearHundred
        System.out.println(wm1.nearHundred(x));
        //posNeg
        System.out.println(wm1.posNeg(x, y, t));
        //noString
        System.out.println(wm1.noString(str));
        //missingChar
        System.out.println(wm1.missingChar(str, x));
        //frontBack
        System.out.println(wm1.frontBack(str));
        //front3
        System.out.println(wm1.front3(str));
        //backAround
        System.out.println(wm1.backAround(str));
        //or35
        System.out.println(wm1.or35(x));
        //front22
        System.out.println(wm1.front22(str));
        //startHi
        System.out.println(wm1.startHi(str));
        //icyHot
        System.out.println(wm1.icyHot(x,y));

        int[] arr = new int[] {1, 9, 5, 4, 3};
        int[] arr2 = new int[] {6, 6, 7, 6, 1};
        String str1 = "notnotnot";
        String str2 = "xxxx";
        Warmup2 wm2 = new Warmup2();
        //WARMUP-2
        //stringTimes
        System.out.println(wm2.stringTimes(str,x));
        //frontTimes
        System.out.println(wm2.frontTimes(str, x));
        //countXX
        System.out.println(wm2.countXX(str));
        //doubleX
        System.out.println(wm2.doubleX(str));
        //stringBits
        System.out.println(wm2.stringBits(str));
        //stringSplosion
        System.out.println(wm2.stringSplosion(str));
        //last2
        System.out.println(wm2.last2(str));
        //arrayCount9
        System.out.println(wm2.arrayCount9(arr));
        //arrayFront9
        System.out.println(wm2.arrayFront9(arr));
        //array123
        System.out.println(wm2.array123(arr));
        //stringMatch
        System.out.println(wm2.stringMatch(str, str1));
        //stringX
        System.out.println(wm2.stringX(str2));
        //altPairs
        System.out.println(wm2.altPairs(str));
        //stringYak
        System.out.println(wm2.stringYak(str));
        //array667
        System.out.println(wm2.array667(arr2));
        //noTriples
        System.out.println(wm2.noTriples(arr2));
        //has271
        System.out.println(wm2.has271(arr2));




    }
}
