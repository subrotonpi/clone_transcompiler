def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        if a % 2 == 0 :
            print ( a / 2 )
        else :
            print ( a / 2 + 1 )
