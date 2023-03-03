def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        R = sc.read ( )
        G = sc.read ( )
        print ( 2 * G - R )
