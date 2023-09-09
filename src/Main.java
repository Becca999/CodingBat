public class Main {
    public static void main(String[] args) {

        boolean t = true;
        boolean f = false;
        int x = 2;
        int y = 5;
        int z = 15;
        String str = "not";
        Warmup1 wm1 = new Warmup1();

        //WARMUP-1
        //sleepIn
        System.out.println("sleepIn: " + wm1.sleepIn(t,f));
        //monkeyTrouble
        System.out.println("monkeyTrouble: " + wm1.monkeyTrouble(t,f));
        //sumDouble
        System.out.println("sumDouble: " + wm1.sumDouble(x, y));
        //diff21
        System.out.println("diff21: " + wm1.diff21(x));
        //parrotTrouble
        System.out.println("parrotTrouble: " + wm1.parrotTrouble(t, x));
        //makes10
        System.out.println("makes10: " + wm1.makes10(x, y));
        //nearHundred
        System.out.println("nearHundred: " + wm1.nearHundred(x));
        //posNeg
        System.out.println("posNeg: " + wm1.posNeg(x, y, t));
        //noString
        System.out.println("noString: " + wm1.noString(str));
        //missingChar
        System.out.println("missingChar: " + wm1.missingChar(str, x));
        //frontBack
        System.out.println("frontBack: " + wm1.frontBack(str));
        //front3
        System.out.println("front3: " + wm1.front3(str));
        //backAround
        System.out.println("backAround: " + wm1.backAround(str));
        //or35
        System.out.println("or35: " + wm1.or35(x));
        //front22
        System.out.println("front22: " + wm1.front22(str));
        //startHi
        System.out.println("startHi: " + wm1.startHi(str));
        //icyHot
        System.out.println("icyHot: " + wm1.icyHot(x,y));
        //in1020
        System.out.println("in1020: " + wm1.in1020(x, y));
        //hasTeen
        System.out.println("hasTeen: " + wm1.hasTeen(x, y, z));
        //loneTeen
        System.out.println("loneTeen: " + wm1.loneTeen(x, z));
        //delDel
        System.out.println("delDel: " + wm1.delDel(str));
        //mixStart
        System.out.println("mixStart: " + wm1.mixStart(str));
        //startOz
        System.out.println("startOz: " + wm1.startOz(str));
        //intMax
        System.out.println("intMax: " + wm1.intMax(x, y, z));
        //close10
        System.out.println("close10: " + wm1.close10(x, y));
        //in3050
        System.out.println("in3050: " + wm1.in3050(x, y));
        //max1020
        System.out.println("max1020: " + wm1.max1020(x, y));
        //stringE
        System.out.println("stringE: " + wm1.stringE(str));
        //lastDigit
        System.out.println("lastDigit: " + wm1.lastDigit(x, y));
        //endUp
        System.out.println("endUp: " + wm1.endUp(str));
        //everyNth
        System.out.println("everyNth: " + wm1.everyNth(str, x));

        int[] arr = new int[] {1, 9, 5, 4, 3};
        int[] arr2 = new int[] {6, 6, 7, 6, 1};
        String str1 = "notnotnot";
        String str2 = "xxxx";
        Warmup2 wm2 = new Warmup2();


        //WARMUP-2
        //stringTimes
        System.out.println("stringTimes: " + wm2.stringTimes(str,x));
        //frontTimes
        System.out.println("frontTimes: " + wm2.frontTimes(str, x));
        //countXX
        System.out.println("countXX: " + wm2.countXX(str));
        //doubleX
        System.out.println("doubleX: " + wm2.doubleX(str));
        //stringBits
        System.out.println("stringBits: " + wm2.stringBits(str));
        //stringSplosion
        System.out.println("stringSplosion: " + wm2.stringSplosion(str));
        //last2
        System.out.println("last2: " + wm2.last2(str));
        //arrayCount9
        System.out.println("arrayCount9: " + wm2.arrayCount9(arr));
        //arrayFront9
        System.out.println("arrayFront9: " + wm2.arrayFront9(arr));
        //array123
        System.out.println("array123: " + wm2.array123(arr));
        //stringMatch
        System.out.println("stringMatch: " + wm2.stringMatch(str, str1));
        //stringX
        System.out.println("stringX: " + wm2.stringX(str2));
        //altPairs
        System.out.println("altPairs: " + wm2.altPairs(str));
        //stringYak
        System.out.println("stringYak: " + wm2.stringYak(str));
        //array667
        System.out.println("array667: " + wm2.array667(arr2));
        //noTriples
        System.out.println("noTriples: " + wm2.noTriples(arr2));
        //has271
        System.out.println("has271: " + wm2.has271(arr2));




    }
}
