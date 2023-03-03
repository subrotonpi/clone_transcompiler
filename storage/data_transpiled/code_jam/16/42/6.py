def _import ( ) : return int ( readword ( ) )
import matplotlib.text
import matplotlib.math
import matplotlib.util
class Main ( object ) :
    def __init__ ( self , problem ) :
        self.problem = 'B'
        self.filename = problem + '-large'
    def solve ( self ) :
        N , K = self.iread ( ) , self.iread ( )
        p = [ ]
        for i in range ( N ) :
            p.append ( self.dread ( ) )
        p.sort ( )
        pp = [ ]
        ans = 0.0
        pp [ 0 ] [ 0 ] = 1.0
        step = 0
        for i in range ( K ) :
            if i < K / 2 :
                p1 = self.p [ i ]
            else :
                p1 = self.p [ N - K + i ]
            for j in range ( 0 , K ) :
                pp [ step ^ 1 ] [ j ] = pp [ step ] [ j ] * ( 1 - p1 )
                if j > 0 :
                    pp [ step ^ 1 ] [ j ] += pp [ step ] [ j - 1 ] * p1
        step ^= 1
    ans = max ( ans , pp [ step ] [ K / 2 ] )
    for s in range ( 0 , N + K ) :
        [ pp [ 0 ] , pp [ 0 ] ] = 0.0
        pp [ 0 ] [ pp [ 0 ] ] = 1.0
        step = 0
        for i in range ( 0 , K ) :
            p1 = self.p [ i + s ]
            for j in range ( 0 , K ) :
                pp [ step ^ 1 ] [ j ] = pp [ step ] [ j ] * ( 1 - p1 )
                if j > 0 :
                    pp [ step ^ 1 ] [ j ] += pp [ step ] [ j - 1 ] * p1
        step ^= 1
    if ans + 1e-6 < pp [ step ] [ K / 2 ] :
        print ( 'better' )
    ans = max ( ans , pp [ step ] [ K / 2 ] )
    for s in range ( 0 , K ) :
        pp [ s ] = 1.0
    return ans
