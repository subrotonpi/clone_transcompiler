def main ( ) :
    import sys
    from math import sin , cos
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    N , A , B = sys.argv [ 1 ] , sys.argv [ 2 ] , sys.argv [ 3 ]
    if N == 1 :
        if A == B :
            print ( "1" )
        else :
            print ( "0" )
    else :
        if A > B :
            print ( "0" )
        else :
            print ( long ( ( B - A ) * ( N - 2 ) + 1 ) )
