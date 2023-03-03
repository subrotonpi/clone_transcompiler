def main ( ) :
    import sys
    from time import sleep
    sleep ( 1 )
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import sin , cos , log
    from math import log
    R = sin ( r )
    B = sin ( r )
    x = sin ( r )
    y = sin ( r )
    min = max = float ( 'inf' )
    for i in range ( 200 ) :
        judge = False
        mid = ( min + max ) / 2
        if R - mid >= 0 and B - mid >= 0 :
            if ( R - mid ) / ( x - 1 ) + ( B - mid ) / ( y - 1 ) >= mid :
                judge = True
        if judge :
            min = mid
        else :
            max = mid
    print ( min )
