def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        count = 0
        a = [ sc.readline ( ).strip ( ) for i in range ( 1 , N + 1 ) ]
        for i in range ( 1 , N + 1 ) :
            if i == a [ i ] :
                count += 1
                i += 1
        print ( count )
