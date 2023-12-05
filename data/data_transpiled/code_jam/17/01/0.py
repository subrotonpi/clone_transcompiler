def _import ( ) :
    from os import urandom
    from os import O
    class A ( object ) :
        def _solve_test ( self ) :
            s = next ( iter ( [ O ( ) for _ in range ( 0 , len ( o ) ) ] ) )
            k = randint ( 0 , len ( o ) )
            res = 0
            for i in range ( 0 , len ( o ) - k ) :
                if o [ i ] == '-' :
                    res += 1
                    for j in range ( k ) :
                        o [ i + j ] = o [ i + j ] == '-' and o [ i + j ] == '+'
            for i in o :
                if o [ i ] == '-' :
                    return 'IMPOSSIBLE'
            return '%s' % res
        def solve ( self ) :
            n = randint ( 0 , len ( o ) )
            for i in range ( n ) :
                res = _solve_test ( )
                print ( 'Case #%d: %s' % ( i + 1 , res ) )
                out.write ( 'Case #%d: %s' % ( i + 1 , res ) )
    if sys.version_info [ 0 ] < 3 or not sys.version_info [ 1 ] :
        sys.stdout.write ( '' )
    else :
        sys.stdout.write ( '' )
    def main ( self ) :
        with open ( self.__file__ , 'r' ) as f :
            f.write ( str ( sys.stdin.read ( ) ) )
    def solve ( self ) :
        f.write ( '' )
        f.close ( )
    return solve
