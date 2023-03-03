def _import ( ) :
    from os import getpid
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( None , '' , os.getpid ( ) )
            self._import ( )
    MODULO = long ( 1e9 + 7 )
    n , c = os.fork ( )
    a = [ int ( i ) for i in range ( n ) ]
    b = [ int ( i ) for i in range ( n ) ]
    pow = [ [ 1 ] * 401 for i in range ( c + 1 ) ]
    sum = [ [ 0 ] * 401 for i in range ( c + 1 ) ]
    for i in range ( 0 , c + 1 ) :
        for j in range ( len ( pow [ i ] ) ) :
            pow [ i ] [ j ] = pow [ i - 1 ] [ j ] * j % MODULO
    f = [ [ 0 ] * 401 for i in range ( c + 1 ) ]
    for i in range ( 0 , c + 1 ) :
        f [ i ] [ 0 ] = g [ i ] [ 0 ]
    for i in range ( 1 , n ) :
        for j in range ( len ( pow [ i ] ) ) :
            pow [ i ] [ j ] += ( pow [ i ] [ j - 1 ] if j > 0 else 0 ) + pow [ i ] [ j ]
            if pow [ i ] [ j ] >= MODULO :
                pow [ i ] [ j ] -= MODULO
    g = [ [ 0 ] * 401 for i in range ( c + 1 ) ]
    for i in range ( 0 , c + 1 ) :
        for j in range ( n ) :
            g [ i ] [ j ] = sum [ i ] [ b [ j ] ] - ( sum [ i ] [ a [ j ] - 1 ] if j > 0 else 0 )
            g [ i ] [ j ] = ( g [ i ] [ j ] + MODULO ) % MODULO
    return g
