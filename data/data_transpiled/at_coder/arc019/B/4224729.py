def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        count = 0
        for i in range ( len ( s ) / 2 ) :
            if s [ i ] != s [ - 1 - i ] :
                count += 1
    sum = 0
    if count == 0 :
        if len ( s ) == 1 :
            sum = 0
        elif len ( s ) % 2 == 1 :
            sum = 25 * ( len ( s ) - 1 )
        else :
            sum = 25 * len ( s )
    elif count == 1 :
        sum = 25 * len ( s ) - 2
    else :
        sum = 25 * len ( s )
    print ( sum )
