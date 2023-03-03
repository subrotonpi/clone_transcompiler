def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
        if a [ 0 ] + a [ 1 ] == a [ 2 ] and a [ 0 ] - a [ 1 ] == a [ 2 ] :
            print ( "?" )
        elif a [ 0 ] + a [ 1 ] == a [ 2 ] :
            print ( "+" )
        elif a [ 0 ] - a [ 1 ] == a [ 2 ] :
            print ( "-" )
        else :
            print ( "!" )
