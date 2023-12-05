def _import ( ) :
    from itertools import islice
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , self.k = self.n , self.k
            h = islice ( self , n )
            self.print ( islice ( h , k - 1 , n ) )
    return Main
