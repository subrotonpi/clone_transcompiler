def import import _sys , sys
class Main ( object ) :
    def __init__ ( self ) :
        mod = 1000000007
        s = Scanner ( )
        def __init__ ( self ) :
            self.n , self.m = s.randint ( - 1 , 1 )
            a , b = [ ] , [ ]
            self.f ( a )
            self.f ( b )
            print ( "".join ( a ) )
            print ( "".join ( b ) )
            A , B = self.g ( n , a ) , self.g ( m , b )
            print ( A * B % mod )
    def f ( self ) :
        p = s.randint ( 0 , 1 )
        for i , q in enumerate ( self.a ) :
            a [ i ] = q - p
            p = q
    def g ( self , n , a ) :
        A = 0
        for i in range ( self.n ) :
            p = min ( i , self.n - 1 - i )
            A += ( ( p + 1 ) ** 2 + ( self.n - p * 2 ) ** 2 ) % mod * a [ i ]
            A %= mod
        return A
