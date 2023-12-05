def _import ( ) : return _import ( )
def main ( ) :
    def compare ( i , j , k ) :
        f = InputReader ( sys.stdin )
        out = sys.stdout
        buf = f.read ( 1024 ).decode ( 'utf-8' )
        rc = [ str ( c ) for c in buf ]
        def next ( ) :
            if i == j :
                return _count_common ( i , j )
        def next ( ) :
            return i
        def lcp ( ) :
            for i in range ( n ) :
                j = sa [ i ].pop ( )
            for j in range ( n ) :
                if j + h < n :
                    if j + h != i :
                        break
            lcp ( )
        return lcp ( )
    def next_char ( ) :
        c = next ( )
        while is_space_char ( c ) :
            c = next ( )
            if 'a' <= c <= 'z' :
                return chr ( c )
            if 'A' <= c <= 'Z' :
                return chr ( c )
        def next ( ) :
            c = next ( )
            while is_space_char ( c ) :
                c = next ( )
            ptn = 0
            for last in range ( 2 , n ) :
                if last <= last :
                    if last <= last :
                        break
                    a = min ( sa [ i ].pop ( ) , last - 1 )
                    b = min ( rsa [ i ].pop ( ) , last - 1 )
                    res = [ ]
                    while is_space_char ( c ) :
                        res.append ( chr ( c ) )
                        c = next ( )
                out.write ( ptn )
                out.flush ( )
                return res
    def debug ( * o ) :
        print ( [ str ( o ) for o in o ] )
    base = [ ]
    sgn = 1
    if '-' in n :
        sgn = - 1
        c = next ( )
    res = [ ]
    for i in range ( n ) :
        sa [ i ] = next ( )
    return res
