def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.two = [ 1 ]
        for i in range ( 1 , N ) :
            self.two [ i ] = self.two [ i - 1 ] * 2
        self.xy = [ [ 0 ] * self.M for i in range ( self.M ) ]
        self.dp = [ 1 ] * self.M
        print ( self.res ( self.two [ self.N - 1 ] * 2 - 1 ) )
    def res ( self , bit ) :
        if self.dp [ bit ] > 0 :
            return self.dp [ bit ]
        for i in range ( self.N ) :
            if self.two [ i ] & bit :
                if self.admit ( bit - self.two [ i ] , i ) :
                    self.dp [ bit ] += self.res ( bit - self.two [ i ] )
        return self.dp [ bit ]
    def admit ( self , bit , k ) :
        for i in range ( self.N ) :
            if self.two [ i ] & bit :
                if self.xy [ i ] [ k ] == - 1 :
                    return False
        return True
