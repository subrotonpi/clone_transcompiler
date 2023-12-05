def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        a = [ 0 ] * ( n + 1 )
        for i in range ( m ) :
            a [ sc.readline ( ).strip ( ) ] += 1
            a [ sc.readline ( ).strip ( ) ] += 1
        for i in range ( 1 , n + 1 ) :
            print ( a [ i ] )
