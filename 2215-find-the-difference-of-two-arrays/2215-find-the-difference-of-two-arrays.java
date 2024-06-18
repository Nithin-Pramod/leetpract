class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        
        for(int n : nums1){
            set1.add(n);
        }
        
        for(int n : nums2){
            set2.add(n);
        }
        
        Set<Integer> unique1  = new HashSet<>(set1);
        unique1.removeAll(set2);
        
        Set<Integer> unique2  = new HashSet<>(set2);
        unique2.removeAll(set1);
        
        List<Integer> list1 = new ArrayList<>(unique1);
        List<Integer> list2 = new ArrayList<>(unique2);
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        return answer;
        
    }
}