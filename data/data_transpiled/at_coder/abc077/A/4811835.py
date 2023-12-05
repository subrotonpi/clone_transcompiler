def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s , t = sc.readline ( ).split ( ' ' )
        print ( s [ 0 ] == t [ 2 ] and s [ 1 ] == t [ 1 ] and s [ 2 ] == t [ 0 ] )
