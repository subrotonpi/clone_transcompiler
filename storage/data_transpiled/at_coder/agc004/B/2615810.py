def import import _sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = int ( sc.n )
        self.x = int ( sc.x )
        a = [ ]
        for i in range ( n ) :
            a.append ( sc.read ( ) )
        b = [ ]
        b.append ( int ( sc.read ( ) ) )
        ans = n * 1000000000.
        for magic in range ( n ) :
            for i in range ( n ) :
                b [ i ] = min ( b [ i ] , a [ ( i + n - magic ) % n ] )
            ans = min ( ans , magic * x + sum ( b ) )
        print ( ans )
