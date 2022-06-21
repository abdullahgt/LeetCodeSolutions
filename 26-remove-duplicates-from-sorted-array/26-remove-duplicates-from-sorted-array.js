/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
     var n = nums.length;
     if (n == 0 || n == 1)
            return n;
 
        // To store index of next unique element
        var j = 0;
 
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (i = 0; i < n - 1; i++)
            if (nums[i] != nums[i + 1])
                nums[j++] = nums[i];
 
        nums[j++] = nums[n - 1];
 
        return j;
    
    
};