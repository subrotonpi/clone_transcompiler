def _import ( ) :
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( chain ( [ 0 ] , [ ] ) )
            self.D = [ ]
            self.Q = [ ]
        def readline ( self ) :
            if self.D is None or not self.Q :
                try :
                    return self.Q
                except AttributeError :
                    self.Q = [ ]
            return next ( self.Q )
        def __next__ ( self ) :
            return next ( self.Q )
        def write ( self , n ) :
            self.D = [ ]
            for i in range ( self.N ) :
                self.D.append ( next ( self.D ) )
            return next ( self.Q )
        def __next__ ( self ) :
            return next ( self.Q )
        def write ( self , n ) :
            self.Q = [ ]
            for i in range ( self.N ) :
                self.Q.append ( next ( self.Q ) )
            return next ( self.Q )
        def __next__ ( self ) :
            return next ( self.Q )
    def solve ( self ) :
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                if j != 0 :
                    self.D [ i ] [ j ] += self.D [ i ] [ j - 1 ]
        for j in range ( self.N ) :
            for i in range ( self.N ) :
                if i != 0 :
                    self.D [ i ] [ j ] += self.D [ i - 1 ] [ j ]
    R = [ - 1 ] * ( self.N + 1 )
    for h in range ( 1 , self.N + 1 ) :
        for w in range ( 1 , self.N + 1 ) :
            R [ h * w ] = max ( calc ( h , w ) , R [ h * w ] )
    M = [ ]
    for i in range ( 1 , self.N - 1 + 1 ) :
        M [ i ] = M [ i ]
    