def main ( ) :
    def solve ( ) :
        d = ni ( )
        if d % 9 :
            print ( 0 )
            return
        d /= 9
        ret = 0
        p11 = 1
        for i in range ( 2 , 18 ) :
            tot = ( i % 2 == 1 )
            table = [ ]
            for i in range ( n ) :
                table.append ( ni ( ) )
        return table
    def dfs ( * o ) :
        if t == 0 :
            return a == 0
        v = ( a % 10 + 10 ) % 10
        ret = 0
        ret += ( 10 - v - first ) * dfs ( ( a - t * v ) // 10 , t // 100 , 0 )
        ret += ( v - first ) * dfs ( ( a + ( 10 - v ) * t ) // 10 , t // 100 , 0 )
        return ret
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = os.environ.get ( 'DEBUG' )
            if debug :
                with open ( sys.argv [ 1 ] , 'r' ) as f :
                    f.write ( str ( f.read ( ) ) )
            f.seek ( 0 )
            f.truncate ( )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    def na ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nl ( ) :
        return int ( nl ( ) )
    return na
