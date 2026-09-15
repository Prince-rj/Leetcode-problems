class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        i=0
        j=len(matrix)*len(matrix[0])-1
        while i<=j:
            mid=i+(j-i)//2
            a=mid//len(matrix[0])
            b=mid%len(matrix[0])
            if matrix[a][b]==target:
                return True
            elif matrix[a][b]<target:
                i=mid+1
            else: j=mid-1
        return False
        