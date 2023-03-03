def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        str = sc.readline ( )
        length = len ( str )
        min = sys.maxint
        for i in range ( length - 2 ) :
            tmp = int ( str [ i : i + 3 ] )
            min = min ( min , abs ( 753 - tmp ) )
        print ( min )
