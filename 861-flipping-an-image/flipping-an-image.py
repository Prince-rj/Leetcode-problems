class Solution:
    def flipAndInvertImage(self, image: list[list[int]]) -> list[list[int]]:
        def flip(image):
            for i in range(len(image)):
                for j in range(len(image[0])//2):
                    tmp=image[i][j]
                    image[i][j]=image[i][len(image[0])-j-1]
                    image[i][len(image[0])-j-1]=tmp

            for i in range(len(image)):
                for j in range(len(image[0])):
                    image[i][j]=1-image[i][j]
            return image
        return flip(image)

        