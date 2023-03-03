def _import ( ) : return _fastopen ( )
class Main ( object ) :
    def __init__ ( self ) :
        sc = _fastopen ( )
        N = sc.read ( )
        n = N
        mod = 1000000000 + 7
        dp = [ ]
        dp.append ( 1 )
        dp.append ( N )
        for i in range ( 2 , N + 1 ) :
            dp.append ( sum [ i - 1 ] )
            dp [ i ] += mod - dp [ i - 2 ]
            dp [ i ] %= mod
            dp [ i ] += ( n - i + 2 )
            dp [ i ] %= mod
            dp [ i ] += ( n - 1 ) * ( n - 1 )
            dp [ i ] %= mod
        print ( dp [ N ] )
    def readline ( self ) :
        return self.readline ( )
    def readline ( self ) :
        return self.readline ( )
