def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        max = sc.readline ( ).strip ( )
        min = max
        for i in range ( n - 1 ) :
            s = sc.readline ( ).strip ( )
            if s > max :
                max = s
            elif s > min :
                min = s
        print ( max - min )
