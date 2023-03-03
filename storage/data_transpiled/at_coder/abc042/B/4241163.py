def _import ( ) :
    from itertools import repeat
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , self.l = repeat ( self.n )
        def __next__ ( self ) :
            return self.l
        def __next__ ( self ) :
            return self.n
        def __next__ ( self ) :
            return self.l
    n , l = [ n for n in repeat ( n ) ]
    s = [ s [ n ] for n in range ( n ) ]
    s = [ s [ n ] for n in range ( n ) ]
    print ( s )
