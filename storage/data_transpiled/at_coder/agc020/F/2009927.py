def _import ( ) : return False
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.C = 0
        self.L = [ ]
    def tr ( self , * args ) :
        print ( [ str ( x ) for x in args ] )
    def main ( self ) :
        self.L.append ( [ ] )
    def tr ( * args ) :
        self.L.sort ( )
    ord = [ i for i in range ( self.N - 1 ) ]
    ans = 0
    dp = [ [ 0 ] * ( self.C + 1 ) for i in range ( self.C + 1 ) ]
    while True :
        for i in range ( len ( dp ) ) :
            for j in range ( len ( dp [ i ] ) ) :
                dp [ i ] [ j ] = 0
            dp [ L [ self.N - 1 ] * self.N - 1 ] [ 0 ] = 1
        for i in range ( self.N * C ) :
            if i % self.N == 0 : continue
            for s in range ( 1 << self.N - 1 ) :
                for j in range ( i - 1 , self.N * C + 1 ) :
                    if ( s >> i % self.N - 1 ) % 2 == 0 :
                        dp [ min ( self.N * C , max ( j , L [ ord [ i % self.N - 1 ] ] * self.N + i - 1 ) ) ] [ s ^ ( 1 << i % self.N - 1 ) ] += dp [ j ] [ s ]
        ans += dp [ self.N * C ] [ ( 1 << self.N - 1 ) - 1 ]
    next_permutation ( ord )
    for i in range ( 2 , self.N - 1 ) :
        ans /= i
    for i in range ( self.C ) :
        ans /= C
    print ( "%.40f" % ans )
