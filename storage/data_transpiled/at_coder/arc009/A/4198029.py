def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        sum = 0
        for i in range ( n ) :
            sum += sc.readline ( ) * sc.readline ( ).strip ( )
        print ( int ( sum * 1.05 ) )
