def main ( ) :
    import sys
    class Main ( object ) :
        def run ( self ) :
            with open ( "../../../api/" , "r" ) as f :
                n = f.read ( )
                k = f.read ( )
                A = [ f.read ( ) for i in range ( n ) ]
    A = [ 0 ] * 40
    ba = [ 0 ] * 40
    for i in range ( n ) :
        for j in range ( 40 ) :
            ba [ j ] += ( A [ i ] >> j ) & 1
    xors = [ ( 1 << j ) * ( ba [ j ] if ba [ j ] > n / 2 else ( n - ba [ j ] ) ) for j in range ( 40 ) ]
    ans = 0
    cur = 0
    for j in range ( 39 , - 1 , - 1 ) :
        if ( ( k >> j ) & 1 ) == 1 :
            tmp = cur + ba [ j ] * ( 1 << j )
            for i in range ( j ) :
                tmp += xors [ i ]
            ans = max ( ans , tmp )
            cur += ( n - ba [ j ] ) * ( 1 << j )
        else :
            cur += ba [ j ] * ( 1 << j )
    ans = max ( ans , cur )
    print ( ans )
