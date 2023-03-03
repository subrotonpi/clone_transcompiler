def _import ( ) : return _import ( None , Rank , '' , 1 << 20 )
class _import ( object ) :
    def __init__ ( self ) :
        self._import ( None , Rank , '' , 1 << 20 )
    def __repr__ ( self ) :
        return self._import ( None , Rank , '' , 1 << 20 )
    def uniform ( self ) :
        return float ( self._uniform ( ) )
    def write ( self , * o ) :
        print ( deeprepr ( o ) , file = self._outfile )
    def gcj ( test , s ) :
        print ( "Case #%d: %s" % ( test , s ) , file = self._outfile )
        print ( "Case #%d: %s" % ( test , s ) , file = self._outfile )
    def solve ( test ) :
        self._C = [ ]
        self._MOD = 100003
    def solve ( test ) :
        n = int ( self._C )
        dp = [ ]
        for t in dp :
            fill ( t , - 1 )
        res = 0
        for i in range ( 1 , n ) :
            res = ( res + get ( n , i ) ) % MOD
        gcj ( test , "%s" % res )
    def get ( n , k ) :
        if k == 1 :
            if n != 1 : return 1
            return 0
        if dp [ n ] [ k - 1 ] != - 1 : return dp [ n ] [ k - 1 ]
        res = 0
        for i in range ( 1 , k ) :
            if i == n : return 0
            res = ( res + get ( n , i ) ) % MOD
        gcj ( test , "%s" % res )
