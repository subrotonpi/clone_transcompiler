def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        num = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        num = [ i for i in num if i ]
        print ( num [ - 1 ] - num [ 0 ] )
