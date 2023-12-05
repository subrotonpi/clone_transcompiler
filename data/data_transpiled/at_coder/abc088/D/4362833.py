def main ( ) :
    import string
    import sys
    import random
    import sys
    h = random.randint ( 0 , h )
    w = random.randint ( 0 , w )
    a = [ ]
    b = [ ]
    black = 0
    queueh = deque ( )
    for c in string.ascii_uppercase :
        for j in range ( w ) :
            a.append ( c [ j ] )
            if a [ i ] [ j ] == '#' :
                black += 1
    start = [ 0 , 0 ]
    b.append ( 1 )
    queueh.append ( start )
    while a [ h - 1 ] [ w - 1 ] != '#' and not queueh.empty ( ) :
        now = queueh.popleft ( )
        i = now [ 0 ]
        j = now [ 1 ]
        if i != h - 1 and a [ i + 1 ] [ j ] != '#' :
            tmp = [ i + 1 , j ]
            queueh.append ( tmp )
            b [ i + 1 ] [ j ] = b [ i ] [ j ] + 1
            a [ i + 1 ] [ j ] = '#'
        if i != 0 and a [ i - 1 ] [ j ] != '#' :
            tmp = [ i - 1 , j ]
            queueh.append ( tmp )
            b [ i - 1 ] [ j ] = b [ i ] [ j ] + 1
            a [ i - 1 ] [ j ] = '#'
        if j != w - 1 and a [ i ] [ j + 1 ] != '#' :
            tmp = [ i , j + 1 ]
            queueh.append ( tmp )
            b [ i ] [ j + 1 ] = b [ i ] [ j ] + 1
            a [ i ] [ j ] = '#'
        if j != 0 and a [ i ] [ j ] != '#' :
            tmp = [ i , j ]
            queueh.append ( tmp )
            b [ i ] [ j ] = b [ i ] [ j ] + 1
            a [ i ] [ j ] = '#'
    if a [ h - 1 ] [ w - 1 ] != '#' :
        print ( - 1 )
        return
    print ( h