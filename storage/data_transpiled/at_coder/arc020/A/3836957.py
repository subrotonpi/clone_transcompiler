def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = abs ( sc.read ( ) )
        b = abs ( sc.read ( ) )
        if a > b :
            print ( "Bug" )
        elif a < b :
            print ( "Ant" )
        else :
            print ( "Draw" )
