def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        S = sc.read ( )
        if S [ - 1 ] == 'T' :
            print ( 'YES' )
        else :
            print ( 'NO' )
