def _import ( ) :
    from itertools import islice
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , self.k , self.a = self.n , self.k , self.a
            print ( "Found" if self.a [ 0 ] == 0 else "Nothing" )
        def dfs ( self , d , x ) :
            return d == self.n , x == 0
    return Main
