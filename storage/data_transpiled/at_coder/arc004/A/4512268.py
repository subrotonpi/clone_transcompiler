def import math
import sys
import math
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __call__ ( self , x , y ) :
        self.x = x
        self.y = y
    def __repr__ ( self ) :
        return "<%s>" % repr ( self.x )
    def __call__ ( self , x , y ) :
        self.x = x
        self.y = y
        self.x = x
        self.y = y
        self.y = y
        self.x = x
        self.y = y
        self.y = y
        self.counter = 0
        distance = [ ]
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                distance.append ( math.sqrt ( ( x [ i ] - x [ j ] ) ** 2 + ( y [ i ] - y [ j ] ) ** 2 ) )
                counter += 1
        max = 0.0
        for k in range ( self.N ** 2 ) :
            if max < distance [ k ] :
                max = distance [ k ]
        sys.stdout.write ( max )
