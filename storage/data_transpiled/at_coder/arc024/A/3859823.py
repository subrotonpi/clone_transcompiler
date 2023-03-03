def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        LL = sc.readline ( )
        RR = sc.readline ( )
        L = [ 0 for i in range ( 42 ) ]
        R = [ 0 for i in range ( 42 ) ]
        for i in range ( LL ) :
            L [ sc.readline ( ) ] += 1
        for i in range ( RR ) :
            R [ sc.readline ( ) ] += 1
        sum = 0
        for i in range ( 42 ) :
            sum += min ( L [ i ] , R [ i ] )
        print ( sum )
