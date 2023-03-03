def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        po = [ 0 ] * n
        for i in range ( m ) :
            po [ sc.readline ( ).strip ( ) ] += 1
            po [ sc.readline ( ).strip ( ) ] += 1
        for i in range ( n ) :
            print ( po [ i ] )
