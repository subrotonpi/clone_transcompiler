def _ _ import _ _ ( ) : return int ( open ( '/dev/tty.py' ).read ( ) )
def get_int ( ) : return int ( open ( '/dev/tty.py' ).read ( ) )
def get_ins ( ) :
    s = open ( '/dev/tty.py' ).read ( ).split ( )
    r = [ int ( i ) for i in s ]
    return r
F = 10000
def docase ( ) :
    n = get_int ( )
    w = [ ]
    hit = [ False for i in get_ins ( ) ]
    for i in range ( n ) :
        w.append ( get_ins ( ) )
        for j in range ( 3 ) :
            hit [ w [ i ] [ j ] ] [ j ] = True
    r = 0
    for a in range ( 0 , F + 1 ) :
        if hit [ a ] [ 0 ] :
            cnt = [ False for i in range ( F + 2 ) if w [ i ] [ 0 ] <= a and a + w [ i ] [ 1 ] + w [ i ] [ 2 ] <= F ] :
                cnt [ w [ i ] [ 1 ] ] += 1
                cnt [ F - a - w [ i ] [ 2 ] + 1 ] -= 1
            s = 0
            for i in range ( 0 , F + 1 ) :
                s += cnt [ i ]
                r = max ( r , s )
    return r
def main ( ) :
    lim = get_int ( )
    for c in range ( 1 , lim + 1 ) :
        r = docase ( )
        print ( 'Case #%d: %d' % ( c , r ) )
