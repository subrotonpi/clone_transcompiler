def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( sc.read ( ) )
        b = int ( sc.read ( ) )
        if ( a * b ) % 2 == 0 :
            print ( "Even" )
        else :
            print ( "Odd" )
