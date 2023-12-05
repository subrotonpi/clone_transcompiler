def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = 1
        self.n , self.m = _main.get ( self.n , self.m )
        self.connection = [ [ True for x in range ( self.n ) ] for y in range ( self.m ) ]
        self.connection [ x , y ] = [ True for x in range ( self.n ) ]
        self.connection [ y , x ] = [ True for x in range ( self.n ) ]
    def isConnected ( self ) :
        for i in range ( ( 1 , self.n ) ) :
            if self.isConnected ( i ) :
                self.ans = max ( self.ans , sum ( self.connection [ i ] ) )
        print ( self.ans )
    def isConnected ( self ) :
        for i in range ( self.n ) :
            for j in range ( i + 1 , self.n ) :
                if ( ( self.num >> i ) & 1 == 1 and ( self.num >> j ) & 1 == 1 and not self.connection [ i ] [ j ] ) :
                    return False
        return True
