def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.N = sc.__next__ ( )
        X = sc.__next__ ( )
        self.size = [ 1 ] * N + [ 3 ]
        self.patty = [ 1 ] * N + [ 1 ]
        for i in range ( 1 , N + 1 ) :
            self.size [ i ] = self.size [ i - 1 ] * 2 + 3
            self.patty [ i ] = self.patty [ i - 1 ] * 2 + 1
        print ( self.f ( N , X ) )
    def f ( self , n , x ) :
        if n == 0 : return 1
        if x == 1 : return 0
        if x <= ( self.size [ n ] - 1 ) / 2 :
            return self.f ( self.n - 1 , x - 1 )
        elif x == ( self.size [ n ] - 1 ) / 2 + 1 :
            return self.patty [ n - 1 ] + 1
        else :
            return self.patty [ n - 1 ] + 1 + self.f ( self.n - 1 , x - ( self.size [ n ] - 1 ) / 2 - 1 )
