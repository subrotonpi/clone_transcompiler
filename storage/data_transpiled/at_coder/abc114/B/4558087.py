def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        res = sys.maxint
        for i in range ( len ( s ) - 2 ) :
            j = int ( s [ i : i + 3 ] )
            k = abs ( 753 - j )
            if res >= k :
                res = k
        print ( res )
