def main ( ) :
    import sys
    from string import atoi
    from math import ceil
    from math import log
    from math import log
    from string import printable
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = int ( sys.stdin.read ( ) )
    A = len ( str ( N ) )
    B = 10
    have = N
    sum = 0
    for i in range ( ( A - 2 ) ) :
        B *= 10
    if N % B == 0 :
        sum = 10
        print ( sum )
        sys.exit ( 0 )
    sum = N / B
    for i in range ( N ) :
        have = have - ( have // B ) * B
        B /= 10
        if B == 0 :
            break
        sum += have // B
    print ( sum )
