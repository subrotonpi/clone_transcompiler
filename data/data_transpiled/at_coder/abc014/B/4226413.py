def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.x = int ( self.x )
        self.nums = [ ]
        output = 0
        for i in range ( self.n ) :
            self.nums.append ( self.n )
        for i in range ( self.n ) :
            if self.x % math.pow ( 2 , i + 1 ) - self.x % math.pow ( 2 , i ) != 0 :
                output += self.nums [ i ]
        print ( output )
