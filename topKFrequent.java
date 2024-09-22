public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            int count = 1;

            while (i + 1 < len && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }

            frequencyMap.put(nums[i], count);
        }

        int[] result = frequencyMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return result;
    }
}