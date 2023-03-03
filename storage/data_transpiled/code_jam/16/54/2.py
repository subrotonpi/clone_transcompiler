def _import ( ) : return int ( next ( ) )
def solve ( ) :
    n = randint ( 0 , len ( self._import ) )
    l = randint ( 0 , len ( self._import ) )
    g = [ next ( ) for i in range ( n ) ]
    for i in range ( n ) :
        g.append ( self._import [ i ] )
    b = next ( )
    for i in range ( n ) :
        if g [ i ] == b :
            return "IMPOSSIBLE"
    x = ""
    for i in range ( l ) :
        x += '1' if b [ i ] == '0' else '0'
        x += "?"
    s = [ ]
    m = 0
    for i in range ( l ) :
        if i == 0 or b [ i ] != b [ i - 1 ] :
            s.append ( 1 )
            m += 1
        else :
            s [ m - 1 ] += 1
    y = ""
    c = b [ 0 ]
    for i in range ( m ) :
        for j in range ( s [ i ] - 1 ) :
            y += c
        if i < m - 1 :
            for j in range ( s [ i + 1 ] ) :
                y += '1' if c == '0' else '0'
            y += c
        c = '1' if c == '0' else '0'
    if not y :
        y += x [ 0 ]
        print ( "!!!!!" , x , y )
    if len ( x ) + len ( y ) > 200 :
        raise SystemExit
    if not x or not y :
        raise SystemExit
    return x , y
