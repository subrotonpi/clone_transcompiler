def main ( ) :
    def solve ( ) :
        h , w = ni ( )
        map = [ [ ] for i in range ( h ) ]
        for i in range ( h ) :
            s = ns ( )
            for j in range ( w ) :
                map [ i ] [ j ] = 0 if s [ j ] == '.' else 1
    def ntable ( n , m ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( nl ( ) )
        return a
    def nlist ( n , m ) :
        for i in range ( h - 1 ) :
            for j in range ( w - 1 ) :
                s = map [ i ] [ j ] + map [ i ] [ j + 1 ] + map [ i + 1 ] [ j + 1 ]
        return table
    def nlist ( n , m ) :
        for i in range ( h - 1 ) :
            for j in range ( w - 1 ) :
                cnt [ i ] [ j ] = ( cnt [ i - 1 ] [ j ] if i > 0 else 0 ) + 1 if i > 0 else 0
        return map ( nlist , n , m )
    def ntr ( * o ) :
        if o != sys.stdin :
            print ( _repr ( o ) )
    cnt = [ ]
    for i in range ( h - 1 ) :
        for j in range ( w - 1 ) :
            cnt.append ( ( cnt [ i ] if cnt [ j ] else 0 ) + 1 )
    ret = max ( h , w )
    for i in range ( h - 1 ) :
        ret = max ( ret , max_rect ( cnt [ i ] ) )
    print ( ret )
    def max_rect ( a ) :
        n = len ( a )
        stack = [ ]
        p = 0
        max = 0
        for i in range ( n ) :
            o = p
            while p > 0 and stack [ p - 1 ] >= a [ i ] :
                p -= 1
                max = max ( max , long ( i - 1 - left [ p ] + 2 ) * ( stack [ p ] + 1 ) )
            if o == p :
            