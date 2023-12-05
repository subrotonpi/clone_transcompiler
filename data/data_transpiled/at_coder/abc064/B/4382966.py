def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        a.sort ( )
        print ( a [ N - 1 ] - a [ 0 ] )
