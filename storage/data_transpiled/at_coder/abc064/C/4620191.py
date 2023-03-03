def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        scn = sys.stdin
        N = scn.read ( )
        C = [ 0 ] * 9
        for i in range ( N ) :
            r = scn.read ( )
            if r > 3200 :
                C [ 8 ] += 1
            else :
                C [ r / 400 ] += 1
        min , max = 0 , 0
        for i in range ( 8 ) :
            if C [ i ] > 0 : min += 1
        max = min + C [ 8 ]
        if not min : min += 1
        print ( min , max )
