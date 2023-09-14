public class Array1 {
    public boolean firstLast6(int[] nums){
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }
    public boolean sameFirstLast(int[] nums){
        return nums.length >= 1 && nums[0] == nums[nums.length-1];
    }
    public int[] makePi(){
       return new int[] {3,1,4};
    }
    public boolean commonEnd(int[] a, int[] b){
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }
    public int sum3(int[] nums){
        return nums[0] + nums[1] + nums[2];
    }
    public int[] rotateLeft3(int[] nums){
        return new int[] {nums[1], nums[2], nums[0]};
    }
    public int[] reverse3(int[] nums){
        return new int[] {nums[2], nums[1], nums[0]};
    }
    public int[] maxEnd3(int[] nums){
        int max = Math.max(nums[0], nums[2]);
        return new int[] {max, max, max};
    }
    public int sum2(int[] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }
    public int[] middleWay(int[] a, int[] b){
        return new int[] {a[1], b[1]};
    }
    public int[] makeEnds(int[] nums){
        if(nums.length == 1) return new int[] {nums[0], nums[0]};
        return new int[] {nums[0], nums[nums.length-1]};
    }
    public boolean has23(int[] nums){
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] ==3;
    }
    public boolean no23(int[] nums){
        return nums[0] !=2 && nums[0] != 3 && nums[1] !=2 && nums[1] != 3;
    }
    public int[] makeLast(int[] nums){
        int doubleLen = nums.length * 2;
        int[] nums1 = new int[doubleLen];
        nums1[doubleLen-1] = nums[nums.length-1];
        return nums1;
    }
    public boolean double23(int[] nums){
        if(nums.length <= 1) return false;
        return (nums[0] == 2 && nums[1] == 2) || (nums[0] ==3 && nums[1] == 3);
    }
    public int[] fix23(int[] nums){
        for(int i = 0; i < 2; i++){
            if(nums[i] == 2 && nums[i+1] == 3){
                nums[i+1] = 0;
            }
        }
        return nums;
    }
    public int start1(int[] a, int[] b){
        int count = 0;
        if(a.length != 0 && a[0] == 1){
            count++;
        }
        if(b.length != 0 && b[0] == 1){
            count++;
        }
        return count;
    }
    public int[] biggerTwo(int[] a, int[] b){
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if(sumA >= sumB) return a;
        return b;
    }
    public int[] makeMiddle(int[] nums){
        int half = nums.length/2;
        return new int[] {nums[half - 1], nums[half]};
    }
    public int[] plusTwo(int[] a, int[] b){
        return new int[] {a[0], a[1], b[0], b[1]};
    }
    public int[] swapEnds(int[] nums){
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }
    public int[] midThree(int[] nums){
        int mid = nums.length/2;
        return new int[] {nums[mid-1], nums[mid], nums[mid+1]};
    }
    public int maxTriple(int[] nums){
        int mid = nums.length/2;
        int max1 = Math.max(nums[0], nums[mid]);
        return Math.max(max1, nums[nums.length-1]);
    }
    public int[] frontPiece(int[] nums){
        if(nums.length <= 2) return nums;
        return new int[] {nums[0], nums[1]};
    }
    public boolean unlucky1(int[] nums){
        int len = nums.length;
        if(len <= 1) return false;
        boolean front = nums[0] == 1 && nums[1] == 3;
        boolean front2 = nums[1] == 1 && nums[2] == 3;
        boolean last = nums[len-2] == 1 && nums[len-1] ==3;
        return front || front2 || last;
    }
    public int[] make2(int[] a, int[] b){
        int aLen = a.length;
        int bLen = b.length;
        if(aLen == 0) return new int[] {b[0], b[1]};
        if(aLen >= 2) return new int[] {a[0], a[1]};
        return new int[] {a[0], b[0]};
    }
    public int[] front11(int[] a, int[] b){
        if(a.length == 0 && b.length == 0) return new int[0];
        if(a.length == 0) return new int[] {b[0]};
        if(b.length == 0) return new int[] {a[0]};
        return new int[] {a[0], b[0]};
    }
}
