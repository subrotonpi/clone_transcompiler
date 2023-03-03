def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
    INF = 1000000007
    N = sys.maxsize
    M = sys.maxsize
    f = [ ]
    for i in range ( N ) :
        f.append ( sys.stdin.read ( ) )
    sys.stdin.close ( )
    dp = [ ]
    sum = [ ]
    last = [ ]
    dp.append ( 1 )
    sum.append ( 1 )
    min = 0
    for i in range ( 1 , N + 1 ) :
        min = max ( min , last [ f [ i - 1 ] ] )
        if min > 0 :
            dp.append ( ( sum [ i - 1 ] - sum [ min - 1 ] + INF ) % INF )
        else :
            dp.append ( sum [ i - 1 ] )
        sum.append ( ( sum [ i - 1 ] + dp [ i ] ) % INF )
        last [ f [ i - 1 ] ] = i
    print ( dp [ N ] )
