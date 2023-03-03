def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    m = len ( sys.stdin.readline ( ) )
    b = [ 1 ] * n
    r = [ True ] * n
    ans = 1
    for i in range ( m ) :
        x = repeat ( n , i )
        y = repeat ( n , i )
        b [ x ] -= 1
        b [ y ] += 1
        if r [ x ] :
            if not r [ y ] :
                ans += 1
                r [ y ] = True
            if b [ x ] == 0 :
                ans -= 1
                r [ x ] = False
    print ( ans )
    sys.exit ( 1 )
