def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        X = sc.readline ( )
        t = sc.readline ( )
        if X - t <= 0 :
            print ( 0 )
        else :
            print ( X - t )
