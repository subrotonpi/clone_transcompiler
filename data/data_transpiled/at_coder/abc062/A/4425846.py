def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ - 1 , 0 , 2 , 0 , 1 , 0 , 1 , 0 , 0 , 1 , 0 , 1 , 0 , 1 , 0 ]
        x = sc.read ( )
        y = sc.read ( )
        if a [ x ] == a [ y ] :
            print ( "Yes" )
        else :
            print ( "No" )
