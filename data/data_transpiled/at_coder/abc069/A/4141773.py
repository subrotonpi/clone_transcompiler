def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        self.n = sc.randint ( 1 , 100 )
        self.m = sc.randint ( 1 , 100 )
        print ( ( self.n - 1 ) * ( self.m - 1 ) )
