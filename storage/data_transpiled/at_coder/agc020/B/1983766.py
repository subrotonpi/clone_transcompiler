def _ ( ) : return sys.stdin.read ( )
def solve ( ) :
    n = ni ( )
    a = [ ]
    for i in range ( 1 , n + 1 ) : a.append ( i )
    n = ni ( )
    for i in range ( n , 1 , - 1 ) :
        a.append ( i )
    n = ni ( )
    for i in range ( n , 1 , - 1 ) :
        x = int ( math.ceil ( l / ( 1.0 * a [ i ] ) ) * a [ i ] )
        y = ( r / a [ i ] ) * a [ i ]
        if x < l or y < l or x > r or y > r :
            print ( - 1 )
            return
        l = x
        r = a [ i ] - 1 + y
    print ( l , r )
    M = long ( 1e9 ) + 7
    if INPUT is None :
        INPUT = sys.stdin.read ( )
    else :
        INPUT = sys.stdout.write
    s = time.time ( )
    solve ( )
    print ( s )
    if not INPUT is None :
        tr ( time.time ( ) - s , 'ms' )
    def main ( ) :
        def inbuf ( ) :
            lenbuf , ptrbuf = 0 , 0
            while not ( isSpaceChar ( b ) ) :
                yield b
        return inbuf
    def isSpaceChar ( c ) :
        return not ( c >= 33 and c <= 126 )
    def skip ( ) :
        while ( b ) :
            yield b
        return b
    def nd ( ) :
        return float ( ns ( ) )
    return ns ( )
