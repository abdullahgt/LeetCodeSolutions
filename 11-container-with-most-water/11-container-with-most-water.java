class Solution {
    public int maxArea(int[] height) 
       /* int first = 0;
        int second = 0;
        int size = 0;
        int inter = 0;
        int heightFor = 0;
        int store = 0;
        for(int i = 0; i < height.length; i++) {
            heightFor = Math.min(height[i], height[first]);
            inter = heightFor * Math.abs(i - first);
            if (inter >= size) {
                size = inter;
                store = second;
                second = i;
                heightFor = Math.min(height[second], height[store]);
                inter = heightFor * Math.abs(second - store);
                if (inter >= size && height[store] != 0) {
                    first = store;
                }
                
            }
                
        } 
        size = (Math.min(height[second], height[first])) * (second - first);
        //System.out.println(first + " ");
        //System.out.println(second + "   ");
        
        for(int i = 0; i <= second; i++) {
        heightFor = Math.min(height[second], height[i]);
        inter = heightFor * Math.abs(second - i);
            if (inter >= size) {
                size = inter;
                first = i;
            }
        }
        System.out.println(first);
        System.out.println(second);
        size = (Math.min(height[second], height[first])) * Math.abs(second - first);
        
        int tempSize = size;
        
        for(int i = 0; i < height.length / 2; i++)
        {
    int temp = height[i];
    height[i] = height[height.length - i - 1];
    height[height.length - i - 1] = temp;
        }
        
        first = 0;
        second = 0;
        size = 0;
        inter = 0;
        heightFor = 0;
        store = 0;
        for(int i = 0; i < height.length; i++) {
            heightFor = Math.min(height[i], height[first]);
            inter = heightFor * Math.abs(i - first);
            if (inter >= size) {
                size = inter;
                store = second;
                second = i;
                heightFor = Math.min(height[second], height[store]);
                inter = heightFor * Math.abs(second - store);
                if (inter >= size && height[store] != 0) {
                    first = store;
                }
                
            }
                
        } 
        size = (Math.min(height[second], height[first])) * (second - first);
        
        for(int i = 0; i < height.length; i++) {
        heightFor = Math.min(height[second], height[i]);
        inter = heightFor * Math.abs(second - i);
            if (inter >= size) {
                size = inter;
                first = i;
            }
        }
        size = (Math.min(height[second], height[first])) * (second - first);
        size = Math.max(tempSize, size);
        
        
         
        return size;
    }
}
*/
       /* {
 
    int Area = 0;
     
    for(int i = 0; i < height.length; i++)
    {
        for(int j = i + 1; j < height.length; j++)
        {
            Area = Math.max(
                Area, Math.min(height[i], height[j]) *
                              (j - i));
        }
    }
    return Area;
}
 

} */
        
        {
        int l = 0;
        int len = height.length;
        int r = len -1;
        int area = 0;
     
        while (l < r)
        {
            // Calculating the max area
            area = Math.max(area,
                        Math.min(height[l], height[r]) * (r - l));
                         
            if (height[l] < height[r])
                l += 1;
                 
            else
                r -= 1;
        }
        return area;
    }
}
        