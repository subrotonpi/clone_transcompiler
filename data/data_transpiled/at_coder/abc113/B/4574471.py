def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        t = sc.readline ( ).strip ( )
        a = sc.readline ( ).strip ( )
        height = [ ]
        min = 1000
        index = 0
        for i in range ( n ) :
            height.append ( sc.readline ( ).strip ( ) )
            temp = t - height [ i ] * 0.006
            if abs ( a - temp ) < min :
                min = abs ( a - temp )
                index = i + 1
        print ( index )
