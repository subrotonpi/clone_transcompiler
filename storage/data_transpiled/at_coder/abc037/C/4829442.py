def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
    def nums ( self ) :
        return [ _sys.maxint ] * self.k
    def output ( self ) :
        for i in range ( self.n ) :
            self.nums [ i ] = _sys.maxint
        for i in range ( 1 , n ) :
            self.nums [ i ] += self.nums [ i - 1 ]
        for i in range ( self.n - k + 1 ) :
            self.output += self.nums [ k + i - 1 ] - ( self.nums [ i - 1 ] or 0 )
        print ( self.output )
