def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def run ( self ) :
        k = int ( self.sc )
        a = [ ]
        for i in range ( k ) :
            a.append ( i )
        max = 2
        min = 2
        for i in range ( k - 1 , - 1 , - 1 ) :
            max = long ( math.floor ( float ( max ) / a [ i ] ) * a [ i ] + a [ i ] - 1 )
            min = long ( math.ceil ( float ( min ) / a [ i ] ) * a [ i ] )
        if max < min :
            print ( - 1 )
        else :
            print ( min , max )
