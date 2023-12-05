def main ( ) :
    _sys.stdin.write ( "\n" )
    n , a , d = _sys.stdin.read ( ).split ( )
    d [ 1 ] = abs ( ( a [ 0 ] , _sys.stdin.read ( ) ) - ( a [ 1 ] , _sys.stdin.read ( ) ) )
    for i in range ( 2 , n ) :
        d [ i ] = min ( d [ i - 1 ] + abs ( a [ i - 1 ] - ( a [ i ] , _sys.stdin.read ( ) ) ) , d [ i - 2 ] + abs ( a [ i - 2 ] - a [ i ] ) )
    print ( d [ n - 1 ] )
