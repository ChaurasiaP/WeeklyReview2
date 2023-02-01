public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 1, 2, 33, 4, 2, 6, 7, 8};
        int s = a.length;

        for (int i = 0; i < s; i++) {
            int count = 0;
            for (int j = 0; j < s; j++) {
                if (a[i] == a[j] && j < i) {  // if j<i && a[i]==a[j] then a[i] is already counted hence count will be zero always
                    break;
                }
                if (a[i] == a[j]) {
                    count++;
                }
            }
            //System.out.println(a[i]+" "+count);
            if (count > 1) {  // for repeating elements count will be > 1
                System.out.println(a[i]);
            }
        }
    }
}
