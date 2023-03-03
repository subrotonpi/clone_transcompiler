def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        t = sc.readline ( )
        for i in range ( len ( s ) ) :
            s = s [ - 1 ] + s [ : - 1 ]
            if s == t :
                print ( "Yes" )
                sys.exit ( )
        print ( "No" )
