public class MajorityElementExecute {

    public static void main(String[] args) {

        MajorityElementExecute majorelement = new MajorityElementExecute();
        int array[] = new int[] { 1, 3, 3, 1, 2 };

        int size = array.length;
        majorelement.imprimirMajoriy(array, size);
    }

    private void imprimirMajoriy(int[] array, int size) {
        int candidate = buscarCandidate(array, size);
        System.out.println("Numero candidate: " + candidate);

        if (isMajority(array, size, candidate))
            System.out.println(" " + candidate + " ");
        else
            System.out.println("Não exite Elemento Majority");
    }

    private boolean isMajority(int[] array, int size, int candidate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == candidate) {
                count++;
            }
        }
        return count > (size / 2);
    }

    private int buscarCandidate(int[] array, int size) {
        int majorityIndex = 0, count = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] == array[majorityIndex]) {
                count ++;
            } else {
                count --;
            }
            if (count == 0) {
                majorityIndex = i;
                count ++;
            }
        }

        return array[majorityIndex];
    }

}
