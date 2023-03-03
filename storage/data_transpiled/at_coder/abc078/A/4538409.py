def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        x = sc.read ( )
        y = sc.read ( )
        if x < y :
            print ( "<" )
        elif x > y :
            print ( ">" )
        else :
            print ( "=" )
