package DongTaiGuiHua;

public class LC313 {
    public static  int nthSuperUglyNumber(int n, int[] primes) {
        if (n<0 || primes==null)
            return 0;
        if (n==1)
            return 1;
        int[] beishu = new int[primes.length];
        for (int i = 0; i < beishu.length; i++) {
            beishu[i]=1;
        }

        int[] resnum = new int[n+1];
        resnum[0]=1;

        for (int i=0;i<n;i++){
            int minnum =Integer.MAX_VALUE;
            for (int j =0;j<primes.length;j++){

            }


            resnum[i+1]=minnum;
        }
        return resnum[n];
    }

    public static void main(String[] args) {
        int[] a={2,7,13,19};
        System.out.println("a = " + nthSuperUglyNumber(12,a));
    }
}
