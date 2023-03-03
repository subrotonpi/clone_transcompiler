def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.w = sys.stdin.read ( )
        self.h = sys.stdin.read ( )
        self.n = sys.stdin.read ( )
    po = [ ]
    for a , b , c in itertools.product ( range ( n ) , range ( h ) ) :
        if c == 1 :
            for i in range ( h ) :
                for j in range ( a ) :
                    po.append ( [ i ] )
        elif c == 2 :
            for i in range ( h ) :
                for j in range ( a ) :
                    po [ i ] [ j ] = 1
        elif c == 3 :
            for i in range ( b ) :
                for j in range ( w ) :
                    po [ i ] [ j ] = 1
        else :
            for i in range ( b ) :
                for j in range ( w ) :
                    po [ i ] [ j ] = 1
    count = 0
    for i in range ( h ) :
        for j in range ( w ) :
            if po [ j ] [ i ] == 1 :
                count += 1
    print ( h * w - count )
