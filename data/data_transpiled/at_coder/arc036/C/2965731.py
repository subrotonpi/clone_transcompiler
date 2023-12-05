def _import ( ) : return sys.stdin.read ( )
def solve ( ) :
    n , k = ni ( ) , ni ( )
    s = ns ( )
    dp = [ [ ] for _ in range ( n + 1 ) ]
    dp = [ [ ] for _ in range ( n + 1 ) ]
    mod = long ( 1e9 ) + 7
    dp [ 0 ] [ 0 ] [ 1 ] = 1
    for i in range ( 1 , k ) :
        dp [ 0 ] [ i ] [ 0 ] = 1
    for i in range ( n ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , k ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , k ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 1 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 1 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 1 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 1 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 1 ] = 0
    for i in range ( 1 , n ) :
        dp [ i ] [ 1 ] = 0
    return dp
