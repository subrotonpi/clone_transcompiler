def main ( srgs ) :
    import os
    from math import sin , cos , pi
    from os.path import join
    a = sin ( srgs [ 0 ] )
    b = sin ( srgs [ 1 ] )
    ans = 0
    for i in range ( 0 , a ) :
        c = sin ( srgs [ i ] )
        if abs ( c ) < abs ( c - b ) :
            ans += c * 2
        else :
            ans += abs ( c - b ) * 2
    print ( ans )
    os.system ( 'rm -rf ' + join ( srgs [ 1 ] , '.' ) )
