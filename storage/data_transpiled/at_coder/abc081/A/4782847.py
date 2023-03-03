def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( )
        arr = a.split ( '' )
        s = 0
        if arr [ 0 ] == '1' :
            s += 1
        if arr [ 1 ] == '1' :
            s += 1
        if arr [ 2 ] == '1' :
            s += 1
        print ( s )
