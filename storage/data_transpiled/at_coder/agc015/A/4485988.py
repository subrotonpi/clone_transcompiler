def main ( ) :
    import sys
    from math import sin , cos
    from math import ceil
    N = int ( sys.stdin.read ( ) )
    A = int ( sys.stdin.read ( ) )
    B = int ( sys.stdin.read ( ) )
    if N == 1 :
        if A == B :
            print ( 1 )
        else :
            print ( 0 )
    else :
        if A > B :
            print ( 0 )
        else :
            print ( long ( B - A ) * ( N - 2 ) + 1 )
