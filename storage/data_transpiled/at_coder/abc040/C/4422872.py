def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        values = [ sc.choice ( n ) for i in range ( n ) ]
        cache = [ - 1 ]
        print ( cost ( n - 1 , values , cache ) )
    def cost ( self , values , cache ) :
        ans = None
        if cache [ - 1 ] is not None :
            return cache [ - 1 ]
        if self.i == 0 :
            ans = 0
        elif self.i == 1 :
            ans = abs ( values [ 1 ] - values [ 0 ] )
        else :
            a = cost ( self.i - 2 , values , cache ) + abs ( values [ - 2 ] - values [ - 2 ] )
            b = cost ( self.i - 1 , values , cache ) + abs ( values [ - 1 ] - values [ - 1 ] )
            ans = min ( a , b )
        if self.cache [ - 1 ] is None :
            self.cache [ - 1 ] = ans
        return ans
