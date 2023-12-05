def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        p = 1l
        for i in range ( n ) :
            p = p * ( i + 1 ) % 1000000007
        print ( p )
