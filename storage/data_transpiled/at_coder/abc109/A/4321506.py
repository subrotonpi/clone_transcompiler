def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if a * b % 2 :
            print ( "Yes" )
        else :
            print ( "No" )
