def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        min , sa = 1000 , 0
        for i in range ( len ( s ) - 2 ) :
            sa = abs ( 753 - int ( s [ i : i + 3 ] ) )
            if min > sa :
                min = sa
        print ( min )
