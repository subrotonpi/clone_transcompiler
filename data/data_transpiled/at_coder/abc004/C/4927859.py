def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.array = [ 1 , 2 , 3 , 4 , 5 , 6 ]
        n = self.array.count ( )
        n %= 30
        index = 0
        while index < n :
            i1 = index % 5
            i2 = index % 5 + 1
            temp = self.array [ i1 ]
            self.array [ i1 ] = self.array [ i2 ]
            self.array [ i2 ] = temp
            index += 1
        for num in self.array :
            print ( num , end = ' ' )
        print ( )
