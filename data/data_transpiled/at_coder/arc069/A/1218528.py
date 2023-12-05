def main ( ) :
    import sys
    from math import ceil
    from math import sin
    from math import cos
    N = ceil ( sin ( sys.argv [ 1 ] ) )
    M = ceil ( sin ( sys.argv [ 2 ] ) )
    if M > N * 2 :
        surplus = M - N * 2
        print ( N + surplus / 4 )
    else :
        print ( M / 2 )
