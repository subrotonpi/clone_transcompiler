def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        h = sc.read ( )
        m = sc.read ( )
        print ( 18 * 60 - ( 60 * h + m ) )
