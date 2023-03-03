def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        T = [ ]
        sum = 0
        for i in range ( 1 , N + 1 ) :
            T.append ( int ( sc.readline ( ) ) )
            sum += T [ i ]
        M = sc.readline ( )
        for i in range ( M ) :
            time = sum - T [ int ( sc.readline ( ) ) ] + int ( sc.readline ( ) )
            print ( time )
