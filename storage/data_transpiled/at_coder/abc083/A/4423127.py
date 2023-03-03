def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        l = sc.readline ( ).strip ( )
        r = sc.readline ( ).strip ( )
        if l > r :
            print ( "Left" )
        elif l == r :
            print ( "Balanced" )
        else :
            print ( "Right" )
