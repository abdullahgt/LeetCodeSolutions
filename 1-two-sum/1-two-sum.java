class Solution {
    public int[] twoSum(int[] nums, int target) {
        //List<Integer> list = new ArrayList<>();
        // int list[] = new int[2];
        // int o = 0;
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer difference = (Integer)(target - nums[i]);
            if (newMap.containsKey(difference)) {
                int list[] = {newMap.get(difference),i};
                return list;
            }
            newMap.put(nums[i],i);
        }
        return null;
    }
}
//         for (Integer i: newMap.keySet()) {
//             int z = target - newMap.get(i);
//             if (newMap.containsValue(z)) {
//                 for (Integer j: newMap.keySet()) {
//         if (Objects.equals(z, newMap.get(j)) && z != newMap.getKey(i)) {
//             o = j;
//         }
//             }
          
//             list[1] = o;
//             return list;
          
//         }
    
            
//         }
//         return list;
//     }
// }