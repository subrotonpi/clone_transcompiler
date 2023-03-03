def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        sum = 0
        for i in range ( N ) :
            a = sc.readline ( ).strip ( )
            b = sc.readline ( ).strip ( )
            sum += ( a * b )
        r = sum / 20
        print ( sum , r )
