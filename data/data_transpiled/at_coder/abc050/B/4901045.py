def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        T = [ ]
        sum = 0
        for i in range ( 1 , N + 1 ) :
            T.append ( sc.readline ( ) )
            sum += T [ i ]
        M = sc.readline ( ).strip ( )
        for i in range ( M ) :
            time = sum - T [ sc.readline ( ).strip ( ) ] + sc.readline ( ).strip ( )
            print ( time )
