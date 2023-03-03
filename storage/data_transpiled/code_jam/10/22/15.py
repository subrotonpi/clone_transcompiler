def import import sys
class B ( object ) :
    def __init__ ( self ) :
        self.cases = len ( sys.argv )
    for c in range ( 1 , cases + 1 ) :
        n , k , barnloc , targetTime = sys.argv [ c ]
        start = [ ]
        v = [ ]
        elect = [ ( start [ i ] + v [ i ] * targetTime >= barnloc ) for i in range ( n ) ]
        rem = k
        swaps = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if elect [ i ] :
                rem -= 1
            else :
                swaps += rem
            if not rem :
                break
        if not rem :
            print ( "Case #%d: %d" % ( c , swaps ) )
        else :
            print ( "Case #%d: IMPOSSIBLE" % c )
