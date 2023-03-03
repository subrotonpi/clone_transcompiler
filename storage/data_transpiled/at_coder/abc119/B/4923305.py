def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        sum = 0
        for i in range ( N ) :
            x = sc.readline ( ).strip ( )
            if 'JPY' in sc.readline ( ) :
                sum += x
            else :
                sum += x * 380000
        print ( sum )
