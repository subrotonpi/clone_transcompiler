def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        count = 0
        for i in range ( n ) :
            count += - sc.readline ( ).strip ( ) + sc.readline ( ).strip ( ) + 1
        print ( count )
