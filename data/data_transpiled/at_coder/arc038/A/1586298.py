def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        A = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        A.sort ( )
        sum = 0
        for i in range ( N - 1 , - 2 , - 1 ) :
            sum += A [ i ]
        print ( sum )
