def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def main ( self ) :
        self.output = 0
        self.tmp = 0
        self.nums = [ ]
        for i in range ( self.n ) :
            self.nums.append ( self.nums [ i ] )
        self.nums.sort ( )
        for i in range ( self.n , 0 , - 1 ) :
            self.output += ( ( 1 if self.n - i ) % 2 == 0 else - 1 ) * math.pow ( self.nums [ i - 1 ] , 2 )
        print ( self.output * math.pi )
