def main ( ) :
    import sys
    from itertools import product
    from itertools import chain
    N = len ( sys.stdin.readlines ( ) )
    H = len ( sys.stdin.readlines ( ) )
    a = [ ]
    b = [ ]
    max = 0
    cnt = 0
    for i in range ( N ) :
        a.append ( i )
        b.append ( i )
        max = max ( a [ i ] )
    b = chain ( a , b )
    x = N - 1
    while x >= 0 and b [ x ] > max and H > 0 :
        H -= b [ x ]
        x -= 1
        cnt += 1
    if H > 0 :
        cnt += H / max
        if H % max != 0 :
            cnt += 1
    print ( cnt )
