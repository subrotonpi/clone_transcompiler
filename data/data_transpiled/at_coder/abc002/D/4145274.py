def import _itertools
import itertools
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        x = [ ]
        y = [ ]
        xy = [ [ ] for i in range ( M ) ]
        for i in range ( N ) :
            x.append ( self.N - 1 )
            y.append ( self.N - 1 )
            xy [ x [ i ] , y [ i ] ] = xy [ y [ i ] , x [ i ] ] = True
    ans = 1
    for i in range ( pow ( 2 , N ) ) :
        cnt = 0
        seen = set ( )
        for j in range ( N ) :
            if ( 1 & i >> j ) == 1 :
                seen.add ( j )
        cnt = len ( seen )
        for a in seen :
            for b in seen :
                if b == a :
                    continue
                if not xy [ a ] [ b ] :
                    cnt = 0
                    continue
        ans = max ( ans , cnt )
    print ( ans )
