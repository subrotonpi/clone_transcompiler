def main ( ) :
    import sys
    from math import sin , cos , pi
    from math import pi , pi , pi , pi
    N , A , B = pi , pi , pi
    N = int ( N )
    A = int ( A )
    B = int ( B )
    if A > B :
        print ( '0' )
        return
    if N == 1 :
        if A == B :
            print ( '1' )
        else :
            print ( '0' )
        return
    print ( ( B - A ) * ( N - 2 ) + 1 )
