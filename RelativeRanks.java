class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] array = new Integer[score.length];
        for (int j = 0; j < score.length; j++) {
            array[j] = score[j];
        }
        Arrays.sort(array, Collections.reverseOrder());

        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            int index = Arrays.asList(array).indexOf(score[i]);

            if (index < 3) {
                switch (index) {
                    case 0:
                        result[i] = "Gold Medal";
                        break;
                    case 1:
                        result[i] = "Silver Medal";
                        break;
                    case 2:
                        result[i] = "Bronze Medal";
                        break;
                }
            } else {
                result[i] = String.valueOf(index + 1);
            }
        }
        return result;
    }
}