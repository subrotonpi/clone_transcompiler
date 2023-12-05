def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if a % 3 == 0 or b % 3 == 0 or ( a + b ) % 3 == 0 :
            print ( "Possible" )
        else :
            print ( "Impossible" )
