def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if abs ( b - a ) > 5 :
            print ( 10 - abs ( b - a ) )
        else :
            print ( abs ( b - a ) )
