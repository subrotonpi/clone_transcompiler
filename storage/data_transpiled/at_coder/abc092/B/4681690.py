def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = Scanner ( ).next ( )
        D = Scanner ( ).next ( )
        X = Scanner ( ).next ( )
        ans = 0
        for i in range ( N ) :
            t = Scanner ( ).next ( )
            cnt = 0
            while ( cnt * t ) + 1 <= D :
                ans += 1
                cnt += 1
        print ( ans , X )
