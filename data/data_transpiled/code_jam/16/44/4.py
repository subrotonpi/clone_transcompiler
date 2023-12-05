def _import ( ) : return int ( next ( sys.stdin ) )
def solve ( ) :
    n = randint ( 1 , 10000 )
    m = 0
    for i , s in enumerate ( next ( sys.stdin ) ) :
        for j in range ( n ) :
            m += ( s [ j ] - '0' ) << ( i * n + j )
    res = n ** 2
    for mm in ( 1 << ( n ** 2 ) ) :
        if mm & m == m :
            if check ( mm ) :
                res = min ( res , sum ( mm - m ) )
    return res
def check ( m ) :
    z = [ ]
    r = [ ]
    a = [ ]
    for i in range ( n ) :
        for j in range ( n ) :
            a.append ( ( m & ( 1 << ( i * n + j ) ) ) > 0 )
    res = bt ( )
    return res
def bt ( ) :
    for i in range ( n ) :
        if not z [ i ] :
            ok = False
            for j in range ( n ) :
                if a [ i ] [ j ] and not r [ j ] :
                    ok = True
                    z [ i ] = True
                    r [ j ] = True
                    if not bt ( ) : return False
                    z [ i ] = False
                    r [ j ] = False
            if not ok : return False
        return True
    def solve ( ) :
        n = randint ( 1 , 10000 )
        for i in range ( n ) :
            res = solve_test ( )
            print ( "Case #%d: %d" % ( i + 1 , res ) )
            print ( "Case #%d: %d" % ( i + 1 , res ) )
        return True
    return solve
