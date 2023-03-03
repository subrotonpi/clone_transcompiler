def Main ( ) :
    s = ns ( )
    print ( dfs ( 0 , 0 , 1 , s ) )
    def dfs ( n , count , tight , s ) :
        if s in memo :
            return memo [ s ] [ count ] [ tight ]
        return table
    def ntable ( n , m ) :
        table = [ [ ni ( ) for i in range ( m ) ] for j in range ( n ) ]
        if i == len ( s ) :
            return count
        ret = 0
        e = s [ i ] - '0'
        for d in range ( 10 ) :
            if tight == 0 or d <= e :
                ret += dfs ( i + 1 , count + ( 1 if d == 1 else 0 ) , tight == 1 and d == e , s )
        memo [ i ] [ count ] [ tight ] = ret
        return ret
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = os.environ.get ( 'DEBUG' )
            if debug :
                with open ( sys.argv [ 1 ] , 'r' ) as f :
                    f.write ( '%.4f' % debug )
            f.seek ( 0 )
            solve ( )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    def na ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nl ( n ) :
        return int ( nl ( ) )
    def nl ( n ) :
        return int ( nl ( ) )
    return nl ( )
