def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        c = sc.readline ( )
        for i in range ( len ( s ) ) :
            str = s [ i ] + s [ 0 : i ]
            if str == c :
                print ( "Yes" )
                return
        print ( "No" )
