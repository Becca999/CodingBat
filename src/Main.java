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


        String1 string1 = new String1();
        String s = "{{}}";


        //String1
        //helloName
        System.out.println("helloName: " + string1.helloName(str));
        //makeAbba
        System.out.println("makeAbba: " + string1.makeAbba(str,str1));
        //makeTags
        System.out.println("makeTags: " + string1.makeTags(str, str1));
        //makeOutWord
        System.out.println("makeOutWord: " + string1.makeOutWord(s, str1));
        //extraEnd
        System.out.println("extraEnd: " + string1.extraEnd(str));
        //firstTwo
        System.out.println("firstTwo: " + string1.firstTwo(str));
        //firstHalf
        System.out.println("firstHalf: " + string1.firstHalf(str));
        //withoutEnd
        System.out.println("wihtoutEnd: " + string1.withoutEnd(str));
        //comboString
        System.out.println("comboString: " + string1.comboString(str, str1));
        //nonStart
        System.out.println("nonStart: " + string1.nonStart(str, str1));
        //left2
        System.out.println("left2: " + string1.left2(str));
        //right2
        System.out.println("right2: " + string1.right2(str));
        //theEnd
        System.out.println("theEnd: " + string1.theEnd(str, t));
        //wihtoutEnd2
        System.out.println("wihtouEnd2: " + string1.withoutEnd2(str));
        //middleTwo
        System.out.println("middleTwo: " + string1.middleTwo(str));
        //endsLy
        System.out.println("endsLy: " + string1.endsLy(str));
        //nTwice
        System.out.println("nTwice: " + string1.nTwice(str, x));
        //twoChar
        System.out.println("twoChar: " + string1.twoChar(str, x));
        //middleThree
        System.out.println("middleThree: " + string1.middleThree(str));
        //hasBad
        System.out.println("hasBad: " + string1.hasBad(str));
        //atFirst
        System.out.println("atFirst: " + string1.atFirst(str));
        //lastChars
        System.out.println("lastChars: " + string1.lastChars(str, str1));
        //conCat
        System.out.println("conCat: " + string1.conCat(str, str1));
        //lastTwo
        System.out.println("lastTwo: " + string1.lastTwo(str));
        //seeColor
        System.out.println("seeColor: " + string1.seeColor(str));
        //frontAgain
        System.out.println("frontAgain: " + string1.frontAgain(str));
        //minCat
        System.out.println("minCat: " + string1.minCat(str, str1));



    }
}
