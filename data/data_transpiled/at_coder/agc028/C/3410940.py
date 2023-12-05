def _ ( ) : return sys.stdin
def solve ( ) :
    n = ni ( )
    p = [ [ ] for i in range ( n * 2 ) ]
    def tr ( * o ) :
        if o is not sys.stdin :
            print ( _eval ( o ) )
    def nd ( ) :
        return float ( next ( p ) )
    def na ( n ) :
        for i in range ( m ) :
            a = [ ]
            for j in range ( n ) :
                a.append ( ni ( ) )
        return a
    def ntable ( n , m ) :
        table = [ ]
        for i in range ( m ) :
            for j in range ( n ) :
                table.append ( [ ni ( ) , i ] )
        return table
    def tr ( * o ) :
        if o is not sys.stdin :
            print ( _eval ( o ) )
        return np.asarray ( [ ntable ( n , m ) ] )
    cnt = [ 0 ] * 3
    used = [ False ] * n
    ret = 0
    for i in range ( n ) :
        cnt [ p [ i ] [ 2 ] ] += 1
        ret += p [ i ] [ 1 ]
        if used [ p [ i ] [ 0 ] ] :
            cnt [ 2 ] += 1
        else :
            used [ p [ i ] [ 0 ] ] = True
    if cnt [ 0 ] != n and cnt [ 1 ] != n and cnt [ 2 ] == 0 :
        i = p [ n - 1 ] [ 0 ] if n != p [ n - 1 ] [ 0 ] else ( n + 1 , )
        j = p [ n - 2 ] [ 0 ] if n != p [ n - 2 ] [ 0 ] else ( n + 1 , )
        ret += min ( p [ i ] [ 1 ] - p [ n - 1 ] [ 1 ] , p [ j ] [ 1 ] - p [ n - 2 ] [ 1 ] )
    print ( ret )
def main ( ) :
    threading.Thread ( target = run ).start ( )
