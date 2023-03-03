def import _iter_range
import __builtin__
import __builtin__
import __builtin__
class Main ( object ) :
    def __init__ ( self , v ) :
        __builtin__._ = __builtin__
    def REPS ( self , v ) :
        return __builtin__.range ( v )
    def REPS ( self , l , r ) :
        return __builtin__.range ( l , r )
    def INS ( self , n ) :
        return REPS ( self , n ) ( )
    def get_int ( self ) :
        return int ( self.s.readline ( ) )
    def main ( self , $ ) :
        n , k = get_int ( )
        v = s.readline ( )
        r = [ ]
        _v , _r = [ 0 ] * 26 , [ ]
        v.chars.reverse ( )
        _v = [ 0 ] * 26
        for i in range ( n ) :
            d = n - 1 - i + REPS ( len ( r ) ) ( lambda o : v [ o ] != r [ o ] )
            del _v [ i ]
            for c in range ( 26 ) :
                if _r [ c ] :
                    del _r [ c ]
                    if d + ( c != v [ i ] - 'a' and 1 or 0 ) - REPS ( 0 , 25 ) ( lambda o : min ( _v [ o ] , _r [ o ] ) ).sum ( ) <= k :
                        r.append ( chr ( ord ( 'a' ) + c ) )
                        break
                    del _r [ c ]
        print ( r )
