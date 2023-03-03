def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.v = sys.stdin.read ( )
        sum = 0
        for i in range ( n ) :
            v [ i ] = sys.stdin.read ( )
            sum += v [ i ]
        res , x = sys.maxint , 0
        for i in range ( n - 1 ) :
            x += v [ i ]
            y = sum - x
            res = min ( abs ( x - y ) , res )
        print ( res )
