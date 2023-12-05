def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        sum = 0
        for i in range ( n ) :
            m = sc.readline ( ).strip ( )
            sum += max ( 0 , 80 - m )
        print ( sum )
