def import _solve
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def __call__ ( self , x , h ) :
        self.h = [ ]
        self.s = [ ]
        hmax = 0
        smax = 0
        for i in range ( self.n ) :
            h.append ( x )
            s.append ( x )
            hmax = max ( hmax , h [ i ] )
            smax = max ( smax , s [ i ] )
        ans = _bin_search ( s , h , hmax + self.n * smax , - 1 )
        print ( ans )
    def bin_search ( self , s , h , ok , ng ) :
        while abs ( ok - ng ) > 1 :
            mid = ( ok + ng ) / 2
            if _solve ( mid , s , h ) :
                ok = mid
            else :
                ng = mid
        return ok
    def solve ( self , x , s , h ) :
        time = [ ]
        for i in range ( self.n ) :
            if x - h [ i ] < 0 :
                return False
            time.append ( ( x - h [ i ] ) / s [ i ] )
        time.sort ( )
        for i in range ( self.n ) :
            if time [ i ] < i :
                return False
        return True
