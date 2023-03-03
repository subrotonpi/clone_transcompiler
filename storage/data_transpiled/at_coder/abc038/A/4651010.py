def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        str = sc.readline ( )
        if str [ - 1 ] == 'T' :
            print ( 'YES' )
        else :
            print ( 'NO' )
