def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    scn = sys.stdin
    N = len ( scn )
    K = scn [ 0 ]
    P = chain ( [ scn [ 0 ] , scn [ 1 ] ] , [ ] )
    P.sort ( )
    ans = 0
    for i in range ( N ) :
        K -= P [ i ] [ 1 ]
        if K <= 0 :
            ans = P [ i ] [ 0 ]
            break
    print ( ans )
class Pair ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __lt__ ( self , other ) :
        if self.a > other.a : return 1
        if self.a < other.a : return - 1
        return 0
    def getA ( self ) :
        return self.a
    def getB ( self ) :
        return self.b
