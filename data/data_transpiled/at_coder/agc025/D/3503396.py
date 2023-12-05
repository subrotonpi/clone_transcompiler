def main ( ) :
    n , d1 , d2 = ni ( )
    map1 = f ( n , d1 )
    map2 = f ( n , d2 )
    cnt = 0
    outer :
    for i in range ( n * 2 ) :
        for j in range ( n * 2 ) :
            if map1 [ i ] [ j ] and map2 [ i ] [ j ] :
                print ( i , j )
                if cnt == n * n :
                    break outer
    def ntable ( n , m ) :
        for j in range ( m ) :
            for i in range ( n ) :
                a [ j ] = ni ( )
        return a [ : n ]
    def ntable ( n , m ) :
        for j in range ( n ) :
            for i in range ( n ) :
                a [ j ] = ni ( )
        return [ ]
    def ntable ( n , m ) :
        for j in range ( m ) :
            for i in range ( n ) :
                if j % 2 == 0 and ( i // cell + j // cell ) % 2 == 0 :
                    ret [ i ] [ j ] = True
                elif j % 2 == 1 and i // cell % 2 == 0 :
                    ret [ i ] [ j ] = True
        return ret
    def dump ( map ) :
        n = len ( map )
        for i in range ( n ) :
            for j in range ( n ) :
                print ( 'o' if map [ i ] [ j ] else '.' , end = '' )
            print ( )
    def main ( ) :
        start = time.time ( )
        debug = sys.argv [ 1 ] if debug else None
        if debug :
            try :
                fp = _open ( _sys.argv [ 1 ] , 'r' )
            except :
                raise
            fp = _sys.stdout
        else :
            fp = _sys.stdout
        return fp , ntable , n , m
    def ntable ( n , m ) :
        for j in range ( m ) :
            if map1 [ i ] [ j ] and map2 [ i ] [ j ] :
                print ( i , j )