def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        a = 0
        min = 753
        for i in range ( len ( s ) - 2 ) :
            a = abs ( 753 - int ( s [ i : i + 3 ] ) )
            if a < min :
                min = a
        print ( min )
