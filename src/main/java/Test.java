public class Test {

    public static void main(String[] args) {
//        int[] a = new int[]{1, 2, 3, 4, 5};
//        a =null;
//        for(int b :a){
//            System.out.println();
//        }

//        for(int i =0;i<a.length;i++){
//            System.out.println();
//        }


        int num = 454;
        int rev = 0;

        while (num>0){
            int remainder = num%10;
            rev = rev*10 + remainder;
            num = num/10;
        }
        System.out.println(rev);
        System.out.println(num);
    }
}
