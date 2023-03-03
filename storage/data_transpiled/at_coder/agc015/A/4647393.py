def main ( ) :
    import sys
    from time import sleep
    from math import sin , cos , cos , pi
    N , A , B = sys.argv [ 1 ] , sys.argv [ 2 ] , sys.argv [ 3 ]
    if B - A < 0 :
        print ( '0' )
        return
    if N == 1 :
        if A == B :
            print ( '1' )
        else :
            print ( '0' )
        return
    print ( ( B - A ) * ( N - 2 ) + 1 )
