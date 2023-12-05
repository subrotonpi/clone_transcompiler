def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    sc = sys.stdin
    a = [ int ( i ) for i in next ( sc ) ]
    c = 0
    while 1 :
        a.sort ( )
        if a [ 0 ] == a [ 1 ] and a [ 1 ] == a [ 2 ] :
            break
        elif a [ 1 ] == a [ 2 ] :
            a [ 0 ] += 2
        else :
            a [ 0 ] += 1
            a [ 1 ] += 1
        c += 1
    print ( c )
