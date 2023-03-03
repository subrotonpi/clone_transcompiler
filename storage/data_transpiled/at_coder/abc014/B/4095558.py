def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        x = sc.readline ( ).strip ( )
        arr = [ ]
        sum = 0
        for i in range ( n ) :
            sum += x % 2 * sc.readline ( ).strip ( )
            x /= 2
        print ( sum )
