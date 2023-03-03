def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.N = sc.__next__ ( )
        self.K = sc.__next__ ( )
        self.t = [ [ sc.__next__ ( ) for i in range ( self.N ) ] for j in range ( self.K ) ]
    def isXOR ( self , depth , node , total ) :
        if depth == self.N :
            return ( ( node ^ total ) == 0 )
        for i in range ( self.K ) :
            if isXOR ( self , i , node ) :
                return True
        return False
