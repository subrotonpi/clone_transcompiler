def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.Q = int ( self.Q )
        self.L = [ ]
        self.R = [ ]
        self.memo = { }
        for i in range ( self.M ) :
            self.L.append ( _main.get ( i ) )
            self.R.append ( _main.get ( i ) )
            self.memo [ self.L [ i ] ] [ R [ i ] ] += 1
        self.dp = [ [ 0 ] * ( self.N + 1 ) for i in range ( self.N + 1 ) ]
        for i in range ( 1 , self.N + 1 ) :
            for j in range ( 1 , self.N + 1 ) :
                self.dp [ i ] [ j ] = self.dp [ i ] [ j - 1 ] + self.memo [ i ] [ j ]
        for i in range ( 1 , self.Q + 1 ) :
            p = _main.get ( i )
            q = _main.get ( i )
            sum = 0
            for j in range ( p , q + 1 ) :
                sum += ( self.dp [ j ] [ q ] - self.dp [ j ] [ p - 1 ] )
            print ( sum )
