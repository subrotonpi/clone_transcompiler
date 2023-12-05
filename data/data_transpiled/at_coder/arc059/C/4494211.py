def _ ( ) : return sys.stdin
def solve ( ) :
    n = ni ( )
    c = ni ( )
    a = na ( n )
    b = na ( n )
    max_ab = max ( [ i for i in a if i not in string.ascii_lowercase ] )
    def nlist ( n , m ) :
        for i in range ( m ) :
            for j in range ( n ) :
                p [ i ] [ j ] = 1
                for k in range ( j ) :
                    p [ i ] [ j ] *= i
                    p [ i ] [ j ] %= mod
    def nlist ( n , m ) :
        for i in range ( n ) :
            for j in range ( m ) :
                for k in range ( n ) :
                    p [ i ] [ j ] += p [ k ] [ j ]
                    x [ i ] [ j ] %= mod
    x = [ ]
    for i in range ( 1 , n + 1 ) :
        for j in range ( 0 , c + 1 ) :
            for k in range ( a [ i - 1 ] , b [ i - 1 ] + 1 ) :
                x [ i ] [ j ] += p [ k ] [ j ]
                x [ i ] [ j ] %= mod
    dp = [ ]
    dp.append ( 1 )
    for i in range ( 1 , n + 1 ) :
        for j in range ( 0 , c + 1 ) :
            for k in range ( 0 , c + 1 ) :
                dp [ i ] [ j + k ] += dp [ i - 1 ] [ j ] * x [ i ] [ k ]
                dp [ i ] [ j + k ] %= mod
    print ( dp [ n ] [ c ] )
