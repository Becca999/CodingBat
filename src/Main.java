import java.util.Arrays;

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
        //extraFront
        System.out.println("extraFront: " + string1.extraFront(str));
        //wihtout2
        System.out.println("wihtou2: " + string1.without2(str));
        //deFront
        System.out.println("deFront: " + string1.deFront(str));
        //startWord
        System.out.println("startWord: " + string1.startWord(str, str1));
        //wihtoutX
        System.out.println("wihtoutX: " + string1.without2(str));
        //withoutX2
        System.out.println("withoutX2: " + string1.withoutX2(str));


        Array1 arr1 = new Array1();
        int[] nums = new int[] {6, 4, 3, 8, 6};

        //Array1
        //firstLast6
        System.out.println("firstLast6: " + arr1.firstLast6(nums));
        //sameFirstLast
        System.out.println("sameFirstLast: " + arr1.sameFirstLast(nums));
        //makePi
        System.out.println("makePi: " + Arrays.toString(arr1.makePi()));
        //commonEnd
        System.out.println("commonEnd: " + arr1.commonEnd(nums, arr));
        //sum3
        System.out.println("sum3: " + arr1.sum3(nums));
        //rotateLeft3
        System.out.println("rotateLeft3: " + Arrays.toString(arr1.rotateLeft3(nums)));
        //reverse3
        System.out.println("reverse3: " + Arrays.toString(arr1.reverse3(nums)));
        //maxEnd3
        System.out.println("maxEnd3: " + Arrays.toString(arr1.maxEnd3(nums)));
        //sum2
        System.out.println("sum2: " + arr1.sum2(nums));
        //middleWay
        System.out.println("middleWay: " + Arrays.toString(arr1.middleWay(nums, arr)));
        //makeEnds
        System.out.println("makeEnds: " + Arrays.toString(arr1.makeEnds(nums)));
        //has23
        System.out.println("has23: " + arr1.has23(nums));
        //makeLast
        System.out.println("makeLast: " + Arrays.toString(arr1.makeLast(nums)));
        //double23
        System.out.println("double23: " + arr1.double23(nums));
        //fix23
        System.out.println("fix23: " + Arrays.toString(arr1.fix23(nums)));
        //start1
        System.out.println("start1: " + arr1.start1(nums, arr));
        //biggerTwo
        System.out.println("biggerTwo: " + Arrays.toString(arr1.biggerTwo(nums, arr)));
        //makeMiddle
        System.out.println("makeMiddle: " + Arrays.toString(arr1.makeMiddle(nums)));
        //plusTwo
        System.out.println("plusTwo: " + Arrays.toString(arr1.plusTwo(nums, arr)));
        //swapEnds
        System.out.println("swapEnds: " + Arrays.toString(arr1.swapEnds(nums)));
        //midThree
        System.out.println("midThree: " + Arrays.toString(arr1.midThree(nums)));
        //maxTriple
        System.out.println("maxTriple: " + arr1.maxTriple(nums));
        //frontPiece
        System.out.println("frontPiece: " + Arrays.toString(arr1.frontPiece(nums)));
        //unlucky1
        System.out.println("unlucky1: " + arr1.unlucky1(nums));
        //make2
        System.out.println("make2: " + Arrays.toString(arr1.make2(nums, arr)));
        //front11
        System.out.println("front11: " + Arrays.toString(arr1.front11(nums, arr)));



        Logic1 logic1 = new Logic1();
        int die1 = 6;
        int die2 = 6;

        //Logic1
        //cigarParty
        System.out.println("cigarParty: " + logic1.cigarParty(x, f));
        //dateFashion
        System.out.println("dateFashion: " + logic1.dateFashion(x, y));
        //squirrelPlay
        System.out.println("squirrelPlay: " + logic1.squirrelPlay(x, f));
        //caughtSpeeding
        System.out.println("caughtSpeeding: " + logic1.caughtSpeeding(x, f));
        //sortaSum
        System.out.println("sortaSum: " + logic1.sortaSum(x, y));
        //alarmClock
        System.out.println("alarmClock: " + logic1.alarmClock(x, f));
        //love6
        System.out.println("love6: " + logic1.love6(x, y));
        //in1To10
        System.out.println("in1To10: " + logic1.in1To10(x, f));
        //specialEvent
        System.out.println("specialEvent: " + logic1.specialEvent(x));
        //more20
        System.out.println("more20: " + logic1.more20(x));
        //old35
        System.out.println("old35: " + logic1.old35(x));
        //less20
        System.out.println("less20: " + logic1.less20(x));
        //nearTen
        System.out.println("nearTen: " + logic1.nearTen(x));
        //teenSum
        System.out.println("teenSum: " + logic1.teenSum(x, y));
        //answerCell
        System.out.println("answerCell: " + logic1.answerCell(f, t, f));
        //teaParty
        System.out.println("teaParty: " + logic1.teaParty(x, y));
        //fizzString
        System.out.println("fizzString: " + logic1.fizzString(str));
        //fizzString2
        System.out.println("fizzString2: " + logic1.fizzString2(x));
        //twoAsOne
        System.out.println("twoAsOne: " + logic1.twoAsOne(x, y, y));
        //inOrder
        System.out.println("inOrder: " + logic1.inOrder(x, y, x, f));
        //inOrderEqual
        System.out.println("inOrderEqual: " + logic1.inOrderEqual(x, y, x, f));
        //lastDigit
        System.out.println("lastDigit: " + logic1.lastDigigt(x, y, x));
        //lessBy10
        System.out.println("lessBy10: " + logic1.lessBy10(x, y, x));
        //withoutDoubles
        System.out.println("withoutDoubles: " + logic1.wihtoutDoubles(die1, die2, t));
        //maxMod5
        System.out.println("maxMod5: " + logic1.maxMod5(x, y));
        //redTicket
        System.out.println("redTicket: " + logic1.redTicket(x, y, x));
        //greenTicket
        System.out.println("greenTicket: " + logic1.greenTicket(x, y, x));
        //blueTicket
        System.out.println("blueTicket: " + logic1.blueTicket(x, y, x));
        //shareDigit
        System.out.println("shareDigit: " + logic1.shareDigit(x, y));
        //sumLimit
        System.out.println("sumLimit: " + logic1.sumLimit(x, y));

    }
}
