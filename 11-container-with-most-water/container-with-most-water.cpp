class Solution {
public:
    int maxArea(vector<int>& height) {
        int i=0,j=height.size()-1;
        int area=0;
        while(i<j){
            int dis=j-i;
            int  a=dis*min(height[i],height[j]);
            area=max(area,a);
            if(height[i]<height[j])i++;
            else j--;

        }
        return area;
    }
};