class Solution {
    public int[] minOperations(String boxes) {
        int leng = boxes.length();
        int result[] = new int[leng];

        for (int i = 0; i < leng; i++) {
            int total = 0;
            for( int j = 0; j <leng; j++){
                if (i != j) {
                    if(boxes.charAt(j) == '1'){
                        int count = Math.abs(i - j);
                            if(count < 0){
                                count = count * (-1);
                            }
                        total += count;
                        }
                     }
                }
            result[i] = total;
            }
        return result;
    }
}