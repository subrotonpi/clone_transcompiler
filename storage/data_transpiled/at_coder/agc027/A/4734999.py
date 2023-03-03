def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    sc = sys.stdin
    n = int ( sc.readline ( ) )
    x = int ( sc.readline ( ) )
    a = [ chain ( [ int ( i ) for i in s.split ( ) ] , repeat ( n ) ) for s in range ( n ) ]
    a.sort ( )
    res = 0
    for i in range ( n - 1 ) :
        if a [ i ] <= x :
            x -= a [ i ]
            res += 1
        else :
            break
    if x == a [ - 1 ] :
        res += 1
    print ( res )
