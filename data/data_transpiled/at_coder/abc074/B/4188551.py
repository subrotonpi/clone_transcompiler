def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000007
    def __call__ ( self , * args ) :
        n = int ( args [ 0 ] )
        k = int ( args [ 1 ] )
        ans = 0
        for i in range ( n ) :
            x = _sys.argv [ i ]
            ans += 2 * min ( abs ( x - 0 ) , abs ( x - k ) )
        print ( ans )
