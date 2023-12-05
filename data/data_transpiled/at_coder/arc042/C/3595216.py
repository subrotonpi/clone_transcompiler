def _import ( ) : return long ( next ( ) )
def _import ( ) : return int ( next ( ) )
def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) :
    fc = _import ( )
    N , P = [ int ( i ) for i in range ( N ) ]
    S = [ Sweet ( fc ( ) , fc ( ) ) for i in range ( N ) ]
    print ( solve ( ) )
class _import ( ) :
    def _import ( ) :
        def _import ( ) :
            return S
    def _import ( ) :
        return _import ( )
def _solve ( ) :
    [ s for s in S if s.p ]
    DP_MAX = P + 105
    curr = [ 0 ] * DP_MAX
    prev = [ - 1 ] * DP_MAX
    curr.append ( 0 )
    for i in range ( N ) :
        t = curr
        curr = prev
        prev = t
        [ - 1 ] = 0
        s = S [ i ]
        for p in range ( DP_MAX - 1 , - 1 , - 1 ) :
            if prev [ p ] :
                curr [ p ] = max ( prev [ p ] , curr [ p ] )
                if p <= P :
                    curr [ p + s.p ] = max ( prev [ p ] + s.s , curr [ p + s.p ] )
    ans = - 1
    for p in range ( DP_MAX ) :
        ans = max ( curr [ p ] , ans )
    return ans
from itertools import repeat
from itertools import chain
from itertools import repeat
for i in repeat ( ) :
    _import next ( )
