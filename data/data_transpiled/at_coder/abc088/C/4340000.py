def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , tan
    from math import cos , sin , tan , tan , pi
    from os import urandom
    g = [ [ sin ( i ) for i in range ( 3 ) ] for j in range ( 3 ) ]
    ans = True
    for i in range ( 2 ) :
        for j in range ( 2 ) :
            if g [ i ] [ j ] - g [ i + 1 ] [ j ] != g [ i ] [ j + 1 ] - g [ i + 1 ] [ j + 1 ] :
                ans = False
                break
            if g [ i ] [ j ] - g [ i ] [ j + 1 ] != g [ i + 1 ] [ j ] - g [ i + 1 ] [ j + 1 ] :
                ans = False
                break
    if ans :
        print ( "Yes" )
    else :
        print ( "No" )
