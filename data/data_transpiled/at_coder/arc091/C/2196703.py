def import import sys , os , sys
from itertools import islice
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.a = sys.maxint
        self.b = sys.maxint
        if self.a + self.b > self.n + 1 or ( long ( self.a ) * self.b ) < long ( self.n ) :
            print ( - 1 )
            return
        c = 0
        for i in range ( 1 , self.a + 1 ) :
            num = min ( n - c - ( self.a - i ) , self.b )
            for j in islice ( i , self.a + i , self.b ) :
                print ( c + num - j , end = " " )
            c += num
