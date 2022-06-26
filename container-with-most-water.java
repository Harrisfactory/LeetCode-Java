class Solution {
    public int maxArea(int[] height) {
        int left = 0;

        int right = height.length - 1;

        int maxArea = 0;

        int minMaxHeight = 0;

        while(left <= right) {
            //set the maximum minimum height to avoid tilt
            if (height[left] < height[right]) {
                minMaxHeight = height[left];
            } else {
                minMaxHeight = height[right];
            }

            //find area then compare it to the maximum area
            int area = (right - left) * minMaxHeight;

            if (area > maxArea) {
                maxArea = area;
            }

            //move necessary pointer
            if (height[left] < height[right]) {
               left++;
            } else if (height[right] < height[left]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxArea;
    }
}
